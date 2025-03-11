import java.util.Scanner;

public class strings6y10 {
    static String inversa (String principal){
        String fraseInversa="";
        for (int i = principal.length()-1; i >=0; i--) {
            fraseInversa = fraseInversa + principal.charAt(i);
        }
        return fraseInversa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un afrase que sea palindroma es decir que se lea igual desde cualquier lado");
        String frase = "";
        String fraseInvertida="";
        String sinEspacios="";
        frase = sc.nextLine();
        frase=frase.toLowerCase();
        sinEspacios= frase.replaceAll(" ","");
        fraseInvertida = inversa(sinEspacios);
        if (sinEspacios.equals(fraseInvertida)) {
            System.out.println("Es una frase palindroma");
        }else System.out.printf("No es un frase palindroma");
    }
}
