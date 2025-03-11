public class claseLibros {
int isbn;
String titulo;
String autor;
double precio;
public claseLibros(){

}
public claseLibros(int isbn, String titulo , String autor){
    this.isbn=isbn;
    this.autor=autor;
    this.titulo=titulo;
}
public claseLibros(String titulo, String autor, int isbn, double precio){
    this.titulo=titulo;
    this.autor=autor;
    this.isbn=isbn;
    this.precio=precio;
}
public void cambiarPrecio(double cantidad){
    precio = cantidad;
}
public String obtenerPrecio(String nombre){
    return titulo + " Precio " + precio;
}
public String informacion (String nombre){
    return "Titulo " + titulo + "\n" + "Autor " + autor + "\n" + "ISBN " + isbn + "\n" + "Precio " + precio;
}

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
