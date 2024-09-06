
import java.util.Scanner;

public class v1Buscando {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {5, 10, 15};

        System.out.println("Ingrese un número a buscar:");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;
        if (numeros[0] == numeroBuscado) {
            encontrado = true;
        }
        if (numeros[1] == numeroBuscado) {
            encontrado = true;
        }
        if (numeros[2] == numeroBuscado) {
            encontrado = true;
        }

        if (encontrado) {

            System.out.println("El número " + numeroBuscado + " está presente en el array.");

        } else {
            System.out.println("El número " + numeroBuscado + " no está presente en el array.");

        }
        // Cerrar el scanner
        scanner.close();

    }
}
