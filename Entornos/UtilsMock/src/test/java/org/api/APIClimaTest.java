package org.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIClimaTest {

    @Test
    void obtenirTemperatura() {
        APIClima apiclima = new APIClima();
        double resutlado = apiclima.obtenirTemperatura("Madrid");
        Assertions.assertEquals(0,resutlado);
    }
}