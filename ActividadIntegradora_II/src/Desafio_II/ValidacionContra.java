package Desafio_II;

import java.util.Scanner;

public class ValidacionContra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar la contraseña al usuario
        System.out.print("Ingresa una contraseña: ");
        String password = scanner.nextLine();

        // Validar los criterios de seguridad
        if (esContrasenaSegura(password)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura. Debe cumplir los siguientes criterios:");
            System.out.println("- Tener al menos 8 caracteres.");
            System.out.println("- Contener al menos una letra mayúscula.");
            System.out.println("- Contener al menos una letra minúscula.");
            System.out.println("- Contener al menos un número.");
            System.out.println("- Contener al menos un carácter especial (!, @, #, $, etc.).");
        }

        scanner.close();
    }

    // Método que valida si la contraseña es segura
    public static boolean esContrasenaSegura(String password) {
        // Verificar si la contraseña tiene al menos 8 caracteres
        if (password.length() < 8) {
            return false;
        }

        // Verificar si contiene al menos una letra mayúscula
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Verificar si contiene al menos una letra minúscula
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Verificar si contiene al menos un número
        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        // Verificar si contiene al menos un carácter especial
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
        } else {
            return false;
        }

        // Si cumple con todos los criterios, es segura
        return true;
    }
}
