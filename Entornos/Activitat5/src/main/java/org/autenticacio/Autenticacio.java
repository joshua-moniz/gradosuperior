package org.autenticacio;

public class Autenticacio {
    public boolean autenticar(String usuari, String contrasenya) {
        if (usuari.equals("admin") && contrasenya.equals("1234")) {
            return true;
        } else if (usuari.equals("admin")) {
            throw new RuntimeException("Contrasenya incorrecta.");
        }

        return false;
    }
}
