package DoWhile;

import java.util.Scanner;

public class AdivinandoNumero {

    public static void main(String[] args) {
        // Generar un número aleatorio entre 1 y 20
        int numeroAleatorio = (int) (Math.random() * 20) + 1;
        // Inicializar el objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int intento;
        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa un número entre 1 y 20: ");
            intento = scanner.nextInt();
            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número correctamente: " + numeroAleatorio);

            } else {
                if (intento < numeroAleatorio) {
                    System.out.println("El número que has ingresado es menor  que el número aleatorio.");
                } else {
                    System.out.println("El número que has ingresado es mayor que el número aleatorio.");
                }
                System.out.println("Intenta nuevamente.");
            }
        } while (intento != numeroAleatorio);

        scanner.close();
    }
}
