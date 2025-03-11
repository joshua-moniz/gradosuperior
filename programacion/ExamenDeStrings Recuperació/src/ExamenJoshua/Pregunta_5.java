package ExamenJoshua;

import java.util.Arrays;
import java.util.Scanner;

public class Pregunta_5 {
    public static String buscar (String [] agenda , String nombre){
        String buscar ="";
        String palabra ="";
        int posicion = 0;
        for (int i = 0; i <agenda.length ; i++) { //busco en el array si aparece el nombre introducido
            if (agenda[i].contains(nombre)){
                posicion=i; // si en la posicion i aparece el nombre , guardo la posicion
                buscar=agenda[posicion]; //igualo l variable string con la posicion encontrada

            }
        }
        for (int i = 0; i < buscar.length(); i++) { //entro en otro bucle para copiar cada caracter de ese string en uno nuevo
            if (buscar.charAt(i)!= ':'){
                palabra+=buscar.charAt(i); //Si la posicion no es iugal a : copio ese caracter dentro de un nuevo string
            }else palabra=""; // en el momento que encuentra : reinicio el string porque sabemos que el telefono esta al final, con esto copiamos primero el apellido(se borra despues) , despues el nombre(que tambien se borra) y por ultimo el telefono que este no se borrara
        }
        return palabra;
    }
    public static String [] añadir (String [] contactos , String nuevo){
        contactos= Arrays.copyOf(contactos,contactos.length+1); //Agrando el array un puesto mas
        contactos[contactos.length-1]= nuevo; //La ultima posicion sera igual al String introducido
        return contactos;
    }
    public static String [] ordenar (String[] agenda){
        String nombre ="";
        String nombreImp="";
        String apellido="";
        String numero="";
        Arrays.sort(agenda);
        for (int i = 0; i < agenda.length; i++) {  //creo un bucle para cada posicion del array a si se imprimira cada contacto
            nombre = agenda[i];
            int pos = nombre.indexOf(":"); // busco donde se encuentra el :
            apellido=nombre.substring(0,pos); //copio lo que este entre el principio y el : en un string apellidos porque sabemos que lo primero que introducimos es el apellido
            int  pos2= nombre.indexOf(":",pos+1); //con este index busco la siguiete posicion del :
            nombreImp=nombre.substring(pos+1,pos2); //aqui copio el nombre en una variable
            numero=nombre.substring(pos2+1, nombre.length()); //lo mismo pero con el numero
            System.out.println("Nombre: "+ nombreImp + " Apellido: "+ apellido + " Numero: "+ numero); //imprimimos cada cosa en su orden
        }

        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String [] contactos = {};

        int respuesta =0;
        System.out.println("Elige que queires hacer ");
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Añadir contacto || 2.Buscar numero || 3.Mostrar contactos || 4.Salir ");
            respuesta = sc.nextInt();
            switch (respuesta) {
                case 1 -> {
                    System.out.println("Apellido:Nombre:Telefono");
                    String nuevo = sc.next();
                    contactos = añadir(contactos, nuevo);
                    System.out.println(Arrays.toString(contactos));
                }
                case 2 -> {
                    System.out.println("A quien queires buscar");
                    String nombre = sc.next();
                    System.out.println(buscar(contactos, nombre));

                }
                case 3 ->{
                    ordenar(contactos);
                }
                case 4 -> {
                    seguir=false;
                }
            }
        }
    }
}