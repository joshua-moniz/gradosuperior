import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.asserts.Assertion;


public class AdvancedCalculatorTest {
    @Test
    public void calculator() {
        double a = 40;
        double b = 50;

        double resultado = Math.pow(a, b);
        Assertions.assertEquals(10, resultado);
    }

    @Test
    public void raizTest() {
        double a = 10;
        double resultado = AdvancedCalculator.arrelQuadrada(a);
        Assertions.assertEquals(10, resultado);

    }

    @Test
    public void raiTestException() {
        double a = 10;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double resultado = AdvancedCalculator.arrelQuadrada(a);
        });
    }

    @Test
    public void modul() {
        int a = 10;
        int b = 6;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            double resultado = AdvancedCalculator.modul(a, b);
        });
    }

}
