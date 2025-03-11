import java.util.Scanner;

public class string6y3b {
    public static void main(String[] args) {
        String contraseña ="patata";
        Scanner sc = new Scanner(System.in);
        String prueba= "";
        do {
            System.out.println("Introduce palabra:");
            prueba= sc.nextLine();
            String pista = "";
            if (contraseña.length()== prueba.length()){

                for (int i = 0; i <contraseña.length() ; i++) {
                    if (contraseña.charAt(i)==prueba.charAt(i)){
                        pista = pista + contraseña.charAt(i);
                    }else {
                        pista += '*';
                    }
                }
                System.out.println("El tamaño de la contraseña es " + contraseña.length());
                System.out.println(pista);
            }
        }while (!contraseña.equals(prueba));
        System.out.println("Has acertado");

    }
}
