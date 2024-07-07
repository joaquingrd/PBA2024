
package pruebaExamen;

public class Profesor extends Cliente{

    private String legajoProfesor;
    
    public Profesor(int dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.legajoProfesor="";
    }
//G&S

    public String getLegajoProfesor() {
        return legajoProfesor;
    }

    public void setLegajoProfesor(String legajoProfesor) {
        this.legajoProfesor = legajoProfesor;
    }
    
}
