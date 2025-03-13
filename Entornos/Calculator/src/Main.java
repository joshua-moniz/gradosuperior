public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 4;

        System.out.println("Los números escogidos son: " + number1 + " y " + number2);

        Calculator calculator = new Calculator();

        System.out.println("La suma de los números es: " + calculator.add(number1, number2));
        System.out.println("La resta de los números es: " + calculator.substract(number1, number2));
        System.out.println("La división de los números es: " + calculator.divide(number1, number2));
        System.out.println("La multiplicación de los números es: " + calculator.multiply(number1, number2));

        System.out.println("La ecuación de segundo grado que se calculará tendrá los valores de a=1, b=-5 y c=6");
        QuadraticEquationResult equationResult = calculator.quadraticEquation(1, -5, 6);
        System.out.println("La ecuación de segundo grado tiene el valor de: x1 = " + equationResult.getPositiveValue() + ", x2 = " + equationResult.getNegativeValue());
    }
}