package For;

public class ValorMinI {

    public static void main(String[] args) {
        //Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.

        //array 
        int[] arreglo = {43, 25, 65, 12, 32, 44, 16, 22};
        // variable para valor minimo 
        int minimo = arreglo[0];
        // encontrar el menor 
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        System.out.println("El valor minimo dentro del array es: " + minimo);

    }
}
