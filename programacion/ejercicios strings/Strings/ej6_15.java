public class ej6_15 {

            public static void main(String[] args) {
                String frase = "<h1>Titul</h1><p>cosas escrites</p><p>cosas  escrites1</p><p>cosas  escrites4</p><p>cosas  escrites3</p><p>cosas  escrites4</p>";

                // Extraer el contenido dentro de <h1>...</h1>
                int posicionH1Inicio = frase.indexOf("<h1>");
                int posicionH1Fin = frase.indexOf("</h1>");
                if (posicionH1Inicio != -1 && posicionH1Fin != -1) {
                    String titulo = frase.substring(posicionH1Inicio + 4, posicionH1Fin);
                    System.out.println(titulo);
                }

                // Extraer el contenido dentro de <p>...</p>
                int posicionPInicio = frase.indexOf("<p>");
                while (posicionPInicio != -1) {
                    int posicionPFin = frase.indexOf("</p>", posicionPInicio);
                    if (posicionPFin == -1) break; // Si no encuentra </p>, salimos del bucle

                    // Extraer texto entre <p> y </p>
                    String contenidoP = frase.substring(posicionPInicio + 3, posicionPFin);
                    System.out.println(contenidoP);

                    // Buscar la siguiente aparición de <p>
                    posicionPInicio = frase.indexOf("<p>", posicionPFin);
                }
            }
        }

