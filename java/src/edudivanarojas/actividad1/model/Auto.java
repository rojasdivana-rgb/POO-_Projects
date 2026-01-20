package edudivanarojas.actividad1.model;

/**
 * Clase que representa un vehículo (Auto) en el sistema de ventas.
 * Contiene información sobre las características técnicas y precio del
 * vehículo.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class Auto {
    private int id;
    private String modelo;
    private int año;
    private String motor;
    private int potenciaHP;
    private int velocidadMax;
    private double precio;
    private int cantidad;

    /**
     * Constructor que crea un nuevo vehículo con sus características.
     *
     * @param id           Identificador único del vehículo
     * @param modelo       Modelo del vehículo
     * @param año          Año de fabricación
     * @param motor        Descripción del motor
     * @param potenciaHP   Potencia en caballos de fuerza (HP)
     * @param velocidadMax Velocidad máxima en km/h
     * @param precio       Precio del vehículo en dólares
     */
    public Auto(int id, String modelo, int año, String motor, int potenciaHP, int velocidadMax, double precio) {
        this.id = id;
        this.modelo = modelo;
        this.año = año;
        this.motor = motor;
        this.potenciaHP = potenciaHP;
        this.velocidadMax = velocidadMax;
        this.precio = precio;
        this.cantidad = 1;
    }

    /**
     * Obtiene el identificador único del vehículo.
     *
     * @return El ID del vehículo
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador del vehículo.
     *
     * @param id Nuevo ID del vehículo
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el modelo del vehículo.
     *
     * @return El modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo Nuevo modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el año de fabricación.
     *
     * @return Año de fabricación
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece el año de fabricación.
     *
     * @param año Nuevo año de fabricación
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Obtiene la descripción del motor.
     *
     * @return Descripción del motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * Establece la descripción del motor.
     *
     * @param motor Nueva descripción del motor
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * Obtiene la potencia en caballos de fuerza.
     *
     * @return Potencia en HP
     */
    public int getPotenciaHP() {
        return potenciaHP;
    }

    /**
     * Establece la potencia en caballos de fuerza.
     *
     * @param potenciaHP Nueva potencia en HP
     */
    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    /**
     * Obtiene la velocidad máxima del vehículo.
     *
     * @return Velocidad máxima en km/h
     */
    public int getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * Establece la velocidad máxima del vehículo.
     *
     * @param velocidadMax Nueva velocidad máxima en km/h
     */
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * Obtiene el precio del vehículo.
     *
     * @return Precio en dólares
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del vehículo.
     *
     * @param precio Nuevo precio en dólares
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad de este vehículo disponible.
     *
     * @return Cantidad disponible
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de este vehículo disponible.
     *
     * @param cantidad Nueva cantidad disponible
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve una representación en string del vehículo con información básica.
     *
     * @return String con formato: [ID] Modelo (Año) - Motor: descripción - Precio:
     *         $precio
     */
    @Override
    public String toString() {
        return String.format("[%d] %s (%d) - Motor: %s - Precio: $%.2f", id, modelo, año, motor, precio);
    }

    /**
     * Obtiene los detalles completos del vehículo.
     *
     * @return String con información detallada del vehículo
     */
    public String getDetalles() {
        return String.format("Modelo: %s\nAño: %d\nMotor: %s\nPotencia: %d HP\nVelocidad Máx: %d km/h\nPrecio: $%.2f",
                modelo, año, motor, potenciaHP, velocidadMax, precio);
    }
}
