/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpromocion_miguelangelparra;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cuil;
    private String nombre;
    private List<Empleado> empleados;
    private List<Proyecto> proyectos;

    public Empresa(String cif, String nombre) {
        this.cuil = cuil;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public void vincularEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void vincularProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void vincularTareaProyecto(Proyecto proyecto, Tarea tarea) {
        proyecto.vincularTarea(tarea);
    }
}
