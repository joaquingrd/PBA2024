
package pruebaExamen;


public class Libro {

   
    private int isbn;
    private String titulo;
    private boolean estado;
    private int capitulos;
    
        public Libro(int isbn, String titulo, int capitulos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.estado = false;
        this.capitulos = capitulos;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCapiutulos() {
        return capitulos;
    }

    public void setCapiutulos(int capiutulos) {
        this.capitulos = capiutulos;
    }
    
     @Override
    public String toString() {
        return "Libro{" + "isbn=" + this.isbn + ", titulo=" + this.titulo + ", estado=" + this.estado + ", capiutulos=" + this.capitulos + '}';
    }
        
        
    
}
