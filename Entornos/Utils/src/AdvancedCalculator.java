public class AdvancedCalculator {

    public static double potencia(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double arrelQuadrada(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("No es pot calcular l'arrel d'un número negatiu.");
        }
        return Math.sqrt(valor);
    }

    public static int modul(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero.");
        }
        return a % b;
    }
}