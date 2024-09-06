
import java.util.Scanner;

public class v1EncontrarMax {

    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Crear un array para almacenar cinco números enteros
        int[] numeros = new int[5];
        // Ingresar los cinco números uno por uno
        System.out.println("Ingrese el primer número:");
        numeros[0] = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        numeros[1] = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        numeros[2] = scanner.nextInt();
        System.out.println("Ingrese el cuarto número:");
        numeros[3] = scanner.nextInt();
        System.out.println("Ingrese el quinto número:");

        int maximo = numeros[0];
        if (numeros[1] > maximo) {
            maximo = numeros[1];
        }
        if (numeros[2] > maximo) {
            maximo = numeros[2];
        }
        if (numeros[3] > maximo) {
            maximo = numeros[3];
        }
        if (numeros[4] > maximo) {
            maximo = numeros[4];
        }

        // Imprimir el máximo por consola
        System.out.println("El máximo es: " + maximo);
        // Cerrar el scanner
        scanner.close();
    }
}
