public class Asiento{
    protected String tipoAnclaje;
    protected double diametro;
    public Asiento(String tipoAnclaje, double diametro){
        this.tipoAnclaje = tipoAnclaje;
        this.diametro = diametro;
    }
    
    public String estado(){
        return "El sillin es comodo";
    }
}