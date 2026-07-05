public class Shifter extends SistemaControl{
    private int liveracion;
    private int bajar;
    private String anclaje;
    public Shifter(String marca, String modelo, int velocidades){
        super(marca, modelo,velocidades);
        this.liveracion = liveracion;
        this.bajar = bajar;
        this.anclaje = anclaje;
    }
    
    public String Especificaciones(){
        return "Marca:" + marca + ", Del modelo:" + modelo +", velocidades: " + velocidades +", con un una liveracion (para bajar de cajas):" + liveracion + " de dos vias, para bajar de caja tiene:" + bajar + "en una accion y el anchaje es  " + anclaje;
    }
}
