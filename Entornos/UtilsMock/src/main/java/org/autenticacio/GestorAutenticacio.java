package org.autenticacio;

public class GestorAutenticacio {
    private ServeiAutenticacio serveiAutenticacio;

    public GestorAutenticacio(ServeiAutenticacio serveiAutenticacio) {
        this.serveiAutenticacio = serveiAutenticacio;
    }

    public boolean iniciarSessio(String usuari, String contrasenya) {
        return serveiAutenticacio.autenticar(usuari, contrasenya);
    }
}
