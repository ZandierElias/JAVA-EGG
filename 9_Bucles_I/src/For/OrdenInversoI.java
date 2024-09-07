package For;

public class OrdenInversoI {

    public static void main(String[] args) {
        //Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser de tu elección.

        // creando array
        int[] arreglo = {10, 20, 30, 50, 65, 43};
        // creando bucle para imprimir elementos inversamente
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.println("Numero " + (i + 1) + " es : " + arreglo[i]);

        }

    }
}
