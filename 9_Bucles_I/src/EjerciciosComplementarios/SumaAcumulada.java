package EjerciciosComplementarios;

public class SumaAcumulada {

    public static void main(String[] args) {
        // Definir el array original
        int[] arreglo = {2, 5, 7, 1, 3};

        System.out.println("Array original:");
        imprimirArray(arreglo);

        // Llamar a la función para calcular la suma acumulada
        calcularSumaAcumulada(arreglo);

        // Imprimir el array con la suma acumulada
        System.out.println("Array con suma acumulada:");
        imprimirArray(arreglo);
    }

    // Función que calcula la suma acumulada
    public static void calcularSumaAcumulada(int[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            // Reemplazar cada elemento con la suma acumulada hasta ese punto
            arreglo[i] = arreglo[i] + arreglo[i - 1];
        }
    }

    // Función para imprimir el array
    public static void imprimirArray(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
