package Examen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {
    public static int[] ordenador(int[] array, boolean reverse) {
        int copia = 0;
        int [] copiaArray= Arrays.copyOf(array,array.length);
        if (reverse) {
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                copiaArray[i]=array[array.length-1-i];
            }
            array=Arrays.copyOf(copiaArray,copiaArray.length);
        } else Arrays.sort(array);

        return array;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tabla = {};
        int numero = 0;
        boolean eleccion = true;
        do {
            System.out.println("Pon un numero ( Si quieres salir pon -1)");
            numero = sc.nextInt();
            if (numero < 0) break;
            tabla = Arrays.copyOf(tabla, tabla.length + 1);
            tabla[tabla.length - 1] = numero;
        } while (numero > 0);
        System.out.println(Arrays.toString(tabla));
        System.out.println("Quieres organizarlo 1.Descendente 2.Ascendente");
        int elecciones = sc.nextInt();

        if (elecciones == 2) {
            eleccion = false;
            System.out.println(Arrays.toString(ordenador(tabla, eleccion)));
        } else {

            System.out.println(Arrays.toString(ordenador(tabla, eleccion)));
        }


    }
}
