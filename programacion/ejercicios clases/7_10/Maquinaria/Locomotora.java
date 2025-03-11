package Maquinaria;

import Personal.Mecanico;

public class Locomotora {
    String matricula;
    double potencia;
    int a_fabricacion;
    Mecanico mecanicoLocomotora;

    public Locomotora(String matricula, double potencia, int a_fabricacion, Mecanico mecanicoLocomotora) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.a_fabricacion = a_fabricacion;
        this.mecanicoLocomotora = mecanicoLocomotora;
    }
}
