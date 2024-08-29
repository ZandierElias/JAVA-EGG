
import java.util.Scanner;

public class operacionesBasicas {

    public static void main(String[] args) {
        //Actividad:Operaciones Básicas
        int numero1 = 10;
        int numero2 = 25;
        //Suma
        int resultadoSuma = numero1 + numero2;
        System.out.println("El resultado de la operacion es: " + resultadoSuma);
        //Resta
        int resultadoResta = numero1 - numero2;
        System.out.println("El resultado de la operacion es: " + resultadoResta);
        //Multiplicacion 
        int resultadoMulti = numero1 * numero2;
        System.out.println("El resultado de la operacion es: " + resultadoMulti);
        //Division
        int resultadoDiv = numero2 / numero1;
        System.out.println("El resultado de la operacion es: " + resultadoDiv);
        //Módulo
        int resultadoMod = numero2 % numero1;
        System.out.println("El resultado de la operacion es: " + resultadoMod);
        //
        int num1 = 1000;
        int num2 = 43045;
        System.out.println("Respuesta: " + (num1 + num2));
        System.out.println("Respuesta: " + (num1 * num2));
        System.out.println("Respuesta: " + (num1 - num2));
        System.out.println("Respuesta: " + (num1 / num2));
        //Operacion en Consola
        Scanner operaciones = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numeroOne = operaciones.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numeroTwo = operaciones.nextInt();
        int sumaNumeros = numeroOne + numeroTwo;
        System.out.println("La suma del numero " + numeroOne + " y el numero " + numeroTwo + " da como resultado: " + sumaNumeros);
        operaciones.close();

    }
}
