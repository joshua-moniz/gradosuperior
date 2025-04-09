import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        lista lista = new lista(list);
        System.out.println(lista.toString());
        lista.add(2, 4);
        System.out.println(lista.toString());
        System.out.println(lista.length());
        System.out.println(lista.remove(3));
        System.out.println(lista.toString());
        System.out.println(lista.length());

        cola cola = new cola(list);
        cola.encolar(4);
        System.out.println(cola.toString());



        cola.desencolar();
        System.out.println(cola.toString());



    }
}
