import java.util.Arrays;

public class arraysquitar {
    public static void main(String[] args) {
        int elementAInserir = 35;
        int[] taula = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int posicion = Arrays.binarySearch(taula, elementAInserir);
        if (posicion < 0) {
            posicion = -posicion - 1;
        }
        int[] copia = new int[taula.length + 1];
        System.arraycopy(taula, 0, copia, 0,posicion );
        System.arraycopy(taula,posicion,copia,posicion+1,taula.length - posicion);
        copia[posicion] = elementAInserir;
        System.out.println(Arrays.toString(copia));
    }
}
