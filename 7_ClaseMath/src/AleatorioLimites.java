
import java.util.Scanner;

public class AleatorioLimites {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbMin, numbMax, numbAleatorio;

        try {
            System.out.println("Generando numero aleatorio entre dos limites");
            System.out.print("Ingrese el limite inferior : ");
            numbMin = scan.nextInt();
            System.out.print("Ingrese el limite maximo : ");
            numbMax = scan.nextInt();

            numbAleatorio = (int) (Math.random() * (numbMax - numbMin + 1) + numbMin);
            System.out.print("El numero aleatorio es: " + numbAleatorio);

        } catch (Exception e) {
            System.out.println("Error, ingrese un dato valido");
        }
        scan.close();
    }
}
