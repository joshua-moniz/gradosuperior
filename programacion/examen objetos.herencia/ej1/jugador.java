public class jugador  extends  empleado{
    int numeroGoles;
    posicion poscion;
    int numeroTarjetasRojas;
    int numTarjetasAmarillas;

    public jugador(String nombre, int edad, String fechaInc, String fechaFin, int numeroGoles, posicion poscion, int numeroTarjetasRojas, int numTarjetasAmarillas) {
        super(nombre, edad, fechaInc, fechaFin);
        this.numeroGoles = numeroGoles;
        this.poscion = poscion;
        this.numeroTarjetasRojas = numeroTarjetasRojas;
        this.numTarjetasAmarillas = numTarjetasAmarillas;
    }
    public  void goles(int goles){
        numeroGoles += goles;
    }
    public  void amarilla(int amarillas){
        numTarjetasAmarillas += amarillas;
    }
    public  void rojas(int rojas){
        numeroTarjetasRojas += rojas;
    }

    @Override
    public String toString() {
        return super.toString() + "Goles" + numeroGoles + "Posicion" + poscion + "Amarillas" + numTarjetasAmarillas + "Rojas" + numeroTarjetasRojas;
    }
}
