import java.io.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final String nomL1 = "src/list1";
        final String nomL2 = "src/list2";
        String[] archivosALeer = {nomL1, nomL2};
        String[] numero = {""};
        BufferedReader br = null;
        for (int i = 0; i < 2; i++) {
            try {
                br = new BufferedReader(new FileReader(archivosALeer[i]));
                String fichero = "";
                while ((fichero = br.readLine()) != null) {
                   numero = Arrays.copyOf(numero, numero.length + 1);
                    numero[numero.length - 1] = fichero;
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Arrays.sort(numero);
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/resultado.txt" , true));
            for (String str : numero){
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}