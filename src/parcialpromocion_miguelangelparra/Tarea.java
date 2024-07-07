/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpromocion_miguelangelparra;

public class Tarea implements Gestionable {
    private int id;
    private String nombre;
    private int duracionHoras;
    private Empleado responsable;
    private Proyecto proyecto;
    private int estado; // 0: no iniciada, 1: en progreso, 2: terminada

    public Tarea(int id, int duracionHoras) {
        this.id = id;
        this.nombre = "";
        this.duracionHoras = duracionHoras;
        this.estado = 0; // Estado inicial: no iniciada
    }

    public void asignarResponsable(Empleado responsable) {
        this.responsable = responsable;
    }

    @Override
    public void iniciar() {
        if (proyecto != null && proyecto.getEstadoProyecto() == 1) {
            if (estado == 0) {
                this.estado = 1;
                System.out.println("Tarea " + id + " - " + nombre + " iniciada.");
            } else {
                System.out.println("No se puede iniciar la tarea " + id + " - " + nombre + " porque ya está en estado " + estado);
            }
        } else {
            System.out.println("No se puede iniciar la tarea " + id + " - " + nombre + " porque el proyecto " + proyecto.getNombre() + " no está en progreso.");
        }
    }

    @Override
    public void terminar() {
        if (estado == 1) {
            this.estado = 2; 
            System.out.println("Tarea " + id + " - " + nombre + " terminada.");
        } else {
            System.out.println("No se puede terminar la tarea " + id + " - " + nombre + " porque está en estado " + estado);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
