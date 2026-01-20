package edudivanarojas.actividad1.model;

public class Auto {
    private int id;
    private String modelo;
    private int año;
    private String motor;
    private int potenciaHP;
    private int velocidadMax;
    private double precio;
    private int cantidad;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPotenciaHP() {
        return potenciaHP;
    }

    public void setPotenciaHP(int potenciaHP) {
        this.potenciaHP = potenciaHP;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s (%d) - Motor: %s - Precio: $%.2f", id, modelo, año, motor, precio);
    }

    public String getDetalles() {
        return String.format("Modelo: %s\nAño: %d\nMotor: %s\nPotencia: %d HP\nVelocidad Máx: %d km/h\nPrecio: $%.2f",
                modelo, año, motor, potenciaHP, velocidadMax, precio);
    }
}
