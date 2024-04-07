package guiaPOOUnidad1;

public class Patente {

    String letrasInicioPatente;
    int numeroPatente;
    String letrasFinPatente;

    public Patente() {
        letrasInicioPatente = "";
        numeroPatente = 0;
        letrasFinPatente = "";
    }

    public Patente(String letrasInicioPatente, int numeroPatente, String letrasFinPatente) {
        this.letrasInicioPatente = letrasInicioPatente;
        this.numeroPatente = numeroPatente;
        this.letrasFinPatente = letrasFinPatente;
    }

    public int getNumeroPatente() {
        return this.numeroPatente;
    }
}
