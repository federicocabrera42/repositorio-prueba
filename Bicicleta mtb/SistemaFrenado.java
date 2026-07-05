public class SistemaFrenado{
    private String marca;
    private String aceite;
    public SistemaFrenado(String marca, String aceite){
        this.marca = marca;
        this.aceite = aceite;
    }
    
    protected String getMarca(){
        return marca;
    }
    
    protected String getAceite(){
        return aceite;
    }
    
    public String freno(PastillasFreno pastilla){
        pastilla.usos();
        return "esta frenando la mtb accionando las pastillas con el disco";
    }
        
    public String componente(Caliper caliper,Maneta maneta,PastillasFreno pastillas){
        return "En el caliper tenemos :" + caliper.Especificaciones()+" con las pastillas de :" + pastillas.Especificaciones() + ". En la maneta tenemos:" + maneta.Especificaciones(); 
    }
}
