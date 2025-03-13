import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.testng.asserts.Assertion;

public class CompteBancariTest {
    double a = 120;

    @Test

    public void CompteBancari() {
        CompteBancari p = new CompteBancari(a);
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            CompteBancari cuenta = new CompteBancari(a);
        });
    }
    @Test
    public void ingresar(){
        double nuevo = 70;
       double resultado = a+ nuevo;
       Assertions.assertEquals(20,resultado);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CompteBancari cuenta = new CompteBancari(a);
            cuenta.ingressar(a);
        });
    }
    @Test
    public void retirar(){
        double nuevo = 70;
        double resultado = a - nuevo;
        Assertions.assertEquals(20,resultado);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CompteBancari cuenta = new CompteBancari(a);
            cuenta.retirar(a);
        });
    }

}
