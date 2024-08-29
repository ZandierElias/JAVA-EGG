
import java.util.InputMismatchException;
import java.util.Scanner;

public class actvDivisionSegura {

    public static void main(String[] args) {
        //Scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Division Segura");
        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        int division;
        try {
            division = numero1 / numero2;
            System.out.println("El resuiltado de la operacion es: " + division); // habria diferencia entre colocarlo dentro o fuera del bloque try-catch

        } catch (ArithmeticException e) {
            System.out.println("No es posible dividir por cero");
        } catch (InputMismatchException e) {
            System.out.println("Has ingresado un valor no válido");
        } catch (Exception e) {
            System.out.println("Error, no se puede realizar la operacion");
        }
        scanner.close();
    }
}
