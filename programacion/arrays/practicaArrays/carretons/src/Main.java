import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    // Esta funcion devuelve la fecha actual de tu equipo en formato
    // string dia mes año p.ej 21032025 equivalente a 21/03/2025
    static String getFechaActual() {
        // Le decimos que formato queremos tenga el String ddMMyyyy es
        // dos digitos para el dia, dos digitos para el mes y cuatro
        // digitos para el año (el mes DD va en mayuscula para
        // diferenciarlo de los minutos que van en minuscula mm)
        String formatoFecha = "ddMMyyyy";// si queremos el año mes dia
        // deberiamos poner yyyyMMdd . La clase Calendar nos sirve para
        // trabajar con fechas y horas. El metodo getInstance nos devuelve
        // una instancia de la clase Calendar, que es un objeto del
        // cual podremos obtener el momento actual (fecha y hora), este
        // momento actual es creado en forma de un numero que representa
        // los milisegundos que han pasado desde una fecha determinada
        // definida llamada Epoch.
        Calendar calendar = Calendar.getInstance();
        // La clase SimpleDateFormat es una clase que nos permite realizar
        // un formato sobre el resultado de un objeto Date del momento
        // actual de un objeto de la clase Calendar, el formato lo
        // determina el string formatoFecha que hemos creado antes.
        SimpleDateFormat date = new SimpleDateFormat(formatoFecha);
        // Cuando empleamos el metodo .format del objeto time creado de la
        // clase SimpleDateFormat este nos devuelve un string con el formato
        // requerido de un tipo de datos Date devuelto por el metodo
        // .getTime() del objeto calendar, es decir que nos devuelve
        // el dia actual.
        return date.format(calendar.getTime());
    }

    // Esta funcion devuelve la hora actual de tu equipo en formato
    // string hora minuto p.ej 1730 las cinco y media
    static String getHoraActual() {
        // Le decimos que formato queremos tenga el String HHmm
        // es dos digitos para la hora y dos digitos para los minutos
        // (los minutos van en minuscula mm para diferenciarlos del
        // mes MM, la hora, si es en formato 25h, es HH, si es en
        // formato am/pm de 12h, es hh
        String formatoHora = "HHmm";
        // La clase Calendar nos sirve para trabajar con fechas y
        // horas. El metodo getInstance nos devuelve una instancia
        // de la clase Calendar, que es un objeto del cual podremos
        // obtener el momento actual (fecha y hora), este momento
        // actual es creado en forma de un numero que
        // representa los milisegundos que han pasado desde una fecha
        // determinada definida llamada Epoch.
        Calendar calendar = Calendar.getInstance();
        // La clase SimpleDateFormat es una clase que nos permite
        // realizar un formato sobre el resultado de un objeto Date
        // del momento actual de un objeto de la clase Calendar,
        // el formato lo determina el string formatoHora que hemos
        // creado antes
        SimpleDateFormat time = new SimpleDateFormat(formatoHora);
        // Cuando empleamos el metodo .format del objeto time creado
        // de la clase SimpleDateFormat este nos devuelve un string
        // con el formato requerido de un tipo de datos Date devuelto
        // por el metodo .getTime() del objeto calendar, es decir que
        // nos devuelve la hora actual
        return time.format(calendar.getTime());
    }


    static int localizarLlaves(String[] bD, String nLlave) {
        for (int i = 0; i < bD.length; i++) {
            // La funcion string.startsWith("otra string") devuelve true
            // si string comienza con "otra string".
            if (bD[i].startsWith(nLlave)) {
                // una vez que hayamos encontrado una llave devolvemos su posicion en el array
                return i;
            }
        }
        // Si no encontramos la llave devolvemos -1
        return -1;
    }

    static String girarFecha(String fechaNormal) {
        String fechaGirada = "";
        //Por ejemplo 22012025  -->  20250122
        fechaGirada = fechaNormal.substring(4, 8); // fechaGirada = "2025"
        fechaGirada += fechaNormal.substring(2, 4); // fechaGirada = "2025"+"01" = "202501"
        fechaGirada += fechaNormal.substring(0, 3); // fechaGirada = "2025"+"22" = "20250122"
        return fechaGirada;
        //El codigo anterior lo podriamos resumir en:
        //return fechaNormal.substring(4,8)+fechaNormal.substring(2,4)+fechaNormal.substring(0,3);
    }

    public static boolean dentroFecha(String fechaInicial, String fechaLlave, String fechaFinal) {
        return (girarFecha(fechaInicial).compareTo(girarFecha(fechaLlave)) <= 0
                && girarFecha(fechaLlave).compareTo(girarFecha(fechaFinal)) <= 0);
    }

    public static void main(String[] args) {

        String nLlave = "1574689467";
        String[] bD = {"" +
//Posicion en el string
//               0123456789012345678901234567890123456789
                "1574689468 A 10012025 1900 10012025 2000",
                "1574689467 A 21012026 1600 23012026 2000",
                "1574689466 A 10012025 1100 10012025 1200",
                "1574689465 A 10012025 1900 10012025 2000",
                "1574689464 A 10012025 1900 10012025 2000",
                "1574689463 A 10012025 1900 10012025 2000"};

        //Localizamos la llave si esta en el array de Strings y devolvemos su posicion, si no esta devolvemos -1
        int posicionLlaveEnBBDD = localizarLlaves(bD, nLlave);
        //Si la llave esta
        if (posicionLlaveEnBBDD > -1) {
            String llaveAutorizada = bD[posicionLlaveEnBBDD];

            String fechaIni = llaveAutorizada.substring(13, 21); // Fecha inicial
            String fechaFinal = llaveAutorizada.substring(27, 35); // Fecha final

            if (llaveAutorizada.indexOf('A') == 11) {
                String fechaHoy = getFechaActual();
                if (dentroFecha(fechaIni, fechaHoy, fechaFinal)) {
                    System.out.println("Abro");
                }
            }
        }
    }
}