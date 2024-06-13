package TP_Grupo6;

public class Serie extends Video {
    private int temporadas;
    private int capTemp;
    
    public Serie(String titulo, int anio, String genero, int duracion, int temporadas, int capTemp) {
        super(titulo, anio, genero, duracion);
        this.temporadas = temporadas;
        this.capTemp = capTemp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapTemp() {
        return capTemp;
    }

    public void setCapTemp(int capTemp) {
        this.capTemp = capTemp;
    }

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
    
    @Override
    public String toString() {
        return this.titulo + " | " + this.anio + " | " + this.temporadas + " temporadas" + " | " + this.genero ;
    }
    
   
    public int compareCap(Video v){
         int resultado = 0;
        if (v instanceof Serie){
             Serie otraSerie = (Serie) v;
             if ((this.temporadas*this.capTemp) >= (otraSerie.temporadas*otraSerie.capTemp))resultado = 1; // MAYOR
             if ((this.temporadas*this.capTemp) < (otraSerie.temporadas*otraSerie.capTemp))resultado = -1; // MENOR   
    }

        return resultado;
    }
}