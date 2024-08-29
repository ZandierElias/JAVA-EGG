
import java.util.Scanner;

public class actvClasificacion {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //Solicitar al usuario que ingres un numero
        System.out.println("Por favor, ingresa un numero:");
        int numeroUsuario = number.nextInt();
        //Determinar si el numero es positivo,negativo o cero
        if (numeroUsuario > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroUsuario < 0) {
            System.out.println("El numero es negativo");
        } else if (numeroUsuario == 0) {
            System.out.println("El numero es igual a 0");
        }
    }
}
