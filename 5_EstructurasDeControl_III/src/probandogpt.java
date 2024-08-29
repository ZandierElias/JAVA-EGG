
import java.util.Scanner;

public class probandogpt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar el primer número al usuario
            System.out.print("Ingrese el primer número: ");
            String input1 = scanner.nextLine();
            int numero1 = Integer.parseInt(input1);  // Convertir el primer número

            // Solicitar el segundo número al usuario
            System.out.print("Ingrese el segundo número: ");
            String input2 = scanner.nextLine();
            int numero2 = Integer.parseInt(input2);  // Convertir el segundo número

            // Realizar la resta
            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es un número entero válido
            System.out.println("Error: Por favor, ingrese números enteros válidos.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
