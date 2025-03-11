import java.util.Scanner;

public class string6y3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer jugar pon la contraseña");
        String contraseña = sc.nextLine();
        boolean seguir = true;
        do {
            System.out.println("Jugador dos adivina");
            String palabra = sc.nextLine();
            int comparacion = contraseña.compareTo(palabra);
            if (comparacion < 0) System.out.println("la contraseña es menor a " + palabra);
            if (comparacion > 0) System.out.println("La contraseña es mayor a " + palabra);
            if (comparacion == 0) {
                System.out.println("Acertaste");
                seguir = false;
                break;
            }
        } while (seguir = true);
    }
}
