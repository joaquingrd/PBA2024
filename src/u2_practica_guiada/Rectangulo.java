
package u2_practica_guiada;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    protected double calcularArea() {
        return this.base*this.altura;
    }
    
    @Override
    public String toString(){
        return "Este rectangulo se llama " + this.nombre + " y tiene un base de " + this.base + " y una altura de " + this.altura;
    }
    
    @Override
    public boolean equals(Object obj){
        // esto se hace para comparar la direccion del objeto que viene como parametro y el if
        if (this == obj){
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
        return false;
        }
    Rectangulo t = (Rectangulo) obj;
    return (this.base == t.base && this.altura == t.altura);
    }

}
