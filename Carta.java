public class Carta
{
    
    //Atributo que guarda el valor de la carta.
    private int valor;
    //Atributo que guarda el palo de la carta.
    private String palo;
    
    /**
     * Constructor de la clase carta.
     */
    public Carta(int valor, String palo){
       this.valor = valor;
       this.palo = palo;
    }
    
    /**
     * Metodo para devolver el nombre completo de la carta.
     */
    public String getNombre(){
        String cartaCompleta;
        
        if (valor == 1){
            cartaCompleta = "As de" + palo;
        }
        else if (valor == 11){
            cartaCompleta = "J de" + palo;
        }
        else if (valor == 12){
            cartaCompleta = "Q de" + palo;
        }
        else if (valor == 13){
            cartaCompleta = "K de" + palo;
        }
        else{
            cartaCompleta = valor + "de" + palo;
        }
        
        return cartaCompleta;
    }
    
    /**
     * Metodo para devolver unicamente el valor (de 1 a 13) de las cartas.
     */
    public int getValor(){
        return valor;
    }
    
    /**
     * Metodo para devolver unicamente el palo de la carta
     */
    public String getPalo(){
        return palo;
    }
}
