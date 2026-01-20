package edudivanarojas.actividad1.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaUtil {
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static String formatearFecha(LocalDateTime fecha) {
        return fecha.format(FORMATO);
    }

    public static String obtenerFechaActual() {
        return formatearFecha(LocalDateTime.now());
    }
}
