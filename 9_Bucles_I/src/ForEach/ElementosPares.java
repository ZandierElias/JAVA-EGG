package ForEach;

public class ElementosPares {

    public static void main(String[] args) {
        //generar un array con 10 elementos enteros
        int[] numbers = new int[10];

        //variables para rango de numero
        int min = 1;
        int max = 100;

        //inicializa cada elemento con un numero aleatorio 
        System.out.println("Numeros Aleatorios en Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (max - min + 1) - min);
            System.out.println("Numero " + (i + 1) + " es: " + numbers[i]);

        }
        // Elementos Pares 
        int conteoPares = 0;

        System.out.println("Numeros Aleatoreos Pares");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.println("Numero " + (i + 1) + " es: " + numbers[i]);
                conteoPares++;

            }
        }
        // mostrar total pares
        System.out.println("Total de elementos pares: " + conteoPares);
    }
}
