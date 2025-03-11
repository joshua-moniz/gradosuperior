import java.util.Scanner;

public class ej7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        claseLibros libro = new claseLibros("DonQuijote","Cervantes",123412,15.30);
        System.out.println("------------------------------------------------");
        System.out.println("Cambia el precio ");
        System.out.println("------------------------------------------------");

        System.out.println("Precio actual");
        System.out.println(libro.obtenerPrecio(libro.titulo));
        System.out.println("Nuevo precio");
        double nuevoPrecio = sc.nextDouble();
        libro.cambiarPrecio(nuevoPrecio);
        System.out.println(libro.obtenerPrecio(libro.titulo));
        System.out.println("------------------------------------------------");
        System.out.println(libro.informacion(libro.titulo));
    }
}