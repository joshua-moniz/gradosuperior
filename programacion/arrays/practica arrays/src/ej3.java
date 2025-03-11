import java.util.Arrays;

public class ej3 {
    public static void main(String[] args) {
        int[] array = {12, 5, 67, 32, 2, 1, 0, 45, 7};
        int[] impares = {};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = array[i];
            }
        }

        System.out.println(Arrays.toString(impares));
    }
}
