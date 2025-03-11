public class vehichulo {
    String matricula;
    double precio;
    String marca;
    String modelo;

    public vehichulo() {
    }

    public vehichulo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public vehichulo(String matricula, String marca, String modelo, double precio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void cambiarprecio(double cantidad){
        precio =cantidad;
    }
    public String mostarPrecio(){
        return ""+precio;
    }
    public String mostarInformacion(){
        return "Matricula " + matricula + "\n" + "Marca : " + marca + "\n" + "Modelo : " + modelo +"\n"+ "Precio : " + precio;
    }
}
