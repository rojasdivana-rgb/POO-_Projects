package edu.divana.rojas.model;

/**
 * Representa un cliente en el sistema de ventas de Lamborghini.
 * Almacena información de contacto y datos personales del cliente.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class Cliente {
    /** Nombre del cliente */
    private String nombre;
    /** Apellido del cliente */
    private String apellido;
    /** Número de teléfono del cliente */
    private String telefono;
    /** Correo electrónico del cliente */
    private String email;
    /** Número de cédula o identificación del cliente */
    private String cedula;

    /**
     * Constructor del cliente.
     *
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param telefono número de teléfono
     * @param email correo electrónico
     * @param cedula número de cédula o identificación
     */
    public Cliente(String nombre, String apellido, String telefono, String email, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * @return apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente.
     * @param apellido apellido a establecer
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el teléfono del cliente.
     * @return número de teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     * @param telefono número de teléfono a establecer
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el email del cliente.
     * @return correo electrónico
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del cliente.
     * @param email correo electrónico a establecer
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la cédula del cliente.
     * @return número de cédula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cédula del cliente.
     * @param cedula número de cédula a establecer
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre completo del cliente.
     * @return nombre y apellido concatenados
     */
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    /**
     * Retorna una representación textual del cliente.
     * @return descripción del cliente en formato texto
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
