
package TP_Grupo6;


public class Pelicula extends Video  {
    
    //CONSTRUCTOR
    public Pelicula(String titulo, int anio, String genero, int duracion) {
        super(titulo, anio, genero, duracion);
    }
    
    //--- METODOS---
    @Override
    public String toString(){
    return "Titulo: " + this.titulo + " | " + "Anio: " + this.anio + " | " + "Duracion: " + minutosEnHoras(this.duracion) + " | " + "Genero: " + this.genero;
    }   
    
    public int compareDuracion(Video v) {
        int resultado = 0;
        if (v instanceof Pelicula) {
            Pelicula otraPeli = (Pelicula) v;
            int duracionPeli = this.duracion;
            int duracionOtraPeli = otraPeli.duracion;
            if (duracionPeli > duracionOtraPeli) {
                resultado = 1; // MAYOR
            }
            if (duracionPeli < duracionOtraPeli) {
                resultado = -1; // MENOR
            }
        }
        return resultado;
    }
    //--- METODOS---



}
