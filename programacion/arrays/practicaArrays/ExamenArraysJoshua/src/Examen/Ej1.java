package Examen;

import java.util.Arrays;

public class Ej1 {
    static int[] cola = {1,2,3,4,5};



        static int extrae(){
            int element= cola[0];
            System.arraycopy(cola,1,cola,0,cola.length-1);
            cola=Arrays.copyOf(cola,cola.length-1);
            return element;
        }
        static void inserta(int elemento){
            cola = Arrays.copyOf(cola,cola.length+1);
            cola[cola.length-1]=elemento;
        }
        static void imprimir(int [] matriz) {
            System.out.println(Arrays.toString(matriz));
        }
       static void imprimir( int elementos) {
           System.out.println(elementos);
}
    public static void main(String[] args) {

            inserta(8);
            imprimir(cola);
            imprimir(extrae());
            imprimir(cola);

    }
    }

