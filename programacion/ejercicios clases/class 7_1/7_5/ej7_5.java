import java.util.Scanner;

public class ej7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hora tiempo = new hora();
int minuto = 0;
int hora =0;
int segundo = 0;
        System.out.println("Hora");
        hora = sc.nextInt();
        System.out.println("Minuto");
        minuto=sc.nextInt();
        System.out.println("Segundo");
        segundo=sc.nextInt();
        tiempo= new hora(hora,minuto,segundo);
        System.out.println("24H");
        System.out.println(tiempo.formato24h(hora,minuto,segundo));
        System.out.println("12H");
        System.out.println(tiempo.formato12h(hora,minuto,segundo));
    }
}

