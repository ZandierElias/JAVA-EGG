
import java.util.Scanner;

public class actvSubCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase o palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese el indice inicial: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el indice final: ");
        int numero2 = scanner.nextInt();

        String subCadena = palabra.substring(numero1, numero2);

        System.out.println("Subcadena: " + subCadena);
        scanner.close();
    }
}
