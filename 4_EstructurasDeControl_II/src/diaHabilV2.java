
import java.util.Scanner;

public class diaHabilV2 {

    public static void main(String[] args) {
        //Instanciar el objeto de la clase Scanner
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana (1-7): ");
        int dia = leer.nextInt();

        leer.close();

        switch (dia) {
            case 1 ->
                System.out.println("El día es Lunes es un día hábil");
            case 2 ->
                System.out.println("El día es Martes es un día hábil");
            case 3 ->
                System.out.println("El día es Miércoles es un día hábil");
            case 4 ->
                System.out.println("El día es Jueves es un día hábil");
            case 5 ->
                System.out.println("El día es Viernes es un día hábil");
            case 6 ->
                System.out.println("El día es Sábado no es un día hábil");
            case 7 ->
                System.out.println("El día es Domingo no es un día hábil");
            default ->
                System.out.println("Día inválido");
        }
    }
}
