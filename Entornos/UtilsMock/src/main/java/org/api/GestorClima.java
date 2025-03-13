package org.api;

public class GestorClima {
    private APIClima apiClima;

    public APIClima getApiClima() {
        return apiClima;
    }

    public GestorClima(APIClima apiClima) {
        this.apiClima = apiClima;

    }

    public boolean faFred(String ciutat) {
        return apiClima.obtenirTemperatura(ciutat) < 10;
    }
}
