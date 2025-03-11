import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        int[] numeros = {};
        Scanner sc = new Scanner(System.in);
        int ingreso;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Ingrese un numero: ");
            ingreso = sc.nextInt();
            if (ingreso > -1) {
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = ingreso;
            } else seguir = false;

        }
        System.out.printf(Arrays.toString(numeros));
        Arrays.sort(numeros);
        int [] copia = Arrays.copyOf(numeros, numeros.length);
      for (int i = 0; i < numeros.length; i++) {
          copia[i] = numeros[numeros.length - 1 - i];
      }
        System.out.println(Arrays.toString(copia));
    }
}
