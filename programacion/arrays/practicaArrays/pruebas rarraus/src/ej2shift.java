import java.util.Arrays;

public class ej2shift {
    public static void main(String[] args) {
        int[] elem = {};
        int [] contaor = {};
        int[] array = {4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3};
        Arrays.sort(array);
        int pos=-1;
        for (int i = 0; i <array.length ; i++) {
            pos=Arrays.binarySearch(elem,array[i]);
            if (pos<0){
                elem=Arrays.copyOf(elem,elem.length+1);
                contaor=Arrays.copyOf(contaor,contaor.length+1);
                elem[elem.length-1]=array[i];
                contaor[contaor.length-1]++;

            }else {
                contaor[pos]++;
            }
        }


        System.out.println(Arrays.toString(elem));
        System.out.println(Arrays.toString(contaor));
    }

}
