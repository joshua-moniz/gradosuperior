import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Main {

    static int abierto(String clave, String[] listado) {
        int devovler =-1;
        for (int i = 0; i <listado.length; i++) {
            if (listado[i].startsWith(clave)){
                devovler = i;
            }
        }
        return devovler;
    }


    public static void main(String[] args) {
        String fecha ="";

        String clave = "1574689465";
        String[] bD = {"1574689468 A 10012025 1900 10012025 2000",
                "1574689467 A 10012025 1600 10012025 2000",
                "1574689466 A 10012025 1100 10012025 1200",
                "1574689465 A 10012025 1900 10012025 2000",
                "1574689464 A 10012025 1900 10012025 2000",
                "1574689463 A 10012025 1900 10012025 2000"};
        System.out.println(abierto(clave,bD));
        if (abierto(clave,bD)>-1){
            String llaveautorizada = bD[abierto(clave,bD)];
            if (llaveautorizada.indexOf('A')==11){
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat date = new SimpleDateFormat(fecha);
                String dData = date.format(calendar.getTime());
            }
        }
    }
}
