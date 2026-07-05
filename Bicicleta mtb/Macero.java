public class Macero{
    protected String tipoFreno;
    protected String marca;
    protected String tipoGiro;
    protected int agujeros;
    protected int tamañoEje;
    public Macero(String tipoDisco, String marca, String tipoGiro, int agujeros,int tamañoEje){
        this.tipoFreno = tipoFreno;
        this.marca = marca;
        this.tipoGiro = tipoGiro;
        this.agujeros = agujeros;
        this.tamañoEje = tamañoEje;
    }
    
    protected String TipoEje(){
        if(tamañoEje >= 100 && tamañoEje <= 110){
            return "El tipo de eje es un quick release(QR) es de una bici de gama media-baja ";
        }else{
            return "El tipo de eje es uno pasante (Thru-Axle) es un eje bueno para poner llantas grander";
        }
    }
    
    public String compatible(Disco disco){
        if(disco.getTipoAcople().equalsIgnoreCase(tipoFreno)){
            return "es compatible con el disco";
        }
        return "no es compatible con el disco";
    }
    
    public String Especificaciones(Disco disco){
        return "La marca es:" + marca + " y tiene un tipo de eje:" + TipoEje() + " y " + compatible(disco);
    }
}
