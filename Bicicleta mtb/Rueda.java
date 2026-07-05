public class Rueda{
    protected String marca;
    protected String material;
    protected String tipoInflado;
    protected int tamañoLlanta;
    protected int anchoExterior;
    protected boolean tubeLess;
    public Rueda(String marca, String material, String tipoInflado, int tamañoLlanta, int anchoExterior, String tubeless){
        this.marca = marca;
        this.material = material;
        this.tipoInflado = tipoInflado;
        this.tamañoLlanta = tamañoLlanta;
        this.anchoExterior = anchoExterior;
        this.tubeLess = tube(tubeless);
    }
    
    private boolean tube(String tubeless){
        if(tubeless.equalsIgnoreCase("si")){
            return true;
        }
        return false;
    }   
}
