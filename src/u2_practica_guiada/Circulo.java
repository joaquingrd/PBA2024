/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u2_practica_guiada;

/**
 *
 * @author joaqu
 */
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
        return this.pi*this.radio*this.radio;
    }

}
