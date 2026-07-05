public class Aro extends Rueda{
    protected int agujeros;
    protected int anchoInterior;
    public Aro(String marca, String material, String tipoInflado, int tamañoLlanta, int anchoExterior, int agujeros, int anchoInterior, String tubeless){
        super(marca,material,tipoInflado,tamañoLlanta,anchoExterior,tubeless);
        this.agujeros = agujeros;
        this.anchoInterior = anchoInterior;    
    }
    
    protected int getTamañoAros(){
        return tamañoLlanta;
    }
    
    
}
