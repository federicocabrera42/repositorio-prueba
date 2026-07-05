public class MaceroTracero extends Macero{
    protected String acoplePiñon;
    public MaceroTracero(String tipoDisco,String marca, String tipoGiro, int agujeros,int tamañoEje, String acoplePiñon){
        super(tipoDisco, marca, tipoGiro, agujeros,tamañoEje);
        this.acoplePiñon = acoplePiñon;
        
    }
    
    protected String TipoEje(){
        if(tamañoEje >= 135 && tamañoEje <= 141){
            return "El tipo de eje es un quick release(QR) es de una bici de gama media-baja ";
        }else{
            return "El tipo de eje es uno pasante (Thru-Axle) es un eje bueno para poner llantas grander";
        }
    }
    
    public String Especificaciones(){
        return "La marca es:" + marca + " y tiene un tipo de eje:" + TipoEje() +" y es" + tipoGiro;
    }
}
