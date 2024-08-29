
import java.util.Scanner;

public class actvBusqueda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese un caracter: ");
        String caracter = scanner.nextLine();

        // int index = palabra.indexOf(caracter);
        // System.out.println("El caracte se encuentra en la posicion: " + index);
        // scanner.close();
        if (palabra.indexOf(caracter) != -1) {
            System.out.println("El caracter " + caracter + " se encuentra en la palabra '" + palabra + "'");
        } else {
            System.out.println("El caracter " + caracter + " no se encuentra en la palabra '" + palabra + "'");
        }
        scanner.close();
    }
}
