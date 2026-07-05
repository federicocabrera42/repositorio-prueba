public class MtbEnduro{
    protected Cuadro cuadro;
    protected SistemaRodamientoTracero sistemaTracero;
    protected Asiento asiento;
    protected SistemaDelantero delantero;
    protected SistemaTrasmicion trasmicion;
    protected AmortiguadorTrasero amortiguador;
    protected EjePedalier eje;
        
    protected String compatibleAroTracero(){
        String mensaje = "No compatible";
        if(sistemaTracero.getTamañoAros() == cuadro.tamañoAros){
            mensaje = "Compatible";
        }
        return mensaje;
    }
    
    protected String compatibleSusTracera(){
        String mensaje = "No compatible";
        if(amortiguador.recorrido == cuadro.recorridoTracero){
            mensaje = "Compatible";
        }
        return mensaje;
    }
    
    protected String compatibleEjePedalier(){
        String mensaje = "No compatible";
        if(eje.diametroEje == cuadro.tamañoEje){
            mensaje = "Compatible";
        }
        return mensaje;
    }
    
    protected String compatibleDiametroSillin(){
        String mensaje = "No compatible";
        if(asiento.diametro == cuadro.diametroTuboSillin){
            mensaje = "Compatible";
        }
        return mensaje;
    }
    
    protected String compatibleDirecion(){
        String mensaje = "No compatible";
        if(delantero.getDireccion().equalsIgnoreCase(cuadro.TipoTuboDireccion) ){
            mensaje = "Compatible";
        }
        return mensaje;
    }
}