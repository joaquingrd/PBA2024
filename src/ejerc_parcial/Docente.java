
package ejerc_parcial;



public class Docente extends Cliente{
    private String legajo;

    
    public Docente(String legajo, String dni, String apellido, String nombres) {
        super(dni, apellido, nombres);
        this.legajo = legajo;
    }

    @Override
    public boolean puedePrestar() {
        return true;    }
    
}
