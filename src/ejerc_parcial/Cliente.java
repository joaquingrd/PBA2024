/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc_parcial;

import java.util.*;

/**
 *
 * @author NOTEBOOK
 */
public abstract class Cliente {
    protected String dni;
    protected String apellido;
    protected String nombres;
    protected List<Libro> librosPrestados;

    
    public Cliente(String dni, String apellido, String nombres) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombres = nombres;
        this.librosPrestados = new ArrayList<>();
    }

    public String getDni() 
    {
        return dni;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public String getNombres() 
    {
        return nombres;
    }

    public List<Libro> getLibrosPrestados() 
    {
        return librosPrestados;
    }

    public abstract boolean puedePrestar();
    
    
    
    
}
