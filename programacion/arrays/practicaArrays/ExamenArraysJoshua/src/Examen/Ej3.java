package Examen;

public class Ej3 {
    public static boolean compare(int[] arr1, int[] arr2) {
        boolean verdadre = true;
        if (arr1.length != arr2.length) {
            verdadre = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]){
                    verdadre=false;
                    break;
                }
            }
        }
return verdadre;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 4};
        System.out.println("True = Iguales // False= No Iguales");
        System.out.println(compare(array1,array2));
    }
}
