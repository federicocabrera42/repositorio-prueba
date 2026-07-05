public class SistemaRodamientoDelantero extends SistemaRodamiento{
    protected Macero macero;
    protected boolean maceroDisco;
    public SistemaRodamientoDelantero(String liquidoTubeless){
        super(liquidoTubeless);
        this.maceroDisco = false;
    }
    
    protected String compatibleMD(){
        if(disco.getTipoAcople().equalsIgnoreCase(macero.tipoFreno)){
            maceroDisco = true;
            return "es compatible con el disco";
        }else{
            return "no es compatible";
        }
    }
    
    public void rueda(){
        if(compatibleMD() == compatibleLA()){
            aprovado = true;
        }
    }
    
    protected String ruedo(){
        if(aprovado){
            return "todo es compatible disfruta de estos aros maravillosos";
        }
        return " algunas cosas no son compatibles revisalo";
    }
    
    public String componentes(){
        return "Tiene un macero:" + macero.marca + ", un disco:" + disco.marca +", un aro:" + aro.marca + ", unas llantas:" + llanta.marca + " y" + ruedo();
    }    
}
