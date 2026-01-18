package edu.divana.rojas.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaUtil {
    private static final DateTimeFormatter FORMATO_COMPLETO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static String formatoCompleto(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_COMPLETO);
    }

    public static String formatoFecha(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_FECHA);
    }

    public static String formatoHora(LocalDateTime dateTime) {
        return dateTime.format(FORMATO_HORA);
    }
}
