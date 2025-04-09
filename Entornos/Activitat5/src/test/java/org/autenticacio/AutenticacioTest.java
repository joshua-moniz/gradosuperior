package org.autenticacio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class AutenticacioTest {

    @Test
    void autenticar() {

        //arrange
        Autenticacio gestorAutenticacio = new Autenticacio();
        String contrasñea = "1234";
        String cuenta = "admin";
        //act
        boolean resultado = gestorAutenticacio.autenticar(cuenta, contrasñea);
        //assert
        Assertions.assertTrue(resultado);
    }

    @Test
    void autenticarfalse() {

        //arrange
        Autenticacio gestorAutenticacio = new Autenticacio();
        String contrasñea = "1234";
        String cuenta = "main";
        //act
        boolean resultado = gestorAutenticacio.autenticar(cuenta, contrasñea);
        //assert
        Assertions.assertFalse(resultado);
    }

    @Test
    void autenticarerror() {

        //arrange
        Autenticacio gestorAutenticacio = new Autenticacio();
        String contrasñea = "1234";
        String cuenta = "main";
        //act
        //assert
        Assertions.assertThrows(RuntimeException.class, () -> {
            new Autenticacio().autenticar(cuenta, contrasñea);
        });
    }
}

