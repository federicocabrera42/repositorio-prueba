public class SistemaRodamientoTracero extends SistemaRodamiento{
    protected Piñon piñon;
    protected MaceroTracero macero;
    protected boolean maceroDiscoPiñon;
    public SistemaRodamientoTracero(String liquidoTubeless){
        super(liquidoTubeless);
        this.maceroDiscoPiñon = false;
    }
    
    protected String compatibleMDP(){
        if(disco.getTipoAcople().equalsIgnoreCase(macero.tipoFreno)){
            if(piñon.tipoAnclaje.equalsIgnoreCase(macero.acoplePiñon)){
                maceroDiscoPiñon = true;
                return "todo es compatible con el disco y el piñon ";
            }
            return "es compatible con el disco, pero no con el piñon. Cambia el piñon";
        }else if(piñon.tipoAnclaje.equalsIgnoreCase(macero.acoplePiñon)){
            return "es compatible con el piñon, pero no con el disco. Cambia de disco";
        }else{
            return "no es compatible";
        }
    }
    
    protected int getTamañoAros(){
        return aro.getTamañoAros();
    }
    
    public void rueda(){
        if(compatibleMDP() == compatibleLA()){
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
