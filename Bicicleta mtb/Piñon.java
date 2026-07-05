public class Piñon extends SistemaControl{
    private int piñonMenor;
    private int piñonMayor;
    private String tecnologia;
    protected String tipoAnclaje;
    public Piñon(String marca, String modelo, int velocidades, int piñonMenor, int piñonMayor, String tecnologia, String anclaje){
        super(marca, modelo,velocidades);
        this.piñonMenor = piñonMenor;
        this.piñonMayor = piñonMayor;
        this.tecnologia = tecnologia;
        this.tipoAnclaje = anclaje;
    }
        
    public String Especificaciones(){
        return "Marca:" + marca + ", Del modelo:" + modelo +", velocidades: " + velocidades +", con un relacion de:" + piñonMenor + ", " + piñonMayor + ",  con la tecnologia de " + tecnologia +" y con el anclaje;" + tipoAnclaje;
    }
}
