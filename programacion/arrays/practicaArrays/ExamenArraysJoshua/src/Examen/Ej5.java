package Examen;

import java.util.Arrays;

public class Ej5 {
    public static void main(String[] args) {
        int[] codProd = {12, 2, 45, 65, 78, 2, 120, 17, 12, 7};
        int[] elem = {};
        int[] cantprod2 = {};
        int[] cantProd = {5, 6, 0, 25, 3, 2, 8, 0, 1, 4};

        for (int i = 0; i < codProd.length; i++) {
            int posicion = Arrays.binarySearch(elem, codProd[i]);
            if (posicion < 0 ) {
                Arrays.sort(codProd);
                elem = Arrays.copyOf(elem, elem.length + 1);
                cantprod2 = Arrays.copyOf(cantprod2, cantprod2.length + 1);
                elem[elem.length - 1] = codProd[i];
            }
        }
        for (int i = 0; i < elem.length; i++) {
            for (int j = i+ 1 ; j < cantProd.length; j++) {
                if (elem[i]==codProd[j]){
                    cantprod2[i]=cantProd[i]+cantProd[j];
                }
            }
        }
        System.out.println(Arrays.toString(elem));
        System.out.println(Arrays.toString(cantprod2));
    }
}
