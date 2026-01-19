package edu.divana.rojas.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilidades para el formato y manejo de fechas.
 * Proporciona diferentes formatos estándar para presentar fechas y horas.
 *
 * @author Divana Rojas
 * @version 1.0
 */
public class FechaUtil {
    /** Formato de fecha y hora completo: dd/MM/yyyy HH:mm:ss */
    private static final DateTimeFormatter FORMATO_COMPLETO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    /** Formato de solo fecha: dd/MM/yyyy */
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    /** Formato de solo hora: HH:mm:ss */
    private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm:ss");

    /**
     * Formatea una fecha y hora con el formato completo.
     * @param dateTime fecha y hora a formatear
     * @return string con formato "dd/MM/yyyy HH:mm:ss"
     */
    public static String formatoCompleto(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_COMPLETO);
    }

    /**
     * Formatea una fecha con el formato de solo fecha.
     * @param dateTime fecha y hora a formatear
     * @return string con formato "dd/MM/yyyy"
     */
    public static String formatoFecha(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_FECHA);
    }

    /**
     * Formatea una hora con el formato de solo hora.
     * @param dateTime fecha y hora a formatear
     * @return string con formato "HH:mm:ss"
     */
    public static String formatoHora(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_HORA);
    }
}
