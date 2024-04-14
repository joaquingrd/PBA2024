package ecuacionesLineales;

public class Recta {

    private int cantMax;
    private int cantActual;
    private Punto[] rectaXY;

    public Recta() {
        this.cantMax = 2;
        this.cantActual = 0;
        this.rectaXY = new Punto[cantMax];
    }

    public void agregarPunto(Punto p) {
        if (cantActual < cantMax) {
            this.rectaXY[this.cantActual++] = p;
            System.out.println("Se agregó un nuevo punto: (" + p.getX() + "; " + p.getY() + ")");
        } else {
            System.out.println("La recta ya tiene dos puntos");
        }
    }

    public void getRectaXY() {
        if (cantActual > 0) {
            System.out.println("Puntos de la recta");
            System.out.println("=======");
            for (int i = 0; i < cantActual; i++) {
                int point = i + 1;
                System.out.println("la recta está conformada por el punto " + point + ": " + rectaXY[i].getXY());

            }
        }
    }

    public float pendiente() {
        float numerador = rectaXY[1].getY() - rectaXY[0].getY();
        float denominador = rectaXY[1].getX() - rectaXY[0].getX();
        float pen = numerador/denominador;
        return pen;
        
    }
}
