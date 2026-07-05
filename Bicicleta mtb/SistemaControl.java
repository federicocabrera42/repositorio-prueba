public class SistemaControl{
    protected Shifter shifter;
    protected Piñon piñon;
    protected CambiaCajas desviador;
    protected String marca;
    protected String modelo;
    protected int velocidades;
    protected boolean topemenor;
    protected boolean topemayor;
    public SistemaControl(String marca, String modelo, int velocidades){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidades = velocidades;
        this.topemenor = false;
        this.topemayor = true;
    }
    
    public String recomendado(){
        if(piñon.velocidades == shifter.velocidades){
            if(desviador.modelo == piñon.modelo && desviador.modelo == shifter.modelo){
                return "El mejor ajuste todo completo en las velocidades 👍 y el modelo es "+ piñon.modelo;
            }else if(piñon.modelo == shifter.modelo){
                return "Esta bien pero seria mejor si le puedes poner las cajas del modelo "+ piñon.modelo +" para que funcione mejor";
            }else{
                return "no es recomendable pero si funciona no hay problema";
            }
        }else{
            return "no se puede usar las velocidades no son compatibles";
        }  
    }
    
    public String estado(){
        return "Tiene un desviador:" + desviador.marca + ", con un piñon" + piñon.marca + ", con un shifter:" + shifter.marca +" y " + recomendado();
    }
}
