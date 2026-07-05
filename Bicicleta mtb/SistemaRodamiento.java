public class SistemaRodamiento{
    protected Llanta llanta;
    protected Aro aro;
    protected Disco disco;
    protected boolean aprovado;
    protected boolean aros;
    protected boolean liquidoTubeless;
    public SistemaRodamiento(String liquidoTubeless){
        this.liquidoTubeless = liquido(liquidoTubeless);
        this.aros = false;
    }
    
    protected boolean liquido(String liquidoTubeless){
        if(liquidoTubeless.equalsIgnoreCase("si")){
            return true;
        }
        return false;
    }
    
    protected int getTamañoAros(){
        return aro.getTamañoAros();
    }
    
    protected String compatibleLA(){
        if(aro.tamañoLlanta == llanta.tamañoLlanta){
            aros = true;
            return "es compatible";
        }
        return "no es compatibe";
    }
}
