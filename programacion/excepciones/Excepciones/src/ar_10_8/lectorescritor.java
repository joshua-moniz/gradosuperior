package ar_10_8;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class lectorescritor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean errorFitxer = false ;
        do {

            System.out.println("introduce el nombre fichero a cambiar");
            String nomFitx = sc.next();
            final String ruta = "src/ar_10_8/";
            String nomFitxEscritura = "copia_de_" + nomFitx;
            BufferedReader br =null;
            BufferedWriter bw =null;
            try {
                 br = new BufferedReader(new FileReader(ruta + nomFitx));
                 bw = new BufferedWriter(new FileWriter(nomFitxEscritura , true));
                String stringTexto ="";

                while ((stringTexto = br.readLine()) != null){
                    bw.write(stringTexto);
                }
                bw.flush();
                errorFitxer = false;
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
                errorFitxer = true;
            }catch (IOException e){
                System.out.println("andres nenuco");
            }
            finally {
                try {
                    if (bw != null && br != null) {
                        bw.close();
                        br.close();
                    }
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        } while (errorFitxer);

    }
}
