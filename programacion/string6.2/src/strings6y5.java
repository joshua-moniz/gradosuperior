import java.util.Scanner;

public class strings6y5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String respuesta= "";
        for (int i = frase.length()-1; i >=0; i--) {
            respuesta = respuesta + frase.charAt(i);


        }
        System.out.println(respuesta);
    }
    }
