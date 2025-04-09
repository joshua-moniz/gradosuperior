public class socio implements  Comparable{
    int id;
    String nombre;

    public socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

   /* @Override
    public int compareTo(Object o) {
        int res=0;
      socio socio= (socio) o;
      if (id < socio.id){
          res=id- socio.id;
      } else if (id>socio.id) {
          res=id - socio.id;
      } else if (id==socio.id) {
          res=0;
      }
      return res;
    }
    */



     @Override
    public int compareTo(Object o) {
        socio socio= (socio) o;
        return nombre.compareTo(((socio)o).nombre);
    }

    @Override
    public String toString() {
        return "id " + id + " nombre " + nombre + "|| " ;
    }
}
