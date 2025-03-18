//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        horaExacta hora = new horaExacta(23, 59,59);
        horaExacta horanueva = new horaExacta(23, 5,59);

        System.out.println(hora.toString());
        System.out.println(hora.equals(horanueva));
    }
}