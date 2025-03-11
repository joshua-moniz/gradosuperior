public class hora {
    int hora;
    int minuto;
    int segundo;

    public hora() {

    }

    public hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public String formato24h(int hora , int minuto ,int segundo){
if (hora <=24 && minuto <60 && segundo <60){
    return hora + ":" + minuto + ":" + segundo;
}else {
    return "No se puede";
}
    }
    public  String formato12h(int hora , int minuto , int segundo){
        if (hora >12 && hora <=24 && minuto <60 && segundo <60){
            hora = hora -12;
            return hora + ":" + minuto + ":" + segundo;
        }else {
            return "La hora esta mal";
        }
    }
}
