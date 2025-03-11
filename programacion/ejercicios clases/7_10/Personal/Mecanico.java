package Personal;

public class Mecanico extends Personal{
    String telefono;
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        super(nombre);
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
}
