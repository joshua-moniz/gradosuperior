import java.net.Inet4Address;
import java.util.Arrays;

public class cola  extends lista {
    public cola() {
    }

    public cola(Integer[] lista) {
        super(lista);
    }

    public void encolar(Integer elem) {
        cola cola = new cola(lista);
        cola.add(elem, lista.length - 1);
        lista=Arrays.copyOf(lista,lista.length+1);
        lista[lista.length-1]=elem;
    }

    public Integer desencolar() {
        cola cola = new cola(lista);
        Integer num = cola.remove(0);
        lista= Arrays.copyOf(lista, lista.length-1);
        return num;

    }

}
