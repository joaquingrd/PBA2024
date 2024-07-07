/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialpromocion_miguelangelparra;



public class Empleado {
    private int legajo;
    private String nombre;
    private String puesto;

    public Empleado(int id, String nombre, String puesto) {
        this.legajo = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

  
    public int getlegajo() {
        return legajo;
    }

    public void setId(int id) {
        this.legajo = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

