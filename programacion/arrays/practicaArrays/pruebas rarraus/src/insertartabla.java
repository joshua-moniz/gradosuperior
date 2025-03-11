import javax.sql.rowset.JoinRowSet;
import java.lang.reflect.Array;
import java.util.Arrays;

public class insertartabla {
    public static void main(String[] args) {
        int [] tabla={10,20,30,40,50,60,70,80,90,100};
        int numeroinstertar = 35;
        int posicion = Arrays.binarySearch(tabla,numeroinstertar);
        if (posicion<0){
            posicion=-posicion-1;
        }
        int [] tablacopia= new int[tabla.length+1];
        System.arraycopy(tabla,0,tablacopia,0, posicion);
        System.arraycopy(tabla,posicion,tablacopia,posicion+1, tabla.length-posicion);
        tablacopia[posicion]=numeroinstertar;
        System.out.println(Arrays.toString(tablacopia));
    }
}
