package While;

import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        //menu interactivo con 5 opciones
        Scanner scanner = new Scanner(System.in);
        int opcion;
        // Mostrar el menú hasta que el usuario elija salir
        while (true) {
            System.out.println("Menú interactivo:");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
            switch (opcion) {
                case 1 ->
                    System.out.println("Ha elegido: Comprar producto");
                case 2 ->
                    System.out.println("Ha elegido: Realizar devolución");
                case 3 ->
                    System.out.println("Ha elegido: Ver mis pedidos");
                case 4 ->
                    System.out.println("Ha elegido: Preguntas frecuentes");
                case 5 -> {
                    System.out.println("Saliendo del programa...");
                    return; // Salir del bucle y finalizar el programa
                }
                default ->
                    System.out.println("Opcion no válida. Por favor , seleccione una opcion del menu");
            }
        }
        scanner.close();
    }
}
