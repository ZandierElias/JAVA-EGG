
import java.util.Scanner;

public class actvDivisibilidad {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //Solicitar que al usuario que ingrese un unumero
        System.out.print("Por favor, ingresa un numero: ");
        int number1 = number.nextInt();
        // El numero es divisible el por 5 y por 3 ?
        if (number1 % 5 == 0 && number1 % 3 == 0) {
            System.out.println("El numero es divisible por 5 y por 3.");
        } else if (number1 % 5 == 0) {
            System.out.println("El numero es divisible por 5.");
        } else if (number1 % 3 == 0) {
            System.out.println("El numero es divisible por 3.");
        } else {
            System.out.println("El numero no es divisible ni por 5 ni por 3.");
        }
        number.close();
    }
}
