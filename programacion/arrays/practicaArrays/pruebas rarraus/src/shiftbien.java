import java.util.Arrays;
import java.util.Scanner;

public class shiftbien {
    static public int [] shift (int[] tabla){
        int copia = tabla[tabla.length-1];
        System.arraycopy(tabla,0,tabla,1,tabla.length-1);
        tabla[0]=copia;
        return tabla;
    }
    public static void main(String[] args) {
        int[] taula = {1,2,3,4,5,6,7,8,9};
        int numero =0;
        boolean seguir = true;
        do {


            System.out.println("Quieres mover los numeros");
            System.out.println("1.Si 2.No");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
            if (numero == 1) {
                taula = shift(taula);
                System.out.println(Arrays.toString(taula));
            }else break;
        }while (seguir);
    }

}
