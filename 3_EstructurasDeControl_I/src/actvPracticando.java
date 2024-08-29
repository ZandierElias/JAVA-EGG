
import java.util.Scanner;

public class actvPracticando {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        // Pedir al usuario que ingrese numero
        System.out.print("Por favor, ingresa un numero: ");
        int numberOne = number.nextInt();
        // Validacion del numero ingresado en el rango correcto 

        if (numberOne >= 90 && numberOne <= 100) {
            System.out.println("La puntuacion se encuentra en el bloque: A");
        } else if (numberOne >= 80 && numberOne <= 89) {
            System.out.println("La puntuacion se encuentra en el bloque: B");
        } else if (numberOne >= 70 && numberOne <= 79) {
            System.out.println("La puntuacion se encuentra en el bloque: C");
        } else if (numberOne >= 60 && numberOne <= 69) {
            System.out.println("La puntuacion se encuentra en el bloque: D");
        } else if (numberOne > 0 && numberOne < 60) {
            System.out.println("La puntuacion se encuentra en el bloque: F");
        } else {
            System.out.println("El numero ingresado esta fuera del rango válido");
        }
        number.close();
    }
}
