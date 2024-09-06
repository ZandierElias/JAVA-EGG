
import java.util.Scanner;

public class v1Copiando {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {1, 2, 3};

        int[] nuevoArray = new int[numeros.length + 2];

        nuevoArray[0] = numeros[0];
        nuevoArray[1] = numeros[1];
        nuevoArray[2] = numeros[2];

        System.out.println("Ingrese el primer número:");
        int nuevoNumero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        int nuevoNumero2 = scanner.nextInt();

        nuevoArray[numeros.length] = nuevoNumero1;
        nuevoArray[numeros.length + 1] = nuevoNumero2;

        System.out.println("Contenido del nuevo array:");
        System.out.print(nuevoArray[0] + " ");
        System.out.print(nuevoArray[1] + " ");
        System.out.print(nuevoArray[2] + " ");
        System.out.print(nuevoArray[3] + " ");
        System.out.println(nuevoArray[4]);
        scanner.close();
    }
}
