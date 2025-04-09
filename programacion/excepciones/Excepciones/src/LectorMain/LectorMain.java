package LectorMain;

import java.io.*;

public class LectorMain {
    public static void main(String[] args) {
        String fichero = "C:\\Users\\admin\\Desktop\\fp\\gradosuperior\\programacion\\excepciones\\Excepciones\\src\\texto.txt";
        FileReader fr = null;
        File fichero2 = new File(fichero);

        String texto = "";
        try {
            fr = new FileReader(fichero);
            int contador = fr.read();

            while (contador != -1) {
                texto = texto + (char) contador;
                contador = fr.read();
            }
            System.out.println(texto);
        } catch (FileNotFoundException e) {
            System.out.println("no fichero");
            ;
        } catch (IOException e) {
            System.out.println("Fallo IO");
            ;
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
