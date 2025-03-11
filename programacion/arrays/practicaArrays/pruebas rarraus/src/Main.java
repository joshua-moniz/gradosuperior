import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 65, 3, 2, 53, 8, 2};
        int temp = 0;
        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[i]) {
                    temp=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}