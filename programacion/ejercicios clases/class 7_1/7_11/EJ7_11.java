import java.util.Arrays;

public class EJ7_11 {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] list2 = {1, 2, 3, 4, 5, 6, 7, 9, 9};
        lista nuevalista = new lista(list);
        nuevalista.insertStart(list2);
        System.out.println(nuevalista.buscar(9));
        System.out.println(nuevalista.elemento(15));
        System.out.println(Arrays.toString(nuevalista.getLista()));
    }
}
