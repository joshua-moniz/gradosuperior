public class horaExacta extends hora{
    protected  int segundos;
    public horaExacta(int hora,int minuto,int segundos){
        super(hora,minuto);
        this.segundos=segundos;
    }
    public void setSegundos(int valor){
        if (valor >= 0 && valor <= 59){
            segundos=valor;
        }
    }
    @Override
    public void incr(){
        segundos++;
        if (segundos>59){
            segundos = 0;
            super.incr();
        }
    }
    @Override
    public String toString(){
        String resultado;
     resultado=super.toString();
     resultado += ":"+segundos;
     return resultado;
    }
    @Override
    public  boolean equals(Object compare){
        horaExacta nuevoReloj = (horaExacta) compare;
        boolean comparar;
        if (this.hora == nuevoReloj.hora && this.minuto ==nuevoReloj.minuto && this.segundos == nuevoReloj.segundos){
            comparar = true;
        }else {
            comparar = false;
        }
        return comparar;

    }
}
