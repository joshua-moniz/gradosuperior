import java.util.Arrays;

public class ns {
   static public int[] desordetar(int[] t) {
        int copia = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = i+1; j < t.length - 1 - i; j++) {
                int vloar = (int) (Math.random() * t.length);
                copia = t[i];
                t[i] = t[vloar];
                t[vloar] = copia;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println(Arrays.toString(desordetar(tabla)));
    }
}

