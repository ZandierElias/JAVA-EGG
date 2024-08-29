
import java.util.Scanner;

public class actvFigGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Seleccione una figura geométrica:");
        // System.out.println("1. Círculo");
        // System.out.println("2. Cuadrado");
        // System.out.println("3. Triángulo");
        System.out.print("|-------------------------------------------------|"
                + "\n|  CALCULEMOS EL AREA DE LAS FIGURAS GEOMETRICAS  |"
                + "\n|-------------------------------------------------|"
                + "\n| 1. Triangulo                                                    |"
                + "\n| 2. Cuadrado                                                   |"
                + "\n| 3. Circulo                                                        |"
                + "\n|-------------------------------------------------|"
                + "\n\nSeleccione una opción: ");
        int opcion = scanner.nextInt();
        double area;
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
            }
            case 2 -> {
                System.out.println("Ingrese el lado del cuadrado:");
                double lado = scanner.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
            }
            case 3 -> {
                System.out.println("Ingrese la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
            }
            default ->
                System.out.println("Opción inválida");
        }
        scanner.close();
    }
}
