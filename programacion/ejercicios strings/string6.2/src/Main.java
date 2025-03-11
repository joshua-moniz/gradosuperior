import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera palabra");
        String primera = sc.nextLine();
        System.out.println("Segunda palabra");
        String segundo = sc.nextLine();
        if (segundo.length()==primera.length()) System.out.println("Son iguales");
        if (segundo.length() < primera.length()) System.out.println("La primera palabra es mayor");
        if (segundo.length()>primera.length()) System.out.println("La segunda palabra es mayor");



    }
}
