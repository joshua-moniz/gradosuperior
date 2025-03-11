import java.util.Scanner;

public class ej7_6 {
    public static void main(String[] args) {
        vehichulo a = new vehichulo("123443rma", "renault", "SYMBIOZ E-TECH FULL HYBRID", 140);
        int elecion = 0;
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        while (seguir) {
            System.out.println("1.Cambiar Precio || 2.Ver precio || 3.Mostar informacion");
            elecion = sc.nextInt();
            switch (elecion) {
                case 1 -> {
                    System.out.println("Que precio quieres poner");
                    double precio = sc.nextDouble();
                    a.cambiarprecio(precio);
                }
                case 2 -> {
                    System.out.println("Precio : ");
                    System.out.println(a.mostarPrecio().toString());
                }
                case 3 -> {
                    System.out.println("-----------");
                    System.out.println("Informacion");
                    System.out.println("-----------");
                    System.out.println(a.mostarInformacion());
                }
            }
        }
    }
}
