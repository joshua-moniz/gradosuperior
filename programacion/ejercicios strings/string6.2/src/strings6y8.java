import java.util.Scanner;

public class strings6y8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = "";
        frase = sc.nextLine();
        String pre = "Escolta nen, ";
        String su = ", que m’entens, idò?";
        if (frase.startsWith(pre)) {
            frase = frase.substring(pre.length());


        } else if (frase.endsWith(su)){

            frase= frase.substring(0, frase.length()-su.length());
        }
        System.out.println("La frase traducida es: ");
        System.out.println(frase.strip() + '.');
    }

}
