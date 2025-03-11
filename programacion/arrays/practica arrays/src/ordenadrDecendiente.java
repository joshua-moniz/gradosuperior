import java.util.Arrays;
import java.util.Scanner;

public class ordenadrDecendiente{
    static public int [] decendente(int [] array){
        Arrays.sort(array);
        int[] copia=Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length; i++) {
            copia[i]=array[array.length-1-i];
        }
        return copia;
    }
    static public int[] bucle(int[] arr) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        while (seguir) {
            System.out.println("Pon los numeros");
            int num = sc.nextInt();
            if (num == -1) break;
            arr= Arrays.copyOf(arr, arr.length+1);
            arr[arr.length-1] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr ={};
        arr = bucle(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Array ordenador");
        System.out.println(Arrays.toString(decendente(arr)));
    }
}
