public class Gato implements Comparable {
    String nombre;
    int edad;
    String raza;

    public Gato(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {

        try {
            return this.nombre.compareTo(((Gato) o).nombre);
        }catch (Exception e){
            System.out.println("No se puede comparar ese gato con otro objetos");
        }

        return 0;
    }
}
