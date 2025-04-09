public class piramide extends  poliedro{
    double longitudlado;
    double altura;

    public piramide(double longitudlado , double altura) {
        this.longitudlado = longitudlado;
        this.altura=altura;
    }

    @Override
    protected double calcularArea() {
        double  area;
        return area=((longitudlado*Math.sqrt(Math.pow(longitudlado,2)*Math.pow(longitudlado/2,2)) )/2);
    }

    @Override
    protected double calcularVolumen() {
        double volumen;
        return volumen=longitudlado*longitudlado*altura/2;
    }
}
