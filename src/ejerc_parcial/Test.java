
package ejerc_parcial;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("1234", "El Quijote", 50);
        Libro libro2 = new Libro("5678", "La Odisea", 24);

        Alumno alumno = new Alumno("1111", "Gomez", "Juan", "A123");
        Docente docente = new Docente("2222", "Perez", "Maria", "456");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.agregarCliente(alumno);
        biblioteca.agregarCliente(docente);

        // Prueba de prestar libros
        biblioteca.prestarLibro(libro1, alumno);
        biblioteca.prestarLibro(libro2, docente);

        // Prueba de devolver libros
        biblioteca.devolverLibro(libro1, alumno);
        biblioteca.devolverLibro(libro2, docente);

        // Listado de préstamos
        List<Libro> prestamos = biblioteca.listadoDePrestamos();
        System.out.println("Libros prestados:");
        for (Libro libro : prestamos) {
            System.out.println(libro.getTitulo());
        }

        // Libro con más capítulos
        biblioteca.masCapitulos();
    }
}
