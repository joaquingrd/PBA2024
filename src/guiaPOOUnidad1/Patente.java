package guiaPOOUnidad1;

public class Patente {

    String letrasInicioPatente;
    int numeroPatente;
    String letrasFinPatente;

    public Patente() {
        letrasInicioPatente = "AA";
        numeroPatente = 111;
        letrasFinPatente = "AA";
    }

    public Patente(String letrasInicioPatente, int numeroPatente, String letrasFinPatente) {
        this.letrasInicioPatente = letrasInicioPatente;
        this.numeroPatente = numeroPatente;
        this.letrasFinPatente = letrasFinPatente;
    }

    public int getNumeroPatente() {
        return this.numeroPatente;
    }

    public void setNumeroPatente(int numeroPatente) {
        if ((0 < numeroPatente) && (numeroPatente < 1000)) {
        } else {
            System.out.println("Número de Patente Inválido");
        }

    }

    public String getLetrasInicioPatente() {
        return letrasInicioPatente;
    }

    public String getLetrasFinPatente() {
        return letrasFinPatente;
    }

    public void setLetrasInicioPatente(String letrasPatente) {
        if (letrasPatente.length() < 3) {
            this.letrasInicioPatente = letrasPatente;
        } else {
            System.out.println("Letras de Patente Inválida");
        }
    }

    public void setLetrasFinPatente(String letrasFinPatente) {
        this.letrasFinPatente = letrasFinPatente;
    }

}
