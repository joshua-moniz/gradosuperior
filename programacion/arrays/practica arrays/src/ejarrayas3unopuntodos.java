import java.util.Arrays;
import java.util.Scanner;

public class ejarrayas3unopuntodos {
    static public int [] b (int [] tabla){
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Seguir");
            int si = sc.nextInt();
            if (si == 1) {
                int copia = tabla[tabla.length - 1];
                System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
                System.arraycopy(tabla, tabla.length - 1, tabla, 0, 1);
                tabla[0] = copia;

                System.out.println(Arrays.toString(tabla));
            }else break;
        }
        return tabla;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      a=b(a);
    }

    /* Implementa un programa que trenqui un array de sencers cap a la dreta una posició. Per exemple, {1, 2, 3, 4} es convertiria en {4, 1, 2, 3}.
     */
}
