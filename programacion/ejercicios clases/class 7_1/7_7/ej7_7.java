import java.util.Arrays;
import java.util.Scanner;

public class ej7_7 {
    public static void main(String[] args) {
        texto a = new texto();
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuanto queires el array");
        int eleccion = sc.nextInt();
        a.cadena(eleccion);
        System.out.println(Arrays.toString(a.getArray()));
        System.out.println("Que letra quieres añadir");
        char letra = sc.next().charAt(0);
        System.out.println("Donde  1.Final || 2.Principio");
        int eleccion2 =sc.nextInt();
        switch (eleccion2){
            case 1 ->{
                a.añadirFinal(letra);
                System.out.println(Arrays.toString(a.getArray()));
            }
            case 2 ->{
                a.añadirPrincipio(letra);
                System.out.println(Arrays.toString(a.getArray()));
            }

        }
    }
}
