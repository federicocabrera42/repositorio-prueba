public class Manillar{
    protected double tamaño;
    protected double diametro;
    protected String material;
    public Manillar(double tamaño, double diametro, String material){
        this.tamaño = tamaño;
        this.diametro = diametro;
        this.material = material;
    }
    
    public String estado(){
        return "El manillar tiene un tamaño: " + tamaño + ", con un diametro: " + diametro;
    }
}