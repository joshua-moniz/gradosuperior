public class mainprueba {
    public static void main(String[] args) {
        entrenador entrenadogijon = new entrenador("andres", 19, "10/02/2005", "10/02/2017");
        entrenador entrenadoalbacete = new entrenador("gines", 19, "10/02/2005", "10/02/2017");
        entrenador entrenadormadrid = new entrenador("morad", 19, "10/02/2005", "10/02/2017");

        jugador jugadorgijon1 = new jugador("mikel",20,"10/04/2332","10/05/2304", 13,posicion.Delantero,0,2);
        jugador jugadorgijon2 = new jugador("miguel",20,"10/04/2332","10/05/2304", 13,posicion.Delantero,0,2);
        jugador jugadorgijon3 = new jugador("marcos",20,"10/04/2332","10/05/2304", 13,posicion.Delantero,0,2);
        jugador jugadorgijon4 = new jugador("morad2",20,"10/04/2332","10/05/2304", 13,posicion.Delantero,0,2);
        jugador jugadorgijon5 = new jugador("marc",20,"10/04/2332","10/05/2304", 13,posicion.Delantero,0,2);
    jugador [] jugadoresGijon={jugadorgijon1,jugadorgijon2,jugadorgijon3,jugadorgijon4,jugadorgijon5};
    equipo gijon  = new equipo("gijon",entrenadogijon,20,jugadoresGijon);
    equipo albacete = new equipo("albacete",entrenadoalbacete,10,jugadoresGijon);
    equipo madrid = new equipo("madrid",entrenadormadrid,2,jugadoresGijon);
    partido partidos = new partido("10/04/2042",gijon,albacete,4,2);
    partido partidos2 = new partido("10/04/2042",albacete,madrid,2,2);
    partido partidos3 = new partido("10/04/2042",gijon,madrid,1,0);

    equipo[] clasificaion ={gijon,madrid,albacete};

    liga liga = new liga("10/03/2005","10/06/2005",clasificaion);

    liga.mostrarClasificacion();
    }

}

