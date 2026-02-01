package edu.divana.rojas.actividad3.process;

import java.util.*;
public class MenorSalarioYEdad {

/**
 * Devuelve un empleado que:
 * 1. Tiene el salario MÁS BAJO de toda la lista
 * 2. Su edad es una de las edades con MENOR frecuencia (menos común)
 *
 * Si hay varios con salario mínimo → elige el que tenga la edad menos frecuente
 * Si hay empate en frecuencia → devuelve cualquiera (el primero encontrado)
 *
 * @return empleado que cumple ambas condiciones o null si la lista es null/vacía
 */
public static EmpleadoUtils empleadoMenorSalarioConEdadMenosComun(List<EmpleadoUtils> empleados) {
    if (empleados == null || empleados.isEmpty()) {
        return null;
    }

    // 1. Encontrar el salario mínimo
    int salarioMinimo = Integer.MAX_VALUE;
    for (EmpleadoUtils e : empleados) {
        if (e.sueldo < salarioMinimo) {
            salarioMinimo = (int) e.sueldo;
        }
    }

    // 2. Contar frecuencia de cada edad (solo de los empleados con salario mínimo)
    Map<Integer, Integer> frecuenciaEdad = new HashMap<>();
    List<EmpleadoUtils> candidatos = new ArrayList<>();

    for (EmpleadoUtils e : empleados) {
        if (e.sueldo == salarioMinimo) {
            candidatos.add(e);
            int edad = e.edad;
            frecuenciaEdad.put(edad, frecuenciaEdad.getOrDefault(edad, 0) + 1);
        }
    }

    if (candidatos.isEmpty()) {
        return null; // aunque no debería pasar si hay empleados
    }

    // 3. Encontrar la frecuencia mínima entre las edades de los candidatos
    int frecuenciaMinima = Integer.MAX_VALUE;
    for (int freq : frecuenciaEdad.values()) {
        if (freq < frecuenciaMinima) {
            frecuenciaMinima = freq;
        }
    }

    // 4. Elegir uno de los candidatos cuya edad tenga esa frecuencia mínima
    for (EmpleadoUtils candidato : candidatos) {
        int freq = frecuenciaEdad.get(candidato.edad);
        if (freq == frecuenciaMinima) {
            return candidato; // devolvemos el primero que cumpla
        }
    }

    // En teoría nunca debería llegar aquí
    return candidatos.get(0);
}

}