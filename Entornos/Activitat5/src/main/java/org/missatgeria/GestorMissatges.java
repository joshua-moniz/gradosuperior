package org.missatgeria;

public class GestorMissatges {
    private Missatgeria missatgeria;

    public GestorMissatges(Missatgeria missatgeria) {
        this.missatgeria = missatgeria;
    }

    public void enviarSalutacio(String usuari) {
        missatgeria.enviarMissatge(usuari, "Benvingut a la nostra plataforma!");
    }
}