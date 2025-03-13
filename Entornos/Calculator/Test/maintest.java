import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class maintest {
    @Test
    public void addPrueba() {
        Calculator calculadora = new Calculator();
        //Assert
        int num1 = 20;
        int num2 = 4;
        //Act
        int resultado = num1 + num2;
        //Assert
        Assert.assertEquals(24, resultado);
    }

    @Test
    public void substractTest() {
        int num1 = 20;
        int num2 = 4;

        int resultado = num1 - num2;

        Assert.assertEquals(16, resultado);
    }

    @Test
    public void divide() {
        int num1 = 20;
        int num2 = 4;

        int resultado = num1 / num2;

        Assert.assertEquals(5, resultado);
    }

    @Test
    public void multiply() {
        int num1 = 20;
        int num2 = 4;

        int resultado = num1 * num2;

        Assert.assertEquals(80, resultado);
    }

    @Test
    public void cuadratica() {
        Calculator calculaotr= new Calculator();
        double a = 1;
        double b = -5;
        double c = 6;
        double positiveValue = 0;
        double negativeValue = 0;


        double discriminant = b * b - 4 * a * c;

            positiveValue = (-b + Math.sqrt(discriminant)) / (2 * a);
            negativeValue = (-b - Math.sqrt(discriminant)) / (2 * a);



        Assert.assertEquals(Optional.of(4),positiveValue);
        Assert.assertEquals(Optional.of(2),positiveValue);
    }

}
