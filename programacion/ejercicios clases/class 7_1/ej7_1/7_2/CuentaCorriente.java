public class CuentaCorriente {
    String dni;
    String NombreTitular;
    double saldo;

    public CuentaCorriente() {

    }

    public CuentaCorriente(String dni, String nombreTitular) {
        this.dni = dni;
        this.NombreTitular = nombreTitular;
        saldo = 0;
    }

    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorriente(String dni , String nombreTitular, double saldo){
        this.dni = dni;
        this.NombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public String mostrarInformacion(){
     return "Nombre " + NombreTitular + "\nDNI " + dni + "\nSaldo " + saldo;
    }
    boolean regreso(double cantidad ){
     boolean actividad = true;
     if ( saldo > cantidad){
         saldo-=cantidad;
     } else if (saldo<cantidad) {
         System.out.println("Poco dinero pobre");
         actividad= false;
     }
     return actividad;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void ingresarDinero(double cantidad){
     saldo+=cantidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return NombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        NombreTitular = nombreTitular;
    }

}

