
package ejerc_parcial;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private List<Cliente> clientes;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void prestarLibro(Libro unLibro, Cliente unCliente) {
        if (!libros.contains(unLibro)) {
            System.out.println("El libro no pertenece a la biblioteca.");
            return;
        }
        if (!clientes.contains(unCliente)) {
            System.out.println("El cliente no está registrado en la biblioteca.");
            return;
        }
        if (unLibro.isPrestado()) {
            System.out.println("El libro ya está prestado.");
            return;
        }
        if (!unCliente.puedePrestar()) {
            System.out.println("El cliente no puede tomar más libros en préstamo.");
            return;
        }
        unLibro.setPrestado(true);
        unCliente.getLibrosPrestados().add(unLibro);
        System.out.println("El libro ha sido prestado con éxito.");
    }

    public void devolverLibro(Libro unLibro, Cliente unCliente) {
        if (!libros.contains(unLibro)) {
            System.out.println("El libro no pertenece a la biblioteca.");
            return;
        }
        if (!clientes.contains(unCliente)) {
            System.out.println("El cliente no está registrado en la biblioteca.");
            return;
        }
        if (!unCliente.getLibrosPrestados().contains(unLibro)) {
            System.out.println("El libro no fue prestado.");
            return;
        }
        unLibro.setPrestado(false);
        unCliente.getLibrosPrestados().remove(unLibro);
        System.out.println("El libro ha sido devuelto con éxito.");
    }

    public List<Libro> listadoDePrestamos() {
        List<Libro> prestamos = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado()) {
                prestamos.add(libro);
            }
        }
        return prestamos;
    }

    public void masCapitulos() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        Libro libroMasCapitulos = libros.get(0);
        for (Libro libro : libros) {
            if (libro.getCapitulos() > libroMasCapitulos.getCapitulos()) {
                libroMasCapitulos = libro;
            }
        }
        System.out.println("Libro con más capítulos:");
        System.out.println("ISBN: " + libroMasCapitulos.getIsbn());
        System.out.println("Título: " + libroMasCapitulos.getTitulo());
        System.out.println("Capítulos: " + libroMasCapitulos.getCapitulos());
    }
}
