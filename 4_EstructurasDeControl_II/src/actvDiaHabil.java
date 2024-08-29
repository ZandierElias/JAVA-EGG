
import java.util.Scanner;

public class actvDiaHabil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usuario ingresar numero
        System.out.println("Escoge un dia de la semana");
        System.out.println("1-Lunes");
        System.out.println("2-Martes");
        System.out.println("3-Miercoles");
        System.out.println("4-Jueves");
        System.out.println("5-Viernes");
        System.out.println("6-Sabado");
        System.out.println("7-Domingo");
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        //Creando programa de verificacion 
        switch (numero) {
            case 1, 2, 3, 4, 5 ->
                System.out.println("Dia Habil");

            case 6, 7 ->
                System.out.println("Dia No Habil");

            default ->
                System.out.println("Numero ingresado, incorrecto.");
        }
        scanner.close();
    }
}
