import java.util.Arrays;

public class ej2 {
    public static void main(String[] args) {
        Integer [] list = {1,2,3,4,5,6,7,8,9};
lista lista = new lista(list);
        System.out.println(Arrays.toString(list));
        lista.add(2,4);
        System.out.println(Arrays.toString(list));
    }
}
