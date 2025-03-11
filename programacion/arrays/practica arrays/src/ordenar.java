import java.util.Arrays;

public class ordenar {
    public static void main(String[] args) {
        int [] taulaDesordenada = {60,70,20,40,50,100,30,90,80,10};
        int [] taulaOrdenada = Arrays.copyOf(taulaDesordenada, taulaDesordenada.length);
        int copia=0;
        for (int i = 0; i < taulaOrdenada.length; i++) {
            for (int j = 0; j < taulaOrdenada.length - 1 - i; j++) {
                if (taulaOrdenada[j] < taulaOrdenada[j + 1]) {
                    copia = taulaOrdenada[j];
                    taulaOrdenada[j] = taulaOrdenada[j + 1];
                    taulaOrdenada[j + 1] = copia;
}
            }
        }
        System.out.println(Arrays.toString(taulaOrdenada));

    }
}
