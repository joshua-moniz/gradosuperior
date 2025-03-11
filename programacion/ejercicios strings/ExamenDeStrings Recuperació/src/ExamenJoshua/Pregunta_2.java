package ExamenJoshua;

public class Pregunta_2 {
    public static int contadorAr(String str) {
        int contador = 0;
        String nuevo = "";
        String palabra = "";
        for (int i = 0; i < str.length(); i++) { //Creo un bucle en el cual voy a ir mirando cada poscion del string
            if (str.charAt(i) != ' ') {  //Entraremos en el if si el posicion no es igual a un espacio
                palabra += str.charAt(i); //en este caso añadimos el char de la posicion en un string

            }else { //en el caso de que la posicion i si que sea un espacio...
                if (palabra.contains("ar")){  //miramos si en la palabra que hememos guardado esta 'ar'
                    contador++; //en el caso de que si que haya un ar subimos el contador
                }
                palabra=""; //reiniciamos la palabra para poder guardar las siguientes al volver a empezar el ciclo
            }


        }
        return contador;
    }
    public static int contadorEr(String str) {
        int contador = 0;
        String nuevo = "";
        String palabra = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                palabra += str.charAt(i);

            }else {
                if (palabra.contains("er")){
                    contador++;
                }
                palabra="";
            }


        }
        return contador;
    }
    public static int contadorIr(String str) {
        int contador = 0;
        String nuevo = "";
        String palabra = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                palabra += str.charAt(i);

            }else {
                if (palabra.contains("ir")){
                    contador++;
                }
                palabra="";
            }


        }
        return contador;
    }
    public static void main(String[] args) {
        String frase = "Hola Mundo , a programar. Vamos a disfrutar.Debeis venir a romper el codigo.";
        int contadorAr = contadorAr(frase);
        int contadorEr = contadorEr(frase);
        int contadorIr= contadorIr(frase);
        System.out.println(frase);
        System.out.println("Verbos acabados en -ar "+ contadorAr);
        System.out.println("Verbos acabados en -er "+ contadorEr);
        System.out.println("Verbos acabados en -ir "+ contadorIr);

    }
}