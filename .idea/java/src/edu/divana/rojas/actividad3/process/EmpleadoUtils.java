package edu.divana.rojas.actividad3.process;


public class EmpleadoUtils {
    public String nombre;
    public int edad;
    public String departamento;
    public String puesto;
    public double sueldo;

    public EmpleadoUtils(String nombre, int edad, String departamento, String puesto, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + puesto + " en " + departamento + ")";
    }
}
