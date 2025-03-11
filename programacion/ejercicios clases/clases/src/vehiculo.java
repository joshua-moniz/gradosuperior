public class vehiculo {
    public  vehiculo ( int numRuedas, String modelo, int puertas, String combustible){
        this.numRuedas = numRuedas;
        this.modelo=modelo;
        this.puertas=puertas;
        this.combustible=combustible;
    }
    public vehiculo(){

    }
    int numRuedas;
    String modelo;
    int puertas;
    String combustible;
    static char  letraMatricula ='E';

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public static char getLetraMatricula() {
        return letraMatricula;
    }

    public static void setLetraMatricula(char letraMatricula) {
        vehiculo.letraMatricula = letraMatricula;
    }
}

