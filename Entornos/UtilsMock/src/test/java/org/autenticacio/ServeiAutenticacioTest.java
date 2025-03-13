package org.autenticacio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServeiAutenticacioTest {

    @Test
    void autenticar() {
        ServeiAutenticacio servei = new ServeiAutenticacio();
        GestorAutenticacio autenticacio = new GestorAutenticacio(servei);


    }
}