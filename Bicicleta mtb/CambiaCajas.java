public class CambiaCajas extends SistemaControl{
    private String estabilizadorCadena;
    private int poleas;
    protected boolean habilitadoEstabilizador;
    public CambiaCajas(String marca, String modelo, int velocidades, String tipoEstabilizador, int poleas){
        super(marca, modelo,velocidades);
        this.estabilizadorCadena = tipoEstabilizador;
        estabilizador();
        this.poleas = poleas;
    }
    
    public void estabilizador(){
        if(estabilizadorCadena.equalsIgnoreCase("shadow rd+")){
            habilitadoEstabilizador = false;
        }else {
            habilitadoEstabilizador = true;
        }
    }
    
    public String activarShadowRDplus(String comoEsta){
        if(comoEsta.equalsIgnoreCase("on") || comoEsta.equalsIgnoreCase("habilitado")){
            habilitadoEstabilizador = true;
            return "Se habilito el estabilizador";
        }else{
            return "no se activo el estabilizador";
        }
    }

    public String Especificaciones(){
        return "Marca:" + marca + ", Del modelo:" + modelo +", velocidades: " + velocidades +", con su estabilizador de cadena:" + estabilizadorCadena + " y sus poleas de:"+ poleas + "el estabilizador esta:" + habilitadoEstabilizador; 
    }    
}
