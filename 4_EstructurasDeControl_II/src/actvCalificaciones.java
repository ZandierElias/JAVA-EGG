
import java.util.Scanner;

public class actvCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Solicitar numero al usuario
        System.out.println("Por favor ingresa un numero del 1 al 5: ");
        int numero = scanner.nextInt();

        String calificacionLetras;
        calificacionLetras = switch (numero) {
            case 1 ->
                "Muy deficiente";
            case 2 ->
                "Deficiente";
            case 3 ->
                "Suficiente";
            case 4 ->
                "Notable";
            case 5 ->
                "Sobresaliente";
            default ->
                "Numero invalido";
        };
        System.out.println("La calificacion en letras es: " + calificacionLetras);
        scanner.close();
    }
}
