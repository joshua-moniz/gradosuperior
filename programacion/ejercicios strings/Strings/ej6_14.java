import java.util.Arrays;
import java.util.Scanner;

public class ej6_14 {
    static public String[] añadirContacto(String[] array, String nombre) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = nombre;
        return array;
    }

    static public int[] añadirNumero(int[] numeros, int numero) {
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numero;
        return numeros;
    }

    static public int buscarTelefono(int[] numeros, String[] nombres, String Nombre) {
        int temp = 0;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(Nombre)) {
                temp = i;
                break;
            }
        }
        int numero = numeros[temp];
        System.out.println(numero);
        return numero;
    }

    static public String[] ordenar(String[] nombres) {
        String[] copia =Arrays.copyOf(nombres,nombres.length);
        Arrays.sort(copia);
        return copia;
    }
    static public int[] numerosOrdenados(String [] array , int [] numeros, String [] arrayCopia){
        int [] numerosOrden=new int[numeros.length];
        int posicion=0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (arrayCopia[i].equals(array[j])){
                    numerosOrden[i]=numeros[j];
                }
            }
        }
        return numerosOrden;
    }

    public static void main(String[] args) {
        boolean seguir = true;
        String[] copia = {};
        String[] nombres = {};
        int[] numeros = {};
        do {


            System.out.println("Que quieres hacer");
            System.out.println("1.Añadir un contacto y numero");
            System.out.println("2.Buscar telefono");
            System.out.println("3.Mostrar contactos");
            System.out.println("4.Salir");
            Scanner sc = new Scanner(System.in);
            int eleccion = sc.nextInt();
            sc.reset();
            switch (eleccion) {
                case 1: {
                    System.out.println("Nombre");
                    String contacto = sc.next();
                    System.out.println("Numero");
                    int numeroContacto = sc.nextInt();
                    nombres = añadirContacto(nombres, contacto);
                    numeros = añadirNumero(numeros, numeroContacto);
                    System.out.println(Arrays.toString(nombres));
                    System.out.println(Arrays.toString(numeros));


                }
                break;
                case 2: {
                    System.out.println("De quien quieres el telefono");
                    String nombre = sc.next();
                    System.out.println("Su telefono es: ");
                    buscarTelefono(numeros, nombres, nombre);

                }
                break;
                case 3: {
                    copia = ordenar(nombres);
                    System.out.println(Arrays.toString(copia));
                    System.out.println(Arrays.toString(numerosOrdenados(nombres,numeros,copia)));
                }
                break;
                case 4: {
                    seguir = false;
                }
            }

        } while (seguir);
    }
}
