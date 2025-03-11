public class fracciones {
    double numerador;
    double denominador;

    public fracciones() {

    }

    public fracciones(double numerador, double denomindaor) {
        this.numerador = numerador;
        this.denominador = denomindaor;
    }

    public String suma(fracciones frac,fracciones frac2) {
        double demo;
        double num;
        if (frac.denominador != frac2.denominador){
            demo = frac.denominador * frac2.denominador;
            num = (frac.numerador* frac2.denominador)+(frac2.numerador * frac.denominador);
            return num + "/" + demo;

        }else {
            demo = frac.denominador;
            num = frac.numerador + frac2.numerador;
            return num + "/" + demo;
        }
    }
    public String resta(fracciones frac,fracciones frac2) {
        double demo;
        double num;
        if (frac.denominador != frac2.denominador){
            demo = frac.denominador * frac2.denominador;
            num = (frac.numerador* frac2.denominador)-(frac2.numerador* frac.denominador);
            return num + "/" + demo;

        }else {
            demo = frac.denominador;
            num = frac.numerador - frac2.numerador;
            return num + "/" + demo;
        }
    }
    public String multi(fracciones frac,fracciones frac2) {
        double demo = frac.numerador * frac2.numerador;
        double num = frac.denominador * frac2.denominador;
        return num + "/" + demo;
    }
    public String dividr(fracciones frac,fracciones frac2) {
        double demo = frac.denominador * frac2.numerador;
        double num = frac.numerador * frac2.denominador;
        return num + "/" + demo;
    }
    public  String mostrar(fracciones frac, fracciones frac2){
        double num = frac.numerador;
        double num2 = frac2.numerador;
        double deno = frac.denominador;
        double deno2 = frac2.denominador;
        return num + "/" + deno + "\n" + num2 + "/" + deno2;
    }

}
