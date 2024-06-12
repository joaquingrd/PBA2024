package TP_Grupo6;

public class Video implements Visualizable,Comparable<Video> {

    protected String titulo;
    protected int anio;
    protected String genero;
    protected int duracion;
    protected Boolean visto = false; 
    protected int tiempoVisto = 0;
    protected int calificacion;

    public Video(String titulo, int anio, String genero, int duracion) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.duracion = duracion;
    }

    //------GETERS Y SETERS------
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

//------GETERS Y SETERS------
    @Override
    public int tiempoVisto(int tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
        if(this.tiempoVisto > 0) this.visto = true;
        return this.tiempoVisto;
    }

    @Override
    public int ponerCalificacion(int calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            setCalificacion(calificacion);
        } else {
            System.out.println("Calificación no valida");
        }
        return this.calificacion;

    }

    @Override
    public int compareTo(Video v) {
        int resultado = 0;
        if(this.calificacion < v.calificacion)resultado = -1;
        if(this.calificacion >= v.calificacion)resultado = 1;

        return resultado;
    }

   
}
