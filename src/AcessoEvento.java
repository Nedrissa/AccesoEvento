import java.util.Scanner;

public class AcessoEvento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("¿Tienes entrada? (si/no): ");
        boolean tieneEntrada = scanner.nextLine().trim().equalsIgnoreCase("si");

        boolean estaAcompanado = false;

        if (edad < 18 && tieneEntrada) {
            System.out.print("¿Estás acompañado por un adulto? (si/no): ");
            estaAcompanado = scanner.nextLine().trim().equalsIgnoreCase("si");
        }

        boolean puedeAcceder = (edad >= 18 && tieneEntrada)
                || (edad < 18 && tieneEntrada && estaAcompanado);

        if (puedeAcceder) {
            System.out.println("Puedes acceder al evento.");
        } else {
            System.out.println("No puedes acceder al evento.");
        }

        scanner.close();
    }
}