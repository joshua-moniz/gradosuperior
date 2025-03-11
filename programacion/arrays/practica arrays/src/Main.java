import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int recorrido = 0;
        int[] numeros={};
        Scanner sc =new Scanner(System.in);
        int ingreso;
        boolean seguir =true;
        while(seguir){
            System.out.println("Ingrese un numero: ");
            ingreso=sc.nextInt();
            if(ingreso>-1){
                numeros= Arrays.copyOf(numeros,numeros.length+1);
                numeros[numeros.length-1]=ingreso;
            }else seguir=false;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("Que numero quieres buscar");
        int numero2=sc.nextInt();
        for (int i = 0; i <numeros.length; i++) {
            if(numeros[i]==numero2){
                recorrido++;
            }
        }
        System.out.println(numero2 + " aparece " + recorrido);
    }
}