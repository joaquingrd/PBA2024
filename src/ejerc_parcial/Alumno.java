
package ejerc_parcial;


public class Alumno extends Cliente{
    
    private String legajo;

    public Alumno(String dni, String apellido, String nombres,String legajo) {
        super(dni, apellido, nombres);
        this.legajo=legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    @Override
    public boolean puedePrestar() {
        return librosPrestados.size()<2;
    }
    

    




}
