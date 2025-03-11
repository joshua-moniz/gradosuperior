//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        vehiculo coche1 = new vehiculo();
        vehiculo coche2 = new vehiculo()
        vehiculo[] stock = new vehiculo[20];
        coche1.modelo = "renault1";
        coche1.numRuedas = 5;
        int ruedas = coche1.numRuedas;
        coche1.setNumRuedas(5);
        coche1.setModelo("renault");
        vehiculo.letraMatricula= 'A';
        System.out.println(coche1.getLetraMatricula());

    }
}