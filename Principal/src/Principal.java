import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hola mundo.");

        System.out.println("Fecha y hora actual: " + obtenerFechaHora());

        System.out.print("Ingrese la cantidad de usuarios: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        Usuario[] usuarios = crearUsuarios(cantidad);

        System.out.println("--------------------");
        System.out.println("Usuarios");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + "\nApellidos: " + usuario.apellidos + "\nEmail: " + usuario.email);
        }
    }

    public static String obtenerFechaHora(){
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return hora.format(formatoHora);
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Nombre del usuario "+(i+1)+": ");
            usuarios[i].nombre = teclado.nextLine();
            System.out.print("Apellidos del usuario "+(i+1)+": ");
            usuarios[i].apellidos = teclado.nextLine();
            System.out.print("Email del usuario " + (i + 1) + ": ");
            usuarios[i].email = teclado.nextLine();
        }
        return usuarios;
    }
}
