public class Caliper extends SistemaFrenado{
    private int pistones;
    public Caliper(String marca, String aceite, int pistones){
        super(marca, aceite);
        this.pistones = pistones;
    }
          
    public String Especificaciones(){
        return "Marca:" + getMarca() + ", tipo de aceite que usa:" + getAceite() +", tiene " + pistones +" pistones de frenado"; 
    }
}
