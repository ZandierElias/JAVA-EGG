
import java.util.Scanner;

public class actvLongCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase, por favor");
        String palabra = scanner.nextLine();

        System.out.println("La palabra o frase ingresada, tiene como longitud: " + palabra.length() + "  caracteres.");

        scanner.close();
    }
}
