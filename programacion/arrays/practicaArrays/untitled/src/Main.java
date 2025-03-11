import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subir = 0;
        int[] tabla = {};
        while (true) {
            int numero = sc.nextInt();
            if (numero > -1) {

                tabla = Arrays.copyOf(tabla, tabla.length + 1);
                tabla[tabla.length-1]=numero;
            } else break;
        }
        System.out.println(Arrays.toString(tabla));
    }
}