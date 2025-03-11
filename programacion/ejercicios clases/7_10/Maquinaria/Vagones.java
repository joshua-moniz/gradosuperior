package Maquinaria;

public class Vagones {
    int numIdent;
    final int CARGA_MAX;
    int carga_Actual;
    String mercancia;

    public Vagones(int numIdent, String mercancia, int carga_Actual, int CARGA_MAX) {
        this.numIdent = numIdent;
        this.mercancia = mercancia;
        this.carga_Actual = carga_Actual;
        this.CARGA_MAX = CARGA_MAX;
    }
}
