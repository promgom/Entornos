import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo.");

        System.out.println("Fecha y hora actual: " + obtenerFechaHora());
    }

    public static String obtenerFechaHora(){
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return hora.format(formatoHora);
    }
}
