package Parcial1RuizDiazJoaquin;

import java.util.*;

public class Empresa {

    private String cuil;
    private String nombre;
    private List<Proyecto> proyectos;
    private List<Empleado> empleados;

    public Empresa(String cuil, String nombre) {
        this.cuil = cuil;
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    
    
    //G&S

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    //METODOS
    

}
