public class CalculadoraCientifica {
    public double calcular(String operacio, double a, double b) {
        if (operacio.equals("sumar")) {
            return a + b;
        } else if (operacio.equals("restar")) {
            return a - b;
        } else if (operacio.equals("multiplicar")) {
            return a * b;
        } else if (operacio.equals("dividir")) {
            if (b == 0) {
                System.out.println("Error: no es pot dividir per zero");
                return 0;
            }
            return a / b;
        } else if (operacio.equals("potencia")) {
            return Math.pow(a, b);
        } else if (operacio.equals("arrel")) {
            return Math.sqrt(a);
        } else if (operacio.equals("logaritme")) {
            return Math.log(a);
        } else if (operacio.equals("sin")) {
            return Math.sin(a);
        } else if (operacio.equals("cos")) {
            return Math.cos(a);
        } else if (operacio.equals("tan")) {
            return Math.tan(a);
        } else {
            System.out.println("Operació desconeguda");
            return 0;
        }
    }

    public void mostrarResultat(String operacio, double a, double b) {
        double resultat = calcular(operacio, a, b);
        System.out.println("Resultat de " + operacio + ": " + resultat);
    }



     public  static  int sumar(int a , int b){
        return a+b;
     }
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        calc.mostrarResultat("sumar", 5, 3);
        calc.mostrarResultat("dividir", 10, 0);
        calc.mostrarResultat("arrel", 16, 0);
        calc.mostrarResultat("logaritme", 2.71828, 0);
        calc.mostrarResultat("tan", Math.PI / 4, 0);
    }
}