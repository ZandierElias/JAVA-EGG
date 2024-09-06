
import java.util.Scanner;

public class PromedioElementos {

    public static void main(String[] args) {
        // creando array con 4 elementos tipo entero
        int[] arreglo = new int[4];
        //pidiendo al usuario que ingrese datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa 4 numeros enteros: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();

        }
        //sumando los elementos del array
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        // promedio 
        double promedio = (double) suma / arreglo.length;

        scanner.close();

        // imprimiendo el resultado
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elemento es : " + promedio);
    }
}
