import java.util.Scanner;

public class string6y7 {
    public static void main(String[] args) {
        System.out.println("Escribe una frase");
        Scanner sc = new Scanner(System.in);
        String frase = "";
        frase = sc.nextLine();
        System.out.println("Escribe una palabra que parezca en la frase");
        String palabra = "";
        palabra = sc.nextLine();
        int numeroPalabra = 0;
        int vuelta = 0;
        numeroPalabra = frase.indexOf(palabra);
        while (numeroPalabra != -1) {
            vuelta++;
            numeroPalabra = frase.indexOf(palabra, numeroPalabra + 1);

        }
        if (vuelta == 0) System.out.println("No esta la palabra");
        else System.out.println(palabra + " aparece " + vuelta);


    }
}
