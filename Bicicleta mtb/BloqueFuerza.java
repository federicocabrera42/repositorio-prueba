public class BloqueFuerza{
    protected String marca;
    protected String material;
    protected Bielas biela;
    protected Platos platos;
    protected EjePedalier eje;
    protected Pedales pedal;
    protected Platos[] numeroPlatos;
    protected boolean platoCompleto;
    public BloqueFuerza(String marca, String material){
        this.marca = marca;
        this.material = material;
        this.numeroPlatos = new Platos[biela.numeroPlatos];
    }
    
    protected boolean lleno(){
        int suma = 0;
        for(int i = 0; i < numeroPlatos.length;i++){
            if(numeroPlatos[i] != null){
                suma++;
            }    
        }
        if(suma == numeroPlatos.length){
            platoCompleto = true;
            return platoCompleto;
        }
        platoCompleto = false;
        return platoCompleto;
    }

    protected boolean compatible(){
        if(biela.tamañoEje == eje.diametroEje && biela.montajePlato.equalsIgnoreCase(platos.montaje)){
            return true;
        }
        return false;
    }
    
    protected String mensaje(){
        if(compatible()){
            return "Todo encaja bien";
        }
        return "Revisa bien algo no encaja bien o no es su tamaño";
    }
        
    public String agregarPlatos(Platos platos){
        if(!lleno() && compatible()){
            for(int i = 0; i < numeroPlatos.length;i++){
                if(numeroPlatos[i] != null){
                    numeroPlatos[i] = platos ;
                    return "Se agregro correcamente por que todo cuadra";
                }    
            }
            return "El sistema reportaba espacio, pero las posiciones estaban ocupadas.";
        }
        return "Algo no cuadra bien revisalo";
    }
    
    public String estado(){
        return "Tiene unas bielas:" + biela.marca + ", con un eje pedalier" + eje.marca + ", con un plato:" + platos.marca +", con unos pedales:" + pedal.marca +" y " + compatible();
    }
}
