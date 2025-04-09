public  abstract class poliedro {
    double volumen;
    double area;

    protected abstract double calcularArea();
    protected abstract double calcularVolumen();

    public double getVolumen() {
        return volumen;
    }

    public double getArea() {
        return area;
    }
}
