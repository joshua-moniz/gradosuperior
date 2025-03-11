import java.util.Scanner;

public class strings6y6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon tu nombre");
        String prohibi = " aeiouáéíóúAEIOU";
        String nombre = sc.nextLine();
        System.out.println(nombre.replaceAll("[aeiouáéíóúAEIOU]",""));


    }
}