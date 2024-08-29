
import java.util.Scanner;

public class usoClaseScanner {

    public static void main(String[] args) {
        Scanner primerScaner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String usuarioNombre = primerScaner.nextLine();
        System.out.println("Tu nombre es: " + usuarioNombre);
        System.out.print("Ingrese su edad: ");
        int usuarioEdad = primerScaner.nextInt();
        System.out.println("Tu edad es: " + usuarioEdad);
        System.out.println("Tu nombre es " + usuarioNombre + " Y tienes " + usuarioEdad + " años de edad.");
        primerScaner.close();
    }
}
