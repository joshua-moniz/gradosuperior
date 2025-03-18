public class hora {
    int hora;
    int minuto;
    public hora (int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
    }
    public void incr(){
        minuto++;
        if (minuto >59){
            minuto =0;
            hora++;
        }if (hora >23){
            hora =0;
        }
    }
    public boolean setMinutos(int valor){
        boolean devolver =true;
        if (valor>=0 && valor <=59){
            minuto = valor;
        }else {
            devolver=false;
        }
        return devolver;
    }
    public boolean setHoras(int valor){
        boolean devolver =true;
        if (valor>=0 && valor <=23){
            hora = valor;
        }else {
            devolver=false;
        }
        return devolver;
    }
    @Override
public String toString(){
String resultado;
resultado= hora +":"+minuto;
return resultado;
}
}
