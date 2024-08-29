
import java.util.Scanner;

public class actvToCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un frase o palabra, por favor");
        String cadena = scanner.nextLine();

        System.out.println("FRASE O PALABRA EN MAYUSCULAS : " + cadena.toUpperCase());
        System.out.println("frase o palabra en minusculas: " + cadena.toLowerCase());
        //Almacenar en variables + legibilidad 
        scanner.close();
    }
}
