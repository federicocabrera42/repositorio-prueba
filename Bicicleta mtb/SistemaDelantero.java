public class SistemaDelantero{
    protected Horquilla horquilla;
    protected Stem stem;
    protected Manillar manillar;
    protected SistemaRodamientoDelantero aro;
    protected Shifter shifter;
    protected Maneta frenoDelanero;
    protected Maneta frenoTracero;
    protected Puños puño;
    
    protected String getDireccion(){
        return horquilla.TipoTuboDireccion;
    }
    protected String compatibleStemHorquilla(){
        String mensaje = "no es compatible";
        if(stem.diametroTuboDireccion == horquilla.diametroTuboDireccionArriba){
            mensaje = "si es compatible";
        }
        return mensaje;
    }
    
    protected String compatibleStemManillar(){
        String mensaje = "no es compatible";
        if(stem.diametroManillar == manillar.diametro){
            mensaje = "si es compatible";
        }
        return mensaje;
    }
    
    protected String manillarLleno(){
        int medida = (int)manillar.tamaño - 45 - (2 * puño.tamaño);
        if(medida > 230){
            return "buen espacio del manillar " + medida + " mm en uso";
        } 
        return "no hay espacio en el manillar, corregir " + medida;
    }
    
    public String estado(){
        return "El espacio en el manillar es " + manillarLleno() +", con el stem con el manillar que " + compatibleStemManillar() +" y la horquilla y el stem que" + compatibleStemHorquilla();
    }
}