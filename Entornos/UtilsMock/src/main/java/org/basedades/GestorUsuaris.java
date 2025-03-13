package org.basedades;

public class GestorUsuaris {
    private BaseDadesUsuaris baseDades;

    public GestorUsuaris(BaseDadesUsuaris baseDades) {
        this.baseDades = baseDades;
    }

    public String obtenirMissatgeSalutacio(int id) {
        return "Hola, " + baseDades.obtenirNomUsuari(id) + "!";
    }
}
