
import java.util.Scanner;

public class ValorAbsoluto {

    public static void main(String[] args) {
        //Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculando valor absoluto");
        System.out.println("Ingrese un numero entero(negativo), por favor: ");
        int numero, absnumber;
        try {
            numero = scan.nextInt();
            absnumber = Math.abs(numero);
            System.out.println("El valor absoluto del numero ingresado es: " + absnumber);
        } catch (Exception e) {
            System.out.println("Error, ingreso un dato invalido");
        }
        scan.close();

    }

}
