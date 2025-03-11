package ExamenJoshua;

import java.util.Scanner;

public class Pregunta_1 {
    public static String cifradoCesar (String oracion){
        String nuevo="";
        for (int i = 0; i <oracion.length() ; i++) { //creo un bucle para ver cada posicion de string
            if (oracion.charAt(i)!=' ') { //mientras la posicion no sea igual a un espacio continuaremos
                int a = oracion.charAt(i);  //paso el char que hay en la posicion i a un int
                a = a + 4; //subo 4 posiciones al int para que me de la letra que esta 4 posiciones mas adelante que la encontrada

                nuevo += (char) a; // añado esa nueva letra que hemos buscado antes a un nuevo String
            }else nuevo+=' '; //en caso de que la posicion i sea un espacio , se añadira en el nuevo string como espacio
        }
        return nuevo; //devolvemos en string con cada letra remplazada
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las palabras");
        String palabra = sc.nextLine();
        System.out.println(cifradoCesar(palabra));
    }
}