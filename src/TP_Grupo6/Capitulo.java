
package TP_Grupo6;


public class Capitulo extends Serie {
    
   protected int temporada;
   protected int numeroCapitulo;
   protected int iSerie;

    public Capitulo(int iSerie, String titulo, int anio, String genero, int temporadas, int capTemp, int duracion, int temporada, int numeroCapitulo) {
        super(titulo, anio, genero, temporadas, capTemp);
        this.iSerie = iSerie;
        this.duracion = duracion;
        this.temporada = temporada;
        this.numeroCapitulo = numeroCapitulo;
    }

    // Getters y Setters
    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getNumeroCapitulo() {
        return numeroCapitulo;
    }

    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }
    public int getiSerie() {
        return iSerie;
    }

    public void setiSerie(int iSerie) {
        this.iSerie = iSerie;
    }

    //--- METODOS---
    @Override
    public String toString() {
        return "Titulo del capitulo: " + this.titulo + " | " + "Anio: " + this.anio + " | " + "Duracion: " + minutosEnHoras(this.duracion) + " | " + "Genero: " + this.genero;
    }

    
    
}
