import java.util.Scanner;

public class si {
    Integer leerEntero() {
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();
            return num;
        } catch (Exception e) {
            System.out.println("Pon un numero");
        }
        return 0;
    }
}
