public class Maneta extends SistemaFrenado{
    private int longitud;
    private String ajuste;
    private String tipoTecnologia;
    private String integracion;
    public Maneta(String marca, String aceite, int longitud, String ajuste, String tipoTecnologia, String integracion){
        super(marca, aceite);
        this.longitud = longitud;
        this.ajuste = ajuste;
        this.tipoTecnologia = tipoTecnologia;
        this.integracion = integracion;
    }
    
    public boolean integrado(){
        if(integracion.equalsIgnoreCase("no") || integracion.equalsIgnoreCase("rapida")){
            return true;
        }else{
            return false;
        }   
    }
    
    public String Especificaciones(){
        return "Marca:" + getMarca() + ", tipo de aceite que usa:" + getAceite() +", longitud: " + longitud +", ajuste:" + ajuste +", tiene la tecnologia de:" + tipoTecnologia + " y su integracion es"+ integracion ; 
    }
}
