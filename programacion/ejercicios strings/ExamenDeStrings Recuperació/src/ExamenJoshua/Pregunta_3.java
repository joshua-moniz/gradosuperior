package ExamenJoshua;

public class Pregunta_3 {
    public static  String extractorHTML (String htmlcode){
        int posh1 = htmlcode.indexOf("<h1>"); //Busco la posicion de h1
        int posh2 = htmlcode.indexOf("</h1>"); //Busco donde se acaba el h1
        String titulo = htmlcode.substring(posh1+4,posh2); //Copio lo que esta entre <h1> y </h1>
        System.out.println(titulo);
        int posp = htmlcode.indexOf("<p>"); //Busco posicion de <p>
        while (posp != -1){ //entro en un bucle copiar lo que este dentro de de p
            int posp2 = htmlcode.indexOf("</p>",posp); //Busco posicion de donde acaba el <p>
            String comentario = htmlcode.substring(posp + 3,posp2); //Copio con substring el contenido dentro de las <p>
            System.out.println(comentario);
            posp = htmlcode.indexOf("<p>", posp2); //Vuelvo a buscar la posicion pero desde donde acaba <p> , para que a si me busque los siguientes
        }
        return null;
    }
    public static void main(String[] args) {
String frase ="<h1>Titulo</h1> <p>Paragrafo 1</p><p>Paragrafo 2</p> <!--comentario 1 --><p>Paragrafo 3 </p><!--comentario 2--><p>Paragrafo 4</p><!--comentario 3-->";
  extractorHTML(frase);
    }
}