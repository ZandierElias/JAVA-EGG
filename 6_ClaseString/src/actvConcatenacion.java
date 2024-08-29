
import java.util.Scanner;

public class actvConcatenacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre.concat(" " + apellido);
        System.out.println("Su nombre completo es : " + nombreCompleto);

        scanner.close();

    }

}
