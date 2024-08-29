
import java.util.Scanner;

public class actvConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena  que represente un numero entero: ");
        String input = scanner.nextLine();
        //Cual es la razon de hacer esto? Si coloco un numero se realiza el try pero si pongo cualquier caracter me lleva 
        // al error, eso es la finalidad? Se puede cambiar un string a numero ?
        try {
            // Intentar convertir la cadena a un número entero
            int numero = Integer.parseInt(input);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la cadena no es un número entero válido
            System.out.println("Error: La cadena ingresada no es un número entero válido.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}
