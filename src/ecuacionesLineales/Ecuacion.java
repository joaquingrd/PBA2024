package ecuacionesLineales;

public class Ecuacion {

    public static void main(String[] args) {

        Punto punto1 = new Punto(15, 45);
        Punto punto2 = new Punto(35, 55);

        System.out.println(punto1.getY());

        Recta recta1 = new Recta();

        recta1.agregarPunto(punto1);
        recta1.agregarPunto(punto2);

        System.out.println("+++++++++++");
        recta1.getRectaXY();
        System.out.println("La pendiente es de: " + recta1.pendiente());

    }

}
