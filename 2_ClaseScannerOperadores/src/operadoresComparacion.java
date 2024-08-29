
import java.util.Scanner;

public class operadoresComparacion {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        // Pide al usuario que ingrese dos numeros 
        System.out.print("Ingresa un numero entero: ");
        int numero1 = numeros.nextInt();

        System.out.print("Ingresa otro numero entero: ");
        int numero2 = numeros.nextInt();

        // Compara si el primer numero ingresado es mayor que el segundo
        String esMayor = (numero1 > numero2) ? "es mayor" : "no mayor";
        System.out.println("El numero " + numero1 + " es mayor a " + numero2 + " ? = " + esMayor);

        // Verifica si el primer numero ingresado es distinto al segundo numero 
        String esDistinto = (numero1 != numero2) ? "diferente" : "igual";
        System.out.println("El numero " + numero1 + " es distinto a " + numero2 + " ? = " + esDistinto);

        // Verifica si el primer numero ingresado es divisible por 2 
        String esDivisible = (numero1 % 2 == 0) ? "divisible" : "no divisible";
        System.out.println("El numero " + numero1 + " es divisible por 2 ? = " + esDivisible);

        // Pide al usuario que ingrese otros dos numeros 
        System.out.println("Por favor ingresa el tercer numero: ");
        int numero3 = numeros.nextInt();

        System.out.println("Por favor ingresa el cuarto numero: ");
        int numero4 = numeros.nextInt();

        //Valida si el numero 1 es mayor que el numero 2 y si el numero 3 es mayor que el numero 4
        String mayorAnd = (numero1 > numero2) && (numero3 > numero4) ? "Si son mayores" : "No son mayores";
        System.out.println("El numero 1 y el numero 3 " + mayorAnd + " a comparacion del numero 2 y numero 4, respectivamente");

        // Valida si el numero 1 es mayor que el numero 2 O si el numero 3 es mayor al numero 4
        String mayor1 = (numero1 > numero2) ? "mayor" : "no mayor";
        String mayor3 = (numero3 > numero4) ? "mayor" : "no mayor";
        System.out.println("El numero 1 es " + mayor1 + " que el numero 2 o el numero 3 es " + mayor3 + " que el numero 4.");
        numeros.close();

    }
}
