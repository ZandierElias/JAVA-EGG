
import java.util.Scanner;

public class actvDiasSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese numero
        System.out.print("Por favor, ingrese un numero del 1 a 7: ");
        int numero = scanner.nextInt();
        // Eligiendo dia de la semana 
        switch (numero) {
            case 1 ->
                System.out.println("El numero elegido corresponde al dia Lunes");
            case 2 ->
                System.out.println("EL numero elegido corresponde al dia Martes");
            case 3 ->
                System.out.println("el numero elegido corresponde al dia Miercoles");
            case 4 ->
                System.out.println("El numero elegido corresponde al dia Jueves");
            case 5 ->
                System.out.println("El numero elegido corresponde al dia Viernes");
            case 6 ->
                System.out.println("El numero elegido corresponde al dia Sabado");
            case 7 ->
                System.out.println("El numero elegido corresponde al dia Domingo");
            default ->
                System.out.println("Numero no valido");
        }
        // Otra forma para no imprimir tanto texto por cada caso, Cambialo! variables
        scanner.close();
    }
}
