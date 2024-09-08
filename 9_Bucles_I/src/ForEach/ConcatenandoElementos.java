package ForEach;

public class ConcatenandoElementos {

    public static void main(String[] args) {
        // Crear un array de cadenas
        String[] array = {"Hola", "qué", "tal", "estás", "hoy?"};
// Concatenar los elementos del array en una sola cadena, separados

        String concatenacion = "";
        for (int i = 0; i < array.length; i++) {
            concatenacion += array[i];
            if (i < array.length - 1) {
                concatenacion += " ";
            }
        }
// Imprimir el resultado por consola
        System.out.println("\nCadena concatenada: " + concatenacion);
    }
}
