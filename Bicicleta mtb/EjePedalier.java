public class EjePedalier extends BloqueFuerza{
    protected String tipoPedalier;
    protected String montaje;
    protected double diametroEje;
    protected String anchoCaja;
    public EjePedalier(String marca, String material, String tipoPedalier, String montaje, double diametroEje, String anchoCaja) {
        super(marca, material);
        this.tipoPedalier = tipoPedalier;
        this.montaje = montaje;
        this.diametroEje = diametroEje;
        this.anchoCaja = anchoCaja;
    }
    
}
