package ForEach;

public class CalculandoPromedio {

    public static void main(String[] args) {
        // creando array con 20 elementos tipo float
        float[] numbers = new float[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (float) (Math.random() * 100);
            System.out.println("Numero " + (i + 1) + " es: " + numbers[i]);
        }
        float suma = 0;
        for (float numero : numbers) {
            suma += numero;
        }
        // Calcular el promedio de los elementos
        float promedio = suma / numbers.length;
// Mostrar la suma y el promedio por consola
        System.out.println("Suma de los elementos: " + suma);
        System.out.println("Promedio de los elementos: " + promedio);

    }
}
