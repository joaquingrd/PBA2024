
package TP_Grupo6;


public class Pelicula extends Video {
    
    //CONSTRUCTOR
    public Pelicula(String titulo, int anio, String genero, int duracion) {
        super(titulo, anio, genero, duracion);
    }

    //--- GETTERS Y SETTERS---
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Boolean getVisto() {
        return visto;
    }

    public void setVisto(Boolean visto) {
        this.visto = visto;
    }

    public int getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    //--- GETTERS Y SETTERS---
    
    //--- METODOS---
    @Override
    public String toString(){
    return this.titulo + " | " + this.anio + " | " + this.duracion + " | " + this.genero;
    }
    
    @Override
    public int compareTo(Video v) {
        int resultado = 0;
        if (this.calificacion >= v.calificacion)resultado = 1; // MAYOR
        if (this.calificacion < v.calificacion)resultado = -1; // MENOR
        

        return resultado;
    }
    
    
    //--- METODOS---


}
