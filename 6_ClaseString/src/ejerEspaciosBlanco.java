
import java.util.Scanner;

public class ejerEspaciosBlanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase con espacios en blanco al principio y al final
        System.out.println("Ingresa una frase con espacios en blanco al principio y al final:");
        String fraseConEspacios = scanner.nextLine();

        // Eliminar los espacios en blanco al principio y al final usando trim()
        String fraseSinEspacios = fraseConEspacios.trim();

        // Mostrar la frase resultante
        System.out.println("Frase sin espacios en blanco al principio y al final: '" + fraseSinEspacios + "'");
        scanner.close();
    }

}
