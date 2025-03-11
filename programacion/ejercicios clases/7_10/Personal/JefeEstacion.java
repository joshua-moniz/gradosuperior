package Personal;

import java.time.LocalDateTime;

public class JefeEstacion extends Personal{
    String dni;
    LocalDateTime fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDateTime fechaNombramiento) {
        super(nombre);
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
    }
}
