
import java.util.Scanner;

public class ejerLongSinEspacios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar una cadena
        System.out.println("Ingresa una cadena de texto:");
        String cadenaOriginal = scanner.nextLine();

        // Calcular la longitud de la cadena original
        int longitudOriginal = cadenaOriginal.length();

        // Eliminar los espacios en blanco de la cadena
        String cadenaSinEspacios = cadenaOriginal.replace(" ", "");

        // Calcular la longitud de la cadena sin espacios
        int longitudSinEspacios = cadenaSinEspacios.length();

        // Mostrar la longitud sin contar los espacios en blanco
        System.out.println("La longitud de la cadena con espacios es: " + longitudOriginal);
        System.out.println("La longitud de la cadena sin espacios es: " + longitudSinEspacios);
    }
}
