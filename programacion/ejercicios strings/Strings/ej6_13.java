public class ej6_13 {
    public static void main(String[] args) {
        String frase = " if a==3  /*igual a tres*/ a++; /*incrementamos a*/";
        int posicionInicial = 0;
        int posicion = frase.indexOf("/*");
        int posiciondos = frase.indexOf("*/");

        String finatres = "";
        while (posicion > 0) {
            String fina = "";
            String finados = "";
            int tam = frase.length();
            posicion = frase.indexOf("/*");
            posiciondos = frase.indexOf("*/");


            if (posicion > 0) {
                fina = frase.substring(posicionInicial, posicion);
                finados = frase.substring(posiciondos + 2, tam);
                frase = fina + finados;
            }
        }
        System.out.println(frase);
    }
}

