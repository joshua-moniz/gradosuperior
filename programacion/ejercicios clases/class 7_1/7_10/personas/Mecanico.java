package personas;

public class Mecanico {
    enum Especialidad{frenos,hidraulica,electricidad,motor}
    String nombre;
    String telefono;
    Especialidad especialidad;

    public Mecanico(String nombre, String telefono ,String especialidad){
        this.nombre=nombre;
        this.telefono=telefono;
        this.especialidad=Especialidad.valueOf(especialidad);
    }
}
