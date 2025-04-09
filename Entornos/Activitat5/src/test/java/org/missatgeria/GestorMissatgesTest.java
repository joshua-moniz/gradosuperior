package org.missatgeria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class GestorMissatgesTest {

    @Test
    void enviarSalutacio() {
        Missatgeria mensaje = mock(Missatgeria.class);
        GestorMissatges gestor = new GestorMissatges( mensaje);

        //act
        gestor.enviarSalutacio("main");

        //Assert
        verify(mensaje,times(1)).enviarMissatge(anyString(),anyString());
    }
}