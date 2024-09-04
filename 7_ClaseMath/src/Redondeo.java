
import java.util.InputMismatchException;
import java.util.Scanner;

public class Redondeo {

    public static void main(String[] args) {
        //Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
        Scanner scanner = new Scanner(System.in);

        double numberUsuario, valorRedondeo;
        try {
            System.out.println("Redondeando numeros ");
            //                             solo positivo o tmbn negativo
            System.out.print("Ingrese un numero decimal, por favor: ");
            numberUsuario = scanner.nextDouble();
            valorRedondeo = Math.round(numberUsuario);
            //imprimir
            System.out.println("Numero ingresado: " + numberUsuario);
            System.out.println("Numero redondeado: " + valorRedondeo);
        } catch (InputMismatchException e) {

            System.out.println("Error, ingresó un dato inválido");
        }
        scanner.close();

    }
}
