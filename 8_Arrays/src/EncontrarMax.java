
import java.util.Scanner;

public class EncontrarMax {

    public static void main(String[] args) {
        // Crear un array de 5 elementos enteros
        int[] numeros = new int[5];

        // Crear un escáner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese los números
        System.out.println("Por favor, ingresa 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar la variable max con el primer elemento del array
        int max = numeros[0];

        // Recorrer el array para encontrar el máximo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        // Imprimir el número máximo
        System.out.println("El número máximo es: " + max);

        scanner.close();
    }
}
