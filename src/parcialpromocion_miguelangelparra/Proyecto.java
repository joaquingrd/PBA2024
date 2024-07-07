/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpromocion_miguelangelparra;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Gestionable {
    private int codigo;
    private String nombre;
    private final List<Tarea> tareas;
    private final List<Empleado> empleados;
    private int estadoProyecto; 

    public Proyecto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.estadoProyecto = 0; 
    }

    public void vincularEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void vincularTarea(Tarea tarea) {
        tareas.add(tarea);
        tarea.setProyecto(this); 
    }

    @Override
    public void iniciar() {
        if (estadoProyecto == 0) {
            this.estadoProyecto = 1; 
            System.out.println("Proyecto " + nombre + " iniciado.");
        } else {
            System.out.println("No se puede iniciar el proyecto " + nombre + " porque ya está en estado " + estadoProyecto);
        }
    }

    @Override
    public void terminar() {
        if (estadoProyecto == 1) {
            boolean todasTerminadas = true;
            for (Tarea tarea : tareas) {
                if (tarea.getEstado() != 2) { // Si alguna tarea no está terminada
                    todasTerminadas = false;
                    System.out.println("No se puede terminar el proyecto " + nombre + " porque la tarea " + tarea.getId() + " no está terminada.");
                    break;
                }
            }
            if (todasTerminadas) {
                this.estadoProyecto = 2; // Estado: terminado
                System.out.println("Proyecto " + nombre + " terminado.");
            }
        } else {
            System.out.println("No se puede terminar el proyecto " + nombre + " porque está en estado " + estadoProyecto);
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public int getEstadoProyecto() {
        return estadoProyecto;
    }

    public void setEstadoProyecto(int estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }
}

