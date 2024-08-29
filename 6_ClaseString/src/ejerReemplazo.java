
import java.util.Scanner;

public class ejerReemplazo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra por favor: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingrese un primer caracter (reemplazable): ");
        String caracter1 = scanner.nextLine();

        System.out.print("Ingrese un segundo caracter (reemplazo): ");
        String caracter2 = scanner.nextLine();

        System.out.println("La frase o palabra original es : " + cadena);
        System.out.println("La frase o palabra resultante es : " + cadena.replace(caracter1, caracter2));
        scanner.close();
        // podria declarse las variables como char y utilizar charAt como control 
    }
}
