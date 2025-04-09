import java.util.Arrays;

public class liga {
    partido[] partidos = {};
    String fechaInc;
    String fechaFin;
    int partidosJugados;
    equipo[] clasificaion;

    public liga(String fechaInc, String fechaFin, equipo[] clasificaion) {
        this.fechaInc = fechaInc;
        this.fechaFin = fechaFin;
        this.clasificaion = clasificaion;
    }

    public void agregarPartido(partido partido) {
        if (partidos.length < 100) {
            partidos = Arrays.copyOf(partidos, partidos.length + 1);
        }
    }

    public void actulizarPuntos(int posEquipo, int nuevoPuntos) {
        clasificaion[posEquipo].puntuacion += nuevoPuntos;

    }
    public void actualizarClasificacion() {
        for (int i = 0; i < clasificaion.length; i++) {
            for (int j = 0; j < clasificaion.length - i - 1; j++) {
                if (clasificaion[j] != null && clasificaion[j + 1] != null) {
                    if (((equipo)clasificaion[j]).getPuntos() >
                            ((equipo)clasificaion[j + 1]).getPuntos()) {
                        equipo tmp = clasificaion[j];
                        clasificaion[j] = clasificaion[j + 1];
                        clasificaion[j + 1] = tmp;
                    }
                }
            }
        }
    }
public  String mostrarClasificacion(){
    for (int i = 0; i <clasificaion.length ; i++) {
        return clasificaion[i] + "\n";
    }
    return "";
}

}

