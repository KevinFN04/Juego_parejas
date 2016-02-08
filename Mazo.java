import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Mazo
{
    //Atributo que guarda las cartas del mazo.
    private ArrayList<Carta> cartas;
   
    /**
     * Construcor de la clase Mazo (Se crean en el las 52 cartas).
     */
    public Mazo(){
       cartas = new ArrayList<>(Arrays.asList( new Carta(1, "Diamantes"), new Carta(1, "Picas"), new Carta(1, "Trebol"), new Carta(1, "Corazones"),
                                               new Carta(2, "Diamantes"), new Carta(2, "Picas"), new Carta(2, "Trebol"), new Carta(2, "Corazones"), 
                                               new Carta(3, "Diamantes"), new Carta(3, "Picas"), new Carta(3, "Trebol"), new Carta(3, "Corazones"), 
                                               new Carta(4, "Diamantes"), new Carta(4, "Picas"), new Carta(4, "Trebol"), new Carta(4, "Corazones"), 
                                               new Carta(5, "Diamantes"), new Carta(5, "Picas"), new Carta(5, "Trebol"), new Carta(5, "Corazones"), 
                                               new Carta(6, "Diamantes"), new Carta(6, "Picas"), new Carta(6, "Trebol"), new Carta(6, "Corazones"), 
                                               new Carta(7, "Diamantes"), new Carta(7, "Picas"), new Carta(7, "Trebol"), new Carta(7, "Corazones"), 
                                               new Carta(8, "Diamantes"), new Carta(8, "Picas"), new Carta(8, "Trebol"), new Carta(8, "Corazones"), 
                                               new Carta(9, "Diamantes"), new Carta(9, "Picas"), new Carta(9, "Trebol"), new Carta(9, "Corazones"), 
                                               new Carta(10, "Diamantes"), new Carta(10, "Picas"), new Carta(10, "Trebol"), new Carta(10, "Corazones"), 
                                               new Carta(11, "Diamantes"), new Carta(11, "Picas"), new Carta(11, "Trebol"), new Carta(11, "Corazones"), 
                                               new Carta(12, "Diamantes"), new Carta(12, "Picas"), new Carta(12, "Trebol"), new Carta(12, "Corazones"), 
                                               new Carta(13, "Diamantes"), new Carta(13, "Picas"), new Carta(13, "Trebol"), new Carta(13, "Corazones")));
    }
    
    /**
     * Metodo para barajar las cartas del mazo.
     */
    public void barajar(){
       Collections.shuffle(cartas);
    }
    
    /**
     * Metodo para coger la primera carta del mazo y eliminarla de el.
     */
    public Carta tomarPrimera(){
        Carta primeraCarta = cartas.get(0);
        cartas.remove(0);
        return primeraCarta;
    }
    
    /**
     * Metodo para devolver las cartas que aun quedan en el mazo.
     */
    public int quedan(){
        int cartasEnMazo = cartas.size();
        return cartasEnMazo;
    }
}
