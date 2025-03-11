import java.util.Scanner;

public class ej7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fracciones fraccion = new fracciones(10, 35);
        fracciones fraccion2 = new fracciones(20, 8);
        int eleccion = 0;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Que quieres hacer");
            System.out.println("1.Suma|| 2.Resta || 3.Multiplicar || 4.Dividir || 5.MostartFracciones ");
            eleccion = sc.nextInt();
            switch (eleccion){
                case 1 ->{
                    System.out.println(fraccion.suma(fraccion,fraccion2));
                }
                case 2 ->{
                    System.out.println(fraccion.resta(fraccion,fraccion2));
                }
                case 3 -> {
                    System.out.println(fraccion.multi(fraccion,fraccion2));
                }
                case 4 -> {
                    System.out.println(fraccion.dividr(fraccion,fraccion2));
                }
                case 5 ->{
                    System.out.println(fraccion.mostrar(fraccion,fraccion2));
                }
            }
        }
    }
}
