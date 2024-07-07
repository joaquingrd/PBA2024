package Parcial1RuizDiazJoaquin;

public class Tarea implements Gestionable {

    private Integer idTarea;
    private String nombreTarea;
    private Integer estadoTarea;
    private Integer duracionTarea;
    private Empleado responsable;
    private Proyecto proyecto;

    public Tarea(Integer idTarea, String nombreTarea, Integer duracionTarea) {
        this.idTarea = idTarea;
        this.nombreTarea = nombreTarea;
        this.estadoTarea = 0;
        this.duracionTarea = duracionTarea;

    }

// G & S
    public Integer getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public Integer getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(Integer estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public Integer getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(Integer duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public void setResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    //METODOS
    @Override
    public void iniciar() {
        if (proyecto.estadoProyecto > 0) {
            if (this.estadoTarea > 0) {
                System.out.print("La tarea ya fue iniciada");
            } else if (this.estadoTarea == 2) {
                System.out.print("La tarea ya fue finalizada");
            } else {
                this.estadoTarea = 1;
                System.out.print("Tarea iniciada");
            }
        }else{
         System.out.print("Para poder iniciar la tarea, proyecto " + proyecto.nombreProyecto + " debe estar iniciado.");
        }

    }

    @Override
    public void terminar() {
        if (this.estadoTarea == 0) {
            System.out.print("La tarea no fue iniciada");
        } else if (this.estadoTarea == 2) {
            System.out.print("La tarea ya fue finalizada");
        } else {
            this.estadoTarea = 2;
            System.out.print("Tarea finalizada");
        }
    }

}
