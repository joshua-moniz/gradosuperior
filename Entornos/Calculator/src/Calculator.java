public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No es pot dividir per zero.");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public QuadraticEquationResult quadraticEquation(double a, double b, double c) {

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double positiveValue = (-b + Math.sqrt(discriminant)) / (2 * a);
            double negativeValue = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new QuadraticEquationResult(positiveValue, negativeValue);
        } else if (discriminant == 0) {
            double arrel = -b / (2 * a);
            return new QuadraticEquationResult(null, arrel);
        } else {
            return null;
        }
    }
}
