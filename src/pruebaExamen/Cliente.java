
package pruebaExamen;

import java.util.*;


public class Cliente {
    protected int dni;
    protected String apellido;
    protected String nombre;
    protected List <Libro> libros = new ArrayList();

    public Cliente(int dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public void addLibros(Libro libro){
    this.libros.add(libro);
    }
         
}
