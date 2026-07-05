public class SistemaTrasmicion{
    protected BloqueFuerza bloque;
    protected SistemaControl control;
    protected int velocidad;
    public SistemaTrasmicion(int velocidad){
        this.velocidad = velocidad;
    }
    
    public int bajarCaja(int accionShifter){
        if(velocidad > 0 && !control.topemenor && accionShifter <= control.velocidades){
            if(control.velocidades == 0 || accionShifter == 12){
                control.topemenor = true;
                control.topemayor = false;
                return control.velocidades = 0;
            }
            return control.velocidades -= accionShifter;
        }
        return velocidad;
    }
    
    public int subirCaja(int accionShifter){
        if(velocidad > 0 && !control.topemayor && accionShifter <= control.velocidades){
            if(control.velocidades == 0 || accionShifter == 12){
                control.topemenor = false;
                control.topemayor = true;
                return control.velocidades = 12;
            }
            return control.velocidades += accionShifter;
        }
        return velocidad;
    }
    
    public String estado(){
        return "informacion de bielas,plato,etc:" + bloque.estado() +", informacion del de las velocidades, cambio de cajas etc:" + control.estado() ;
    }
}
