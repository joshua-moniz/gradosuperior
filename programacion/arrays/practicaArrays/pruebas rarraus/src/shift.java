import java.util.Arrays;
import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9};
        int[] copia = new int[array.length];
        int contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero quieres mover");
        int numero = sc.nextInt();
       int posicion =0;
        for (int i = 0; i < array.length; i++) {
            if (numero==array[i]){
                posicion=i;
                System.arraycopy(array,posicion,copia,0, 1);
                System.arraycopy(array,0,copia,1,array.length-1);
                System.arraycopy(array,posicion+1,copia,posicion+1,array.length-1-posicion);
            }
        }
        System.out.println(Arrays.toString(copia));
    }
}
