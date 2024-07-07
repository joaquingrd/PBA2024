 
package pruebaExamen;

import java.util.*;


public class Biblioteca {
    private List <Libro> libros = new ArrayList();
    private List <Cliente> clientes = new ArrayList();
    
    public void prestarLibro(Libro unLibro, Cliente unCliente){
    unLibro.setEstado(true);
    unCliente.addLibros(unLibro);
    }
    
}
