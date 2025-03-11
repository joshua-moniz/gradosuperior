import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static public String[] encontar(String palabrajogo, String[] palabrasVacia, String respuesta) {
        for (int i = 0; i < palabrajogo.length(); i++) {
            if (palabrajogo.charAt(i) == respuesta.charAt(0)) {
                palabrasVacia[i] = respuesta;
            }
        }

        return palabrasVacia;
    }

    static public String palabraSacar(String[] palabras) {
        int numeroAle = (int) (Math.random() * 10 + 1);
        String pala = palabras[numeroAle];
        return pala;
    }

    static public String[] vacio(String palabrajogo) {
        String[] arrayvacio = new String[palabrajogo.length()];
        Arrays.fill(arrayvacio, "_");
        return arrayvacio;
    }
    public static int vidas (int vida,String palabrajogo, String respuesta){
        int num = palabrajogo.indexOf(respuesta);
        if (num<0){
            vida++;
        }
        return vida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int vidas = 0;
        String[] palabras = {"eclipse", "murmullo", "espejismo", "brisa", "relampago", "laberinto", "susurro", "horizonte", "carcajada", "nostalgia" };
        String palabraJuego = palabraSacar(palabras);
        System.out.println("Que empiece el juego");

        System.out.println(palabraJuego);
        String[] vacios = vacio(palabraJuego);
        do {
            System.out.println(Arrays.toString(vacios));
            System.out.println("Introduce una letra o una Palabra");
            String respuesta = sc.next();
            if (respuesta.equals(palabraJuego)) {
                System.out.println("Has ganado");
                vidas=-1;
                seguir = false;
            }
            vacios = encontar(palabraJuego, vacios, respuesta);
            vidas=vidas(vidas,palabraJuego,respuesta);
            switch (vidas) {
                case 0:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 1:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 2:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println(" |   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 3:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println("/|   |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 4:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println("/|/  |");
                    System.out.println("     |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 5:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println("/|/  |");
                    System.out.println("/    |");
                    System.out.println("     |");
                    System.out.println("=========");
                    break;
                case 6:
                    System.out.println(" +---+");
                    System.out.println(" |   |");
                    System.out.println(" O   |");
                    System.out.println("/|/  |");
                    System.out.println("/ /  |");
                    System.out.println("     |");
                    System.out.println("=========");
                    seguir=false;
                    break;

            }

        }while (seguir) ;
    }
}
