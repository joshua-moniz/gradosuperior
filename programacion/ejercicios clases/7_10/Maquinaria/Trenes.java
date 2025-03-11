package Maquinaria;

import Personal.Maquinistas;

public class Trenes {
    Locomotora loco;
    Vagones[] vagone;
    Maquinistas maqui;
    final int NUM_VAGONES = 5;

    public Trenes(Locomotora loco, Vagones[] vagone, Maquinistas maqui) {
        this.loco = loco;
        if(vagone.length <= NUM_VAGONES)
            this.vagone = vagone;
        else
            this.vagone = null;
        this.maqui = maqui;
    }
}
