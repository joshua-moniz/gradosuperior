package org.serveibancari;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class GestorCompteTest {

    @Test
    public void potRealitzarPagament() {
        //Arrange
        CompteBancari compteBancariMock = mock(CompteBancari.class);

        when(compteBancariMock.obtenirSaldo(anyString())).thenReturn(100.0);

        GestorCompte gestorCompte = new GestorCompte(compteBancariMock);

        //Act
        boolean result = gestorCompte.potRealitzarPagament(anyString(), 150);

        //Assert
        Assertions.assertFalse(result);
        verify(compteBancariMock, times(1)).obtenirSaldo(anyString());
    }
}