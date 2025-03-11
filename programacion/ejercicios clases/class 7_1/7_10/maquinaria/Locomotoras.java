package maquinaria;

import personas.Mecanico;

public class Locomotoras {
    String matricula;
    int potencia;
    int añoFabricacion;
    Mecanico mecanico;

    public Locomotoras(String matricula, int potencia, Mecanico mecanico, int añoFabricacion) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.mecanico = mecanico;
        this.añoFabricacion = añoFabricacion;
    }
}
