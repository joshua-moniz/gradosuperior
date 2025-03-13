package org.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GestorClimaTest {

    @Test
    void faFred() {
        APIClima apliclima= mock(APIClima.class);
        when(apliclima.obtenirTemperatura(anyString())).thenReturn(66.0);
        GestorClima gestorclima = new GestorClima(apliclima);

        boolean result = gestorclima.faFred("madrid");

        Assertions.assertFalse(result);

    }
@Test
    void GestorClima(){
        GestorClima gestor = new GestorClima(new APIClima());
    Assertions.assertNotNull(gestor.getApiClima());
    }

}