package edudivanarojas.actividad1.model;

/**
 * Clase que representa un cliente en el sistema de ventas.
 * Almacena la información de contacto del cliente.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class Cliente {
    private String nombre;
    private String telefono;
    private String email;

    /**
     * Constructor que crea un nuevo cliente con sus datos de contacto.
     *
     * @param nombre   Nombre completo del cliente
     * @param telefono Número telefónico del cliente
     * @param email    Dirección de correo electrónico del cliente
     */
    public Cliente(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre Nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono del cliente.
     *
     * @return Número telefónico del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     *
     * @param telefono Nuevo número telefónico del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     *
     * @return Dirección de correo electrónico del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del cliente.
     *
     * @param email Nueva dirección de correo electrónico del cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devuelve una representación en string del cliente con su información de
     * contacto.
     *
     * @return String con formato: Cliente: nombre | Tel: teléfono | Email: email
     */
    @Override
    public String toString() {
        return String.format("Cliente: %s | Tel: %s | Email: %s",
                nombre, telefono, email);
    }
}
