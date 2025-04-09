package org.meteorologia;

public class GestorClima {
    private ServeiMetereologic serveiMetereologic;

    public GestorClima(ServeiMetereologic serveiMetereologic) {
        this.serveiMetereologic = serveiMetereologic;
    }

    public boolean faFred(String ciutat) {
        return serveiMetereologic.obtenirTemperatura(ciutat) < 10;
    }
}