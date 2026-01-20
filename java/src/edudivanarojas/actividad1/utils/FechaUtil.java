package edudivanarojas.actividad1.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase utilitaria para el manejo y formateo de fechas y horas.
 * Proporciona métodos estáticos para formatear fechas de manera consistente.
 *
 * @author Edudivania Rojas
 * @version 1.0
 */
public class FechaUtil {
    /** Formato estándar para las fechas: dd/MM/yyyy HH:mm:ss */
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /**
     * Formatea una fecha y hora con el formato estándar.
     *
     * @param fecha LocalDateTime a formatear
     * @return String con la fecha formateada en formato dd/MM/yyyy HH:mm:ss
     */
    public static String formatearFecha(LocalDateTime fecha) {
        return fecha.format(FORMATO);
    }

    /**
     * Obtiene la fecha y hora actual formateada.
     *
     * @return String con la fecha y hora actual en formato dd/MM/yyyy HH:mm:ss
     */
    public static String obtenerFechaActual() {
        return formatearFecha(LocalDateTime.now());
    }
}
