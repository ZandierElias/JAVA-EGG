
import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, exponente;
        double resultado;
        try {
            System.out.println("Potencia");
            System.out.println("Necesitamos 2 Valores");
            System.out.print("Ingrese el numero base: ");
            base = scanner.nextInt();
            System.out.print("Ingrese el exponente: ");
            exponente = scanner.nextInt();

            resultado = Math.pow(base, exponente);
            System.out.print("El resultado de la operacion es: " + resultado);

        } catch (Exception e) {
            scanner.close();
            System.out.println("Error, ingrese un dato valido");

        }
    }
}
