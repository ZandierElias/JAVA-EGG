package EjerciciosComplementarios;

public class invertirArray {

    public static void main(String[] args) {
        //creando array
        int[] arreglo = {50, 60, 70, 80, 90, 100};
        System.out.println("Array original");
        // bucle para mostrar elementos en orden 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Numero " + (i + 1) + " es: " + arreglo[i]);

        }
        System.out.println("Array invertido");

        // creando bucle para cambiar de posiciones dentro del array
        int n = arreglo.length;
        // Recorrer el array desde ambos extremos
        for (int i = 0; i < n / 2; i++) {
            // Intercambiar el elemento en la posición i con el correspondiente desde el final
            int change = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i];
            arreglo[n - 1 - i] = change;
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Numero " + (i + 1) + " es: " + arreglo[i]);
        }
    }
}
