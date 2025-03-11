package Personal;

public class Maquinistas extends Personal{
    String dni;
    double salario;
    int rango;
    public Maquinistas(String nombre, String dni, double salario, int rango){
        super(nombre);
        this.dni=dni;
        this.salario=salario;
        this.rango=rango;
    }
}