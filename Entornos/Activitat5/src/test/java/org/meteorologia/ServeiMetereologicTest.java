package org.meteorologia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServeiMetereologicTest {

    @Test
    void obtenirTemperatura() {
        ServeiMetereologic servei = new ServeiMetereologic();
        double result = servei.obtenirTemperatura("Madrir");
        Assertions.assertEquals(0.0,result);
    }
}