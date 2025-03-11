import java.util.Scanner;

public class srting6y4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Pon una frase bebesita uaaaa");
        String frase = sc.nextLine();
         int vueltas = 0 ;
         char espacio;
        for (int i = 0; i <frase.length(); i++) {
            espacio = frase.charAt(i);
            if (Character.isSpaceChar(espacio)){
                vueltas ++;
            }
        }
        System.out.println("Tiene " + vueltas + " espacios ");
    }
}
