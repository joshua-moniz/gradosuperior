import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {

    @ParameterizedTest
    @CsvSource({
            "suma ,1,2,3",
            "resta,1,2,3",
            "multiplicar,2,3,1",
            "dividir,1,0,2",
            "dividir,2,1,2"
    })
    void calcular(String signo, double a, double b, double resultado) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        Assertions.assertEquals(resultado,calculadora.calcular(signo,a,b));
    }

    @org.junit.jupiter.api.Test
    void mostrarResultat() {
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}