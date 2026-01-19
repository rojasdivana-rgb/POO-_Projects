package edu.divana.rojas.model;

/**
 * Representa un automóvil Lamborghini en el sistema de ventas.
 * Contiene información detallada sobre especificaciones técnicas y características del vehículo.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class Auto {
    /** Identificador único del automóvil */
    private int id;
    /** Modelo del vehículo (ej: Revuelto, Huracan Sterrato) */
    private String modelo;
    /** Marca del fabricante */
    private String marca;
    /** Precio del vehículo en dólares */
    private double precio;
    /** Color del vehículo */
    private String color;
    /** Año de fabricación */
    private int año;
    /** Descripción del motor */
    private String motor;
    /** Potencia del motor en caballos de fuerza */
    private String potencia;
    /** Velocidad máxima en km/h */
    private int velocidadMax;
    /** Descripción general del vehículo */
    private String descripcion;

    /**
     * Constructor del automóvil.
     *
     * @param id identificador del automóvil
     * @param modelo nombre del modelo
     * @param marca marca fabricante
     * @param precio precio en dólares
     * @param color color del vehículo
     * @param año año de fabricación
     * @param motor descripción del motor
     * @param potencia potencia en caballos de fuerza
     * @param velocidadMax velocidad máxima en km/h
     * @param descripcion descripción general del vehículo
     */
    public Auto(int id, String modelo, String marca, double precio, String color, int año, String motor, String potencia, int velocidadMax, String descripcion) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.año = año;
        this.motor = motor;
        this.potencia = potencia;
        this.velocidadMax = velocidadMax;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el identificador del automóvil.
     * @return id del automóvil
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del automóvil.
     * @param id identificador a establecer
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el modelo del vehículo.
     * @return nombre del modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     * @param modelo nombre del modelo a establecer
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene la marca del vehículo.
     * @return marca del fabricante
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * @param marca marca a establecer
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el precio del vehículo.
     * @return precio en dólares
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vehículo.
     * @param precio precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el color del vehículo.
     * @return color del vehículo
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     * @param color color a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el año de fabricación.
     * @return año de fabricación
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año de fabricación.
     * @param año año a establecer
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Obtiene la descripción del motor.
     * @return descripción del motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Establece la descripción del motor.
     * @param motor descripción del motor a establecer
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * Obtiene la potencia del motor.
     * @return potencia en caballos de fuerza
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * Establece la potencia del motor.
     * @param potencia potencia a establecer
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtiene la velocidad máxima del vehículo.
     * @return velocidad máxima en km/h
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * Establece la velocidad máxima del vehículo.
     * @param velocidadMax velocidad máxima a establecer
     */
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * Obtiene la descripción del vehículo.
     * @return descripción general del vehículo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del vehículo.
     * @param descripcion descripción a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Modelo: %s | Año: %d | Motor: %s | Potencia: %s | Velocidad: %d km/h | Precio: $%.2f", 
            id, modelo, año, motor, potencia, velocidadMax, precio);
    }
}
