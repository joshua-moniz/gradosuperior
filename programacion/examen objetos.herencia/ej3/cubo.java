public class cubo extends  poliedro {
    double longitudlado;

    public cubo(double longitudlado) {
        this.longitudlado = longitudlado;
    }

    @Override
    protected double calcularArea() {
        double area;
        return area =longitudlado * longitudlado*6;
    }

    @Override
    protected double calcularVolumen() {
        double volumen;
        return volumen =longitudlado*longitudlado*longitudlado;
    }
}
