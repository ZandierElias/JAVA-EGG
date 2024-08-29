
import java.util.Scanner;

public class actvOpcion {

    public static void main(String[] args) {
        // menu de opciones
        System.out.println("Opcion 1: Guardar");
        System.out.println("Opcion 2: Cargar");
        System.out.println("Opcion 3: Cerrar");
        //Clase scanner para solicitar al usuario ingreso de numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 3: ");
        int numero = scanner.nextInt();
        // Creando programa
        switch (numero) {
            case 1:
                System.out.println("El archivo se va a guardar");
                break;
            case 2:
                System.out.println("EL archivo se esta cargando");
                break;
            case 3:
                System.out.println("El archivo se va a cerrar");
                break;

            default:
                System.out.println("Numero ingresado, invalido");
                break;
        }
        scanner.close();
    }
}
