package u2_practica_guiada;

public class aplicacionArea {

    public static void main(String[] args) {

        Circulo c1 = new Circulo(44.55, "Mi Circulo");
        Rectangulo r1 = new Rectangulo(30, 40, "Mi Rectangulo");
        Triangulo t1 = new Triangulo(50, 70, "Mi Triangulo");

        System.out.println("El area de " + c1.nombre + " es de: " + c1.calcularArea());
        System.out.println("El area de " + r1.nombre + " es de: " + r1.calcularArea());
        System.out.println("El area de " + t1.nombre + " es de: " + t1.calcularArea());

    }

}
