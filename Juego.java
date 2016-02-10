import java.util.ArrayList;
import java.util.Collections;
/**
 * Juego(numeroJugadores): constructor que crea un objeto juego, el cual crea el numero de jugadores indicados y crea el mazo. Si el número de jugadores no es válido se crea un juego con 4 jugadores por defecto.
 * repartir(): método que reparte todas las cartas a los jugadores en la forma habitual en que se hace en un juego de cartas, es decir, barajando el mazo y entregando alternativamente cartas a los jugadores tomando siempre la primera carta del mazo. 
 * Al finalizar el reparto todos los jugadores deben tener el mismo número de cartas, por lo que es posible, dependiendo del número de estos, que queden cartas en el mazo.
 * mostrarCartasJugadores(): método que muestra por pantalla el id de cada jugador junto a la cartas que tiene en la mano.
 */
public class Juego
{ 
    private ArrayList <Jugador> participantes;
    private int numeroJugadores;
    private Mazo mazo;
    /**
     * Constructor for objects of class Juego
     * Si el numero de jugadores escrito no es valido ( 2-8 jugadores) 
     * El juego se iniciara por defecto con 4 jugadores
     */
    public Juego(int numeroJugadores)
    {
        participantes = new ArrayList <Jugador>();
        mazo = new Mazo();
        int players = 1;
        if (numeroJugadores > 2 && numeroJugadores < 8)
        {
            System.out.println("El numero de jugadores en esta partida sera de " + numeroJugadores);
            while (players <= numeroJugadores){
                this.numeroJugadores = numeroJugadores;
                participantes.add(new Jugador(players));
                players = players + 1;
            }
        }
        else 
        {
            System.out.println("El numero de jugadores no es valido. El juego se iniciara con 4 jugadores por defecto");
            while (players <= 4)
            {
                this.numeroJugadores = 4;
                participantes.add(new Jugador(players));
                players = players + 1;
            }
        }
    }
    
    /**
     * Metodo para repartir todas las cartas posibles a cada jugador despues de haber barajado el mazo
     */
    public void repartirCartas()
    {
        mazo.barajar();
        int cartasMazo = mazo.quedan();
        while(cartasMazo > numeroJugadores)
        {
            for (Jugador jugador : participantes)
            {
                jugador.recibirCarta(mazo.tomarPrimera());
            }
            cartasMazo = mazo.quedan();
        }
        
    }
    
    /**
     * Muestra por pantalla una lista con los jugadores y las cartas que tiene cada uno en la mano
     */
    public void mostrarCartas()
    {
        for(Jugador jugador : participantes)
        {
            System.out.println( "El jugador es " + jugador.getId() + " y tiene en mano " + jugador.cartasQueTieneEnLaMano());
        }
    }
    
}
