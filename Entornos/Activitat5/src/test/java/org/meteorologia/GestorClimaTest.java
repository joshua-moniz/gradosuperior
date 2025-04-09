package org.meteorologia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GestorClimaTest {

    @Test
    void faFred() {
ServeiMetereologic servie = new ServeiMetereologic();
        when(servie.obtenirTemperatura(anyString())).thenReturn(66.0);
        GestorClima gestor = mock(GestorClima.class);

        boolean result = gestor.faFred(anyString());

        Assertions.assertFalse(result);
    }
    @Test
    void GestorClima(){
        GestorClima gestor = new GestorClima(new ServeiMetereologic());
        Assertions.assertNotNull(gestor.getClass());
    }
}