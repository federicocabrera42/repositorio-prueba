public class AmortiguadorTrasero extends Suspencion{
    protected boolean camaraNegativa;
    protected String tipoAnclaje;
    public AmortiguadorTrasero(String marca, String bloqueo, String tipoSuspencion, int recorrido, int diametroBarra, int sag, String camaraNegativa, String tipoAnclaje){
        super(marca, bloqueo, tipoSuspencion, recorrido, diametroBarra, sag);
        this.camaraNegativa = camara(camaraNegativa);
        this.tipoAnclaje = tipoAnclaje;
    }
    
    protected boolean camara(String camNega){
        if(camNega.equalsIgnoreCase("si")){
            return true;
        }
        return false;
    }
}
