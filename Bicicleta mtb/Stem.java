public class Stem{
    protected double diametroTuboDireccion;
    protected double diametroManillar;
    protected double medidaTuboManillar;
    protected String material;
    public Stem(double diametroTuboDireccion, double diametroManillar, double medidaTuboManillar, String material){
        this.diametroTuboDireccion = diametroTuboDireccion;
        this.diametroManillar = diametroManillar;
        this.medidaTuboManillar = medidaTuboManillar;
        this.material = material;
    }
    
    protected String tamaño(){
        String mensaje = "es largo";
        if(medidaTuboManillar < 5){
            mensaje = "es corto";
        }
        return mensaje;
    }
    
    public String estado(){
        return "el material es:" + material + " y el tamaño es:" + tamaño();
    }
}