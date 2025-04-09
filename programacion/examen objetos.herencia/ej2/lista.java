import java.util.Arrays;

public class lista {
    Integer[] lista={};

    public lista() {

    }

    public lista(Integer[] lista) {
        this.lista = lista;
    }

    public boolean add(Integer elem, int pos) {
        boolean confirmar;
        if (pos > lista.length || pos < 0) {
            return confirmar = false;
        }
        lista = Arrays.copyOf(lista, lista.length + 1);
        System.arraycopy(lista, pos, lista, pos + 1, lista.length - 1-pos);
        lista[pos]=elem;
confirmar=true;
        return confirmar;

    }
    public String toString(){
        String list="";
        for (int i = 0; i <lista.length ; i++) {
            list += lista[i] +" ";
        }
return  list;
    }
    public Integer remove (int pos){
        if (pos < 0 || pos > lista.length - 1) return null;
        Integer devolver = lista[pos];
        System.arraycopy(lista, pos + 1, lista, pos, lista.length - (pos + 1));
        lista = Arrays.copyOf(lista, lista.length - 1);
        return devolver;
    }
    public int length(){
        int tam=lista.length;
        return tam ;
    }

}
