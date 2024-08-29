
import java.util.Scanner;

public class ActvIngrdCalculadora {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        // Solicitar al usuario que ingrese dos numeros
        System.out.println("Calculadora");

        System.out.print("Por favor,ingresa el primer numero: ");
        int number1 = numeros.nextInt();

        System.out.print("Por favor,ingresa el segundo numero: ");
        int number2 = numeros.nextInt();

        // lista de opciones para operaciones a realizar 
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");

        System.out.print("Ingresa el numero de opcion del calculo que deseas realizar: ");
        int queOpcion = numeros.nextInt();

        switch (queOpcion) {
            case 1:
                int suma = number1 + number2;
                System.out.println("La suma entre estos dos numeros es: " + suma);
                break;
            case 2:
                int resta = number1 - number2;
                System.out.println("La resta entre estos dos numeros es: " + resta);
            case 3:
                int multiplicar = number1 * number2;
                System.out.println("La multiplicacion entre estos dos numeros es: " + multiplicar);
                break;
            case 4:
                int dividir = number1 / number2;
                System.out.println("La division entre estos dos numeros es: " + dividir);
                break;
            default:
                System.out.println("Opcion Incorrecta");
                break;
        }
        numeros.close();
        // Otra manera mas eficiente de lograr esto? Con metodos? es mas o es menos complejo?
    }
}
