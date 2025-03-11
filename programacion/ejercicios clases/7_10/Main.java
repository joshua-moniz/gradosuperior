import Maquinaria.Locomotora;
import Maquinaria.Trenes;
import Maquinaria.Vagones;
import Personal.Especialidad;
import Personal.Maquinistas;
import Personal.Mecanico;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Mecanico mecanico = new Mecanico("Pedro","971111111", Especialidad.motor);
        Maquinistas maquinistas = new Maquinistas("Trump","x23432343",25000,4);
        Locomotora locomotora = new Locomotora("01234",3000,1999,mecanico);
        Vagones[] vagones = new Vagones[5];
        for (int i = 0; i < vagones.length; i++) {
            vagones[i]=new Vagones(i,"carbon",5000,2300);
        }
        Trenes tren= new Trenes(locomotora,vagones,maquinistas);
    }
}