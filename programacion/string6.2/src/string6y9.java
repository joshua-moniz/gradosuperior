import java.util.Scanner;

public class string6y9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tus palabras");
        String fraseCompleta ="";
        String fraseCachos="";
        boolean seguir=true;
        do {
            fraseCachos = sc.nextLine();
            if (fraseCachos.equals("fin") || fraseCachos.equals("FIN")){
                System.out.println(fraseCompleta);
                seguir=false;
            }
            fraseCompleta += fraseCachos + " ";
        }while (seguir);
    }
    }
