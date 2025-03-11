import java.util.Arrays;

public class quitarEnNoOrdenadas {
    public static void main(String[] args) {
        int [] taula = {100,20,30,40,50,43,70,80,90,100};
        int elementAEliminar = 40;
        int posicion = Arrays.binarySearch(taula,elementAEliminar);
        int copia=taula[taula.length-1];
        taula=Arrays.copyOf(taula,taula.length-1);
        taula[posicion]=copia;
        System.out.println(Arrays.toString(taula));
    }

}
