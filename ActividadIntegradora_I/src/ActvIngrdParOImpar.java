
import java.util.Scanner;

public class ActvIngrdParOImpar {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //Solicita al usuario que ingrese un numero y almacena este valor en una variable
        System.out.print("Por favor ingresa un numero: ");
        int numero = number.nextInt();

        //Determinar si el numero ingresado es par o impar
        String parOimpar = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El numero es: " + parOimpar);
        number.close();
    }
}
