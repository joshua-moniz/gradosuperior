import java.util.Arrays;

public class lista {
Integer[] lista;

    public lista(){

    }
    public lista(Integer [] lista){
        this.lista = lista;
    }
    public void reiniciarLista(){
        lista = new Integer[0];
    }

    public Integer[] getLista() {
        return lista;
    }
    public void insertEnd(Integer[]lista2){
   int tam = lista.length;
   lista=Arrays.copyOf(lista,lista.length+lista2.length);
   System.arraycopy(lista2,0,lista,tam,lista2.length);
    }
    public void insertStart(Integer[]lista2){
   int tam = lista.length;
   int tam2 = lista2.length;
   lista2=Arrays.copyOf(lista2,lista.length+lista2.length);
   System.arraycopy(lista,0,lista2,tam2,lista.length);
   lista=lista2;
    }
    public int elemento(int pos){
        int num=0;
        if (pos >-1 && pos < lista.length){
            num = lista[pos];
        }
        return num;
    }
    public int  buscar(int num){
        int devolver=0;
        for (int i = 0; i <lista.length ; i++) {
         if (lista[i].equals(num)){
          return i;
         }
        }
        return devolver=-1;
    }

}
