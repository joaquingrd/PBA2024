package Parcial1RuizDiazJoaquin;

import java.util.*;

public class Proyecto implements Gestionable {

    protected Integer idProyect;
    protected String nombreProyecto;
    protected Integer estadoProyecto;
    protected List<Empleado> equipo;
    protected List<Tarea> tareas;

    public Proyecto(Integer idProyect, String nombreProyecto) {
        this.idProyect = idProyect;
        this.nombreProyecto = nombreProyecto;
        this.estadoProyecto = 0;
        this.equipo = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }

    // G&S

    public Integer getIdProyect() {
        return idProyect;
    }

    public void setIdProyect(Integer idProyect) {
        this.idProyect = idProyect;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Integer getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(Integer estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }

    public List<Empleado> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Empleado> equipo) {
        this.equipo = equipo;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }
   

    //METODOS
    
  

    @Override
    public void terminar() {
        if (this.estadoProyecto == 0) {
            System.out.print("El proyecto no fue iniciada");
        } else if (this.estadoProyecto == 2) {
            System.out.print("El proyecto ya fue finalizada");
        } else {
            this.estadoProyecto = 2;
            System.out.print("Proyecto finalizada");
        }
    }

    @Override
    public void iniciar() {
        if (this.estadoProyecto > 0) {
            System.out.print("El proyecto " + this.nombreProyecto + " ya fue iniciado");
            
        } else if (this.estadoProyecto == 2) {
            System.out.print("El proyecto " + this.nombreProyecto + " ya fue finalizado");
        } else {
            this.estadoProyecto = 1;
            System.out.print("Proyecto " + this.nombreProyecto + " iniciada");
        }
    }

}
