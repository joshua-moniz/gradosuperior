public class socioA implements Comparable {
    int id;
    String nombre;

    @Override
    public int compareTo(Object o) {
        socio socio= (socio) o;
        return ((socio)o).nombre.compareTo(nombre);
    }



}
