package Examen;

import java.util.Arrays;

public class Ej4 {
    public static int[] eliminar(int[] arrayOrdenado, int elementoAEliminar) {
        int posicion = Arrays.binarySearch(arrayOrdenado, elementoAEliminar);
        int[] tablaCopia = new int[arrayOrdenado.length-1];
        System.arraycopy(arrayOrdenado,0,tablaCopia,0,posicion);
        System.arraycopy(arrayOrdenado,posicion+1,tablaCopia,posicion,arrayOrdenado.length-1-posicion);
        return tablaCopia;
    }


public static void main(String[] args) {
    int[] ordenado = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    int elementoBorrar = 80;
    System.out.println(Arrays.toString(eliminar(ordenado,elementoBorrar)));
}
}
