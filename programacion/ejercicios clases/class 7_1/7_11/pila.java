import java.util.Arrays;

public class pila {
    Integer [] pila;
    public  pila(){
        pila = new Integer[0];
    }
    public pila(Integer[] pila){
        this.pila=pila;
    }
    public  void apilar(Integer num){
        pila = Arrays.copyOf(pila,pila.length+1);
        pila[pila.length-1]=num;
    }
    public  Integer desapilar(){
        Integer num = pila[pila.length-1];
        pila=Arrays.copyOf(pila,pila.length-1);
        return num;
    }
    public String toString(){
        String str="";
        for (Integer num : pila) {
            str +=String.valueOf(num) + " ";
        }
        return str;
    }
    public Integer[] getPila() {
        return pila;
    }
}
