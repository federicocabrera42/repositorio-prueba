public class PastillasFreno{
    private String marca;
    private String material;
    private int vecesUsados;
    private double desgaste;
    public PastillasFreno(String marca, String material){
        this.marca = marca;
        this.material = material;
        this.vecesUsados = 0;
        this.desgaste = 100.00;
    }
    
    public void usos(){
        vecesUsados++;
    }
    
    public void Desgastar(Disco disco,int KM_andados){
        if(material.equalsIgnoreCase("metal")){
            double desgastando = (vecesUsados * 0.5);
            desgaste -= vecesUsados * 0.01;
            disco.desgasteFrenado(desgastando);
        }else{
            double desgastando = (vecesUsados * 0.01);
            desgaste -= vecesUsados * 0.5;
            disco.desgasteFrenado(desgastando);
        }
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
        return "Las pastillas son de:" + material + " y fueron hechas por:" + marca;
    }
}
