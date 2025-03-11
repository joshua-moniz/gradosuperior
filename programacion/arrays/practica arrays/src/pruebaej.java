import java.util.Arrays;

public class pruebaej {
    public static void main(String[] args) {
        /*
        Escriu un programa que compti quantes vegades apareix cada número en un matriu d'enters. Ha de crear una matriu dels elements sense repetir i una de les freqüències de la seva aparició. Imprimeix cada número juntament amb la freqüència.
{4, 1, 2, 3,4, 1, 2, 3,4, 1, 2, 3,4, 1, 2, 3,4, 1, 2, 3}.
int[] elem = {4, 1, 2, 3};
int[] cont= {5,5,5,5};
         */
       int [] a = {4, 1, 2, 3,4, 1, 2, 3,4, 1, 2, 3,4, 1, 3,4, 1, 2, 3};
        int[] elem = {};
        int[] cont= {};
        Arrays.sort(a);
        int posicion=-1;
        for (int i = 0; i <a.length ; i++) {
            posicion = Arrays.binarySearch(elem,a[i]);
        if (posicion<0){
            elem=Arrays.copyOf(elem,elem.length+1);
            cont=Arrays.copyOf(cont,cont.length+1);
            elem[elem.length-1]=a[i];

        }
            cont[cont.length-1]++;
        }
        System.out.println(Arrays.toString(elem));
        System.out.println(Arrays.toString(cont));
    }

}
