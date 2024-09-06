
public class ImprimirElementos {

    public static void main(String[] args) {
        //Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. El tamaño, tipo de datos y la información a contener pueden ser de tu elección.

        //variables para el array
        int numeroX = 32;
        int numeroY = 21;
        //Creando array
        int[] arreglo = {1, 54, 33, 75, numeroX, 23, numeroY};

        System.out.println("Interacion e impresion  de los elementos del array");

        //Bucle
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("El numero " + (i + 1) + " es: " + arreglo[i]);
        }
    }
}
