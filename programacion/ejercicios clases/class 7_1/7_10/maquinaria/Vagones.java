package maquinaria;

public class Vagones {
    String  identificacion;
    int cargaMaxima;
    int cargaActual;
    String mercancia;

    private Vagones(String identificacion, int cargaMaxima, int cargaActual, String mercancia) {
        this.identificacion = identificacion;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }
}
