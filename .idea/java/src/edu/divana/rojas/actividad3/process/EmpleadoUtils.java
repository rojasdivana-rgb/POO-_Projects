package edu.divana.rojas.actividad3.process;


public class EmpleadoUtils {
    // Atributos básicos del empleado
    public String nombre;
    public int edad;
    public String departamento;
    public String puesto;
    public double sueldo;

    // Constructor para inicializar los atributos del empleado
    public EmpleadoUtils(String nombre, int edad, String departamento, String puesto, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    // Método getter para obtener la edad del empleado
    public int getEdad() {
        return edad;
    }

    // Representación en texto del objeto EmpleadoUtils
    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + puesto + " en " + departamento + ")";
    }
}