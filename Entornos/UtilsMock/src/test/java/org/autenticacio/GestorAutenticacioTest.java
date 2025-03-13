package org.autenticacio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorAutenticacioTest {

    @Test
    void iniciarSessio() {
        ServeiAutenticacio servei = new ServeiAutenticacio();
        GestorAutenticacio gestor = new GestorAutenticacio(servei);

    }
}