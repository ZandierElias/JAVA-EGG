
import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberUsuario;
        double raiz;
        try {
            System.out.print("Ingrese un numero positivo: ");
            numberUsuario = scanner.nextInt();

            if (numberUsuario > 0) {

                raiz = Math.sqrt(numberUsuario);
                System.out.print("La raiz cuadrada de " + numberUsuario + " es: " + raiz);
            } else {
                System.out.println("Error, ingrese un numero positivo");
            }

        } catch (Exception e) {
            System.out.println("Error, ingrese un valor valido");
        }
        scanner.close();
    }
}
