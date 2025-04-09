import java.util.Arrays;

public class equipo {
    String nombreClub;
    jugador[] jugadores={};
    entrenador entrenador;
    int puntuacion;

    public equipo(String nombreClub, entrenador entrenador, int puntuacion, jugador[] jugadores) {
        this.nombreClub = nombreClub;
        this.entrenador = entrenador;
        this.puntuacion = puntuacion;
        this.jugadores=jugadores;
    }
    public void actualizarEstadisticas(int golesfavor , int golesContra){
        if (golesfavor > golesContra){
            puntuacion +=3;
        }
        if (golesfavor < golesContra){
            puntuacion +=0;
        }
        if (golesfavor == golesContra){
            puntuacion +=1;
        }
    }
    public int getPuntos(){
       return puntuacion;
    }

    @Override
    public String toString() {
        return "equipo{" +
                "nombreClub='" + nombreClub + '\'' +
                ", jugadores=" + Arrays.toString(jugadores) +
                ", entrenador=" + entrenador +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
