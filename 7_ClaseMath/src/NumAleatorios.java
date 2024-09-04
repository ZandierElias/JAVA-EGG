
public class NumAleatorios {

    public static void main(String[] args) {
        //Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
        int aleatorio, min, max;

        try {
            System.out.println("\nGenerando numero aleatorio entre 1 a 355");
            min = 1;
            max = 355;
            aleatorio = (int) (Math.random() * (max - min + 1) + min);
            System.out.print("Número aleatorio generado: " + aleatorio);

        } catch (Exception e) {
            System.out.println("Error, ingrese un dato válido");
        }

    }
}
