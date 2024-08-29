
import java.util.InputMismatchException;
import java.util.Scanner;

public class actvRestaExecp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer numero: ");
            int numero1 = scanner.nextInt();
            System.out.print("Ingresa el segundo numero : ");
            int numero2 = scanner.nextInt();

            int resta = numero1 - numero2;
            System.out.println("La resta es: " + resta);

        } catch (InputMismatchException exception) {
            System.out.println("Error: Ingrese datos de valor numerico, por favor. ");

        } finally {
            scanner.close();

        }
    }
}
