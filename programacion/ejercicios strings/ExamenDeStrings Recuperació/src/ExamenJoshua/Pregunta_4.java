package ExamenJoshua;

import java.util.Scanner;

public class Pregunta_4 {
    public static  String contador (String str, String subStr){
        int pos = str.indexOf(subStr); //Busco la posicion del substring que estamos buscando
        int tamSubstr = subStr.length();

        while (pos!=-1) { // entro en un bucle para poder quitar el substring las veces que aparezca (con la condicion de que la poscion sea mayor a -1 es decir que si que este en el string)
            String frase = str.substring(0, pos); //Copio lo que este antes del substring hasta su posicion
            System.out.print(frase + " "); //Imprimo lo copiado con un espacio para que no se junten las siguientes
            str = str.substring(pos +tamSubstr, str.length()); //Copio la misma frase pero quitando lo ya copiado para que no se me repita

            pos=str.indexOf(subStr); //Vuelvo a darle una posicion para evitar cualquier tipo de repeticion
        }


        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String frase = "hola amigos de la lana";
        System.out.println(frase);
        System.out.println("Que quieres borrar");
        String buscar = sc.next();
       contador(frase,buscar);
    }
}