public class entrenador extends  empleado{
    public entrenador(String nombre, int edad, String fechaInc, String fechaFin) {
        super(nombre, edad, fechaInc, fechaFin);
    }

    public String planificarEntrenamiento(){
        return "El entrenador esta preparando el entrenamiento";
    }
}
