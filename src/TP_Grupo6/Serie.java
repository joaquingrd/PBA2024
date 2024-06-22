package TP_Grupo6;

public class Serie extends Video {
    protected int temporadas;
    protected int capTemp;
    protected Capitulo[] capitulos;
    protected int numCapitulos;

    public Serie(String titulo, int anio, String genero, int temporadas, int capTemp) {
        super(titulo, anio, genero, 0); 
        this.temporadas = temporadas;
        this.numCapitulos = 0;
        this.capTemp = capTemp;
        this.capitulos = new Capitulo[temporadas * capTemp];
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

    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + this.titulo + " | " + "Anio: " + this.anio + " | "  + this.temporadas + " temporadas" + " | " + "Genero: " + this.genero; 
    }

    public int agregarCapitulo(Capitulo capitulo) {
        if (numCapitulos < capitulos.length) {
            capitulos[numCapitulos] = capitulo;
            this.duracion += capitulo.getDuracion(); 
            numCapitulos++;
        }
        return numCapitulos;
    }
    
    public int compareCap(Video v) {
        int resultado = 0;
        if (v instanceof Serie) {
            Serie otraSerie = (Serie) v;
            int totalCapsThis = this.temporadas * this.capTemp;
            int totalCapsOtra = otraSerie.temporadas * otraSerie.capTemp;
            if (totalCapsThis > totalCapsOtra) {
                resultado = 1; // MAYOR
            }
            if (totalCapsThis < totalCapsOtra) {
                resultado = -1; // MENOR
            }
        }
        return resultado;
    }
}