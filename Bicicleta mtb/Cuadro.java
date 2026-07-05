public class Cuadro{
    protected String marca;
    protected String talla;
    protected String tipoEje;
    protected String tipoPedalier;
    protected String anchoCaja;
    protected String TipoTuboDireccion;
    protected String tipoAnclajeSusTracera;
    protected int recorridoTracero;
    protected int tamañoAros;
    protected double tamañoEje;
    protected double diametroTuboSillin;
    protected double tamañoTuboDireccion;
    protected double diametroTuboDireccionBajo;
    protected double diametroTuboDireccionArriba;
    public Cuadro(String marca, String talla, String tipoEje, String tipoPedalier, String anchoCaja, String tipoAnclajeSusTracera, int recorridoTracero,int tamañoEje,int tamañoAros, double diametroTuboSillin, double tamañoTuboDireccion, double diametroTuboDireccionBajo, double diametroTuboDireccionArriba) {
        this.marca = marca;
        this.talla = talla;
        this.tipoEje = tipoEje;
        this.tipoPedalier = tipoPedalier;
        this.anchoCaja = anchoCaja;
        this.tipoAnclajeSusTracera = tipoAnclajeSusTracera;
        this.recorridoTracero = recorridoTracero;
        this.tamañoAros = tamañoAros;
        this.tamañoEje = tamañoEje;
        this.diametroTuboSillin = diametroTuboSillin;
        this.tamañoTuboDireccion = tamañoTuboDireccion;
        this.diametroTuboDireccionBajo = diametroTuboDireccionBajo;
        this.diametroTuboDireccionArriba = diametroTuboDireccionArriba;
        tuboDireccion();
    }
    
    protected void tuboDireccion(){
        if(diametroTuboDireccionBajo == diametroTuboDireccionArriba){
            TipoTuboDireccion = "recto";
        }else{
            TipoTuboDireccion = "conico";
        }
    }
    
    public String estado() {
    return "Cuadro marca " + marca + " talla " + talla +
           " con eje tipo " + tipoEje + " (" + tamañoEje + "mm) y pedalier " + tipoPedalier + " de " + anchoCaja + ". " +
           "El tubo de dirección es de tipo " + TipoTuboDireccion + " con un tamaño de " + tamañoTuboDireccion + 
           "\" (Medidas: inferior " + diametroTuboDireccionBajo + "mm / superior " + diametroTuboDireccionArriba + "mm). " +
           "Soporta aros de tamaño " + tamañoAros + "\", cuenta con anclaje de suspensión trasera " + tipoAnclajeSusTracera + 
           " y un recorrido trasero de " + recorridoTracero + "mm. " +
           "El diámetro del tubo de sillín es de " + diametroTuboSillin + "mm.";
}
}
