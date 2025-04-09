import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        socio socio1 = new socio(1,"pablo");
        socio socio2= new socio(2,"andres");
        socio socio3= new socio(3,"sergio");
        socio [] socios = new socio[3];
        socios[0] = socio1;
        socios[1] = socio2;
        socios[2] = socio3;
        System.out.println(Arrays.toString(  socios));
        System.out.println(socio1.compareTo(socio3));
    }
}