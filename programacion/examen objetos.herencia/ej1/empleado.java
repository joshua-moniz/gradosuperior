public class empleado {
    String nombre;
    int edad;
    String fechaInc;
    String fechaFin;

    public empleado(String nombre, int edad, String fechaInc, String fechaFin) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaInc = fechaInc;
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Nombre" + nombre + "Edad" + edad + "FechaInc" + fechaInc + "FechaFin" + fechaFin;
    }

}
