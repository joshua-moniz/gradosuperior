import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni = "";
        CuentaCorriente cuenta = new CuentaCorriente();
        String nombre = "";
        int eleccion = 0;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Que quieres hacer || 1 Crear cuenta || 2 sascar dinero || 3 meter dinero || 4 Mostar informacion || ");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1 -> {
                    System.out.println("Dni");
                    dni = sc.next();
                    System.out.println("Nombre");
                    nombre = sc.next();
                    cuenta = new CuentaCorriente(dni, nombre);
                }
                case 3 -> {
                    System.out.println("mete dinero ");
                    double dinero = sc.nextDouble();
                    cuenta.ingresarDinero(dinero);
                }

                case 2 -> {
                    System.out.println("Saca dinero");
                    double sacar = sc.nextDouble();
                    cuenta.regreso(sacar);
                }
                case 4 -> {
                    System.out.println(cuenta.mostrarInformacion());

                }
                case 5 -> {
                    seguir = false;
                }
            }
        }


    }
}