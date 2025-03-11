import java.util.Arrays;

public class texto {
    char[] array = {};

    public texto() {

    }

    public void cadena(int num) {
        array = Arrays.copyOf(array, num);
    }


    public char[] getArray() {
        return array;
    }

    public void añadirPrincipio(char letra) {
        array[0] = letra;
    }

    public void añadirFinal(char letra) {
        array[array.length - 1] = letra;
    }
    public void añadirCadena(String cadena){
        for (int i = 0; i < array.length-1; i++) {
            array[i]=cadena.charAt(i);
        }
    }

    public int cantminus() {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public int cantmayus() {
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U') {
                contador++;
            }
        }
        return contador;
    }

}
