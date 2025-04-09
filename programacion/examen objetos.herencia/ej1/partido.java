public class partido {
    String fechaPartido;
    equipo local;
    equipo visitante;
    int resultadoEq1;
    int resultadoEq2;

    public partido(String fechaPartido, equipo local, equipo visitante, int resultadoEq1, int resultadoEq2) {
        this.fechaPartido = fechaPartido;
        this.local = local;
        this.visitante = visitante;
        this.resultadoEq1 = resultadoEq1;
        this.resultadoEq2 = resultadoEq2;
    }

    public  String ganador() {
        if (resultadoEq1 > resultadoEq2) {
            return "Ganador local";
        }
        if (resultadoEq1 < resultadoEq2) {
            return "Ganador visitante";
        }
        return "empate";
    }

    @Override
    public String toString() {
        return "partido{" +
                "resultadoEq1=" + resultadoEq1 +
                ", resultadoEq2=" + resultadoEq2 +
                '}';
    }
}
