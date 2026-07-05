public class Disco{
    private int tamaño;
    protected String marca;
    private String material;
    private String tipoAcople;
    private int espesor;
    protected double desgaste;
    public Disco(int tamaño, String marca, String material, String tipoAcople, int espesor){
        this.tamaño = tamaño;
        this.marca = marca;
        this.material = material;
        this.tipoAcople = tipoAcople;
        this.espesor = espesor;
        this.desgaste = 100.00; 
    }
    
    public String getTipoAcople(){
        return tipoAcople;
    }
    
    public void desgasteFrenado(double uso){
        desgaste -= uso;
    }
    
    public String estado(){
        if(desgaste < 75){
            return "funciona no te preocupes";
        }else if(desgaste < 50){
            return "preparate para comprar otro";
        }else if(desgaste < 25){
            return "hermano ya deberias haber comprado otro";
        }else{
            return "necesito cambio urgente ya esta frenando con el fierro, cambia el disco mas";
        }
    }
    
    public String Especificaciones(){
        return "El disco es de:" + material + " y fueron hechas por:" + marca + "tiene el tamaño: " + tamaño +" el desgaste que tiene es:" + desgaste;
    }
}
