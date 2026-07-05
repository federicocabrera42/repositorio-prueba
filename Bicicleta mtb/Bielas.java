public class Bielas extends BloqueFuerza{
    protected int tamañoBrazos;
    protected int tamañoEje;
    protected int numeroPlatos;
    protected String montajePlato;
    protected String material;
    public Bielas(String marca, String material,int tamañoBrazos, int tamañoEje, int numeroPlatos, String montajePlato){
        super(marca,material);
        this.tamañoBrazos = tamañoBrazos;
        this.tamañoEje = tamañoEje;
        this.montajePlato = montajePlato;
    }
    
    
}
