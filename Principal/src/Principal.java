import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo.");

        System.out.println("Fecha y hora actual: " + obtenerFechaHora());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de usuarios: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        Usuario[] usuarios = crearUsuarios(cantidad);

        System.out.println("\nUsuarios creados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
        }
    }

    public static String obtenerFechaHora(){
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return hora.format(formatoHora);
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Ingrese el nombre del usuario " + (i + 1) + ": ");
            usuarios[i].nombre = scanner.nextLine();
            System.out.print("Ingrese los apellidos del usuario " + (i + 1) + ": ");
            usuarios[i].apellidos = scanner.nextLine();
            System.out.print("Ingrese el email del usuario " + (i + 1) + ": ");
            usuarios[i].email = scanner.nextLine();
        }
        return usuarios;
    }
}
