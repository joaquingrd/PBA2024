
package u2_practica_guiada;


public class Circulo extends Figura {

    private final double pi = Math.PI;
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double calcularArea() {
        return Math.round(this.pi*this.radio*this.radio);
    }
    
    @Override
    public String toString(){
        return "Este circulo se llama " + this.nombre + " y tiene un area de " + this.radio;
    }

}
