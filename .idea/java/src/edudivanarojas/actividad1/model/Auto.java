package edudivanarojas.actividad1.model;

public class Auto {
    private int id;
    private String modelo;
    private String marca;
    private double precio;
    private String color;
    private int año;
    private String motor;
    private String potencia;
    private int velocidadMax;
    private String descripcion;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Modelo: %s | Año: %d | Motor: %s | Potencia: %s | Velocidad: %d km/h | Precio: $%.2f", 
            id, modelo, año, motor, potencia, velocidadMax, precio);
    }
}


