package org.serveibancari;

public class GestorCompte {
    private CompteBancari compteBancari;

    public GestorCompte(CompteBancari compteBancari) {
        this.compteBancari = compteBancari;
    }

    public boolean potRealitzarPagament(String compte, double importPagament) {
        return compteBancari.obtenirSaldo(compte) >= importPagament;
    }
}
