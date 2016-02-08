import java.util.ArrayList;
/**
 * Creado por Ignacio De La VIuda
 * JUGADOR
 * Jugador(id): este constructor crea un objeto jugador que no tiene cartas en su poder 
 * con el identificador indicado como parámetro.
 * getId(): devuelve el identificador del jugador.
 * recibirCarta(unaCarta): agrega la carta unaCarta a las que posee el jugador.
 * cartasQueTieneEnLaMano(): devuelve una colección de cadenas con los nombres de las cartas.
 */
public class Jugador
{
    private ArrayList <String> cartasEnLaMano;
    private int id;
    
    /**
     * Constructor para la clase Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartasEnLaMano = new ArrayList <String>();
    }

    /**
     * Metodo que devuelve el id del jugador
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Metodo que agrega una carta a todas las que ya tiene el jugador
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartasEnLaMano.add(unaCarta.getNombre());
    }
    
    /**
     * Metodo que devuelve un ArrayList con todas las cartas que el jugador tiene en la mano
     */
    public ArrayList <String> cartasQueTieneEnLaMano()
    {
        return cartasEnLaMano;
    }
}
