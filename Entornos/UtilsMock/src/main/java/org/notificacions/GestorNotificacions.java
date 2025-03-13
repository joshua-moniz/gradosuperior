package org.notificacions;

public class GestorNotificacions {
    private Notificacio notificacions;

    public GestorNotificacions(Notificacio notificacions) {
        this.notificacions = notificacions;
    }

    public void enviarAvis(String usuari) {
        notificacions.enviarMissatge(usuari, "Tens un nou missatge.");
    }
}
