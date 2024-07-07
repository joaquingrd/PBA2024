package Parcial1RuizDiazJoaquin;


public class Empleado {

    private Integer legajo;
    private String nombre;
    private String rol;

    private int  idProyecto;
    private int  idTarea;

    
    public Empleado(Integer legajo, String nombre, String rol) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.rol = rol;
        this.idProyecto = 0;
        this.idTarea = 0;
    }

    //G&S
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
              
    }
 public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTareas) {
        this.idTarea = idTareas;
    }
    //METODOS
    
    
    
}
