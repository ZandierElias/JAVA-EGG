
import java.util.Scanner;

public class AleatorioRaiz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbLimite, numbAleatorio;
        double numbRaiz;

        try {
            System.out.println("Aleatorio y Análisis");
            System.out.print("Ingrese un numero entre 1 y 30: ");
            numbLimite = scan.nextInt();
            if (numbLimite < 1 || numbLimite > 30) {
                System.out.println("Ingrese un numero, dentro de ese rango");
            }
            numbAleatorio = (int) (Math.random() * (numbLimite - 1 + 1) - 1);
            System.out.println("El numero aleatorio es : " + numbAleatorio);
            numbRaiz = Math.sqrt(numbAleatorio);
            System.out.println("La raiz cuadrada del numero aleatorio es: " + numbRaiz);
            boolean numbPrimo = esNumeroPrimo(numbAleatorio);
            if (numbPrimo) {
                System.out.println("El numero " + numbAleatorio + " es primo");
            } else {
                System.out.println("El numero " + numbAleatorio + " no es primo");
            }
        } catch (Exception e) {
            System.out.println("Error, ingrese un dato valido");
        }
    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
