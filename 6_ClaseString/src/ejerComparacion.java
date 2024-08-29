
import java.util.Scanner;

public class ejerComparacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comparacion de Cadenas ");
        System.out.println("Ingrese una palabra por favor: ");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese una seguna palabra: ");
        String palabra2 = scanner.nextLine();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras ingresadas son iguales");

        } else {
            System.out.println("Las palabras ingresadas son diferentes ");
        }
        scanner.close();
    }
}
