public class Horquilla extends Suspencion{
    protected boolean tuboDireccion;
    protected int tamañoTuboDireccion;
    protected String TipoTuboDireccion;
    protected String eje;
    protected int tamañoEje;
    protected int ajusteRecorrido;
    protected double diametroTuboDireccionBajo;
    protected double diametroTuboDireccionArriba;
    public Horquilla (String marca, String bloqueo, String tipoSuspencion, int recorrido, int diametroBarra, int sag, String tieneTubo,String eje, int ajusteRecorrido, int tamañoTuboDireccion, double diametroTuboDireccionArriba, double diametroTuboDireccionBajo){
        super(marca, bloqueo, tipoSuspencion, recorrido, diametroBarra, sag);
        this.tuboDireccion = tubo(tieneTubo);
        this.eje = especificacionesEje(eje);
        this.ajusteRecorrido = ajusteRecorrido;
        this.tamañoTuboDireccion = tamañoTuboDireccion;
        this.diametroTuboDireccionBajo = diametroTuboDireccionBajo;
        this.diametroTuboDireccionArriba = diametroTuboDireccionArriba;
        TipoTuboDireccion();
    }
    
    protected void TipoTuboDireccion(){
        if(diametroTuboDireccionBajo == diametroTuboDireccionArriba){
            TipoTuboDireccion = "Recto";          
        }else{
            TipoTuboDireccion = "Conico";
        }
    }
    
    public String especificacionesEje(String eje){
        if(eje.toLowerCase().contains("eje pasante") || eje.toLowerCase().contains("boost")){
            tamañoEje = 110;
            return "boost";
        }
        tamañoEje = 100;
        return "QR";
    }
    
    private boolean tubo(String respuesta){
        if(respuesta.equalsIgnoreCase("si")){
            return true;
        }
        return false;
    }
}
