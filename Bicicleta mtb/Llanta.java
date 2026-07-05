public class Llanta extends Rueda{
    protected int anchoLlanta;
    protected String estilo;
    public Llanta(String marca, String material, String tipoInflado, int tamañoLlanta, int anchoExterior, String tubeless, int anchoLlanta, String estilo){
        super(marca,material,tipoInflado,tamañoLlanta,anchoExterior, tubeless);
        this.anchoLlanta = anchoLlanta;
        this.estilo = estilo;
    }
    
}
