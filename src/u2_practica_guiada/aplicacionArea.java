package u2_practica_guiada;

import java.util.Scanner;

public class aplicacionArea {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas figuras deseas ingresar?");
        int maxFiguras = entrada.nextInt();
        int qActual = 0;
        Figura[] figuras = new Figura[maxFiguras];
        char opcion = 0;

        while (opcion != '9') {
            mostrarMenu();
            opcion = entrada.next().charAt(0);
            switch (opcion) {
                case '1':
                    qActual = cargarFigura(entrada, figuras, qActual, maxFiguras);
                    break;
                case '2':
                    mostrarFigura(figuras, qActual);
                    break;
                case '3':
                    qActual = borrarFigura(figuras, qActual);
                    System.out.println("Se borró la ultuma figura");
                    break;

                case '4':
                    figurasIguales(figuras, qActual);
                    break;

                case '9':
                    System.out.println("**************");
                    System.out.println("EL PROGRAMA HA FINALIZADO");
                    System.out.println("**************");
                default:
                    System.out.println("");

            }

        }
    }

    public static void mostrarMenu() {
        System.out.println("Menu principal");
        System.out.println("**************");
        System.out.println("1 Cargar figura");
        System.out.println("2 Mostrar figura");
        System.out.println("3 Borrar figura");
        System.out.println("4 Figuras iguales");
        System.out.println("9 Salir");
    }

    public static int cargarFigura(Scanner entrada, Figura[] figuras, int qActual, int maxFiguras) {
        System.out.println("Que tipo de figura deseas cargar?");
        System.out.println("**************");
        System.out.println("a- Cirgulo");
        System.out.println("b- Rectangulo");
        System.out.println("c- Triangulo");

        if (qActual < maxFiguras) {
            char opcion = entrada.next().charAt(0);
            switch (opcion) {
                case 'a':
                    figuras[qActual++] = cargarCirculo(entrada);
                    break;
                case 'b':
                    figuras[qActual++] = cargarRectangulo(entrada);
                    break;
                case 'c':
                    figuras[qActual++] = cargarTriangulo(entrada);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("**************");
            System.out.println("Superó la cantidad disponible");
            System.out.println("**************");

        }
        return qActual;
    }

    public static void mostrarFigura(Figura[] figuras, int qActual) {
        for (int i = 0; i < qActual; i++) {
            System.out.println(figuras[i].toString());
        }
    }

    public static Circulo cargarCirculo(Scanner entrada) {
        System.out.println("Ingresá el nombre del circulo");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingresá el radio del circulo");
        double radio = entrada.nextDouble();
        Circulo circulo = new Circulo(radio, nombre);
        return circulo;
    }

    public static Rectangulo cargarRectangulo(Scanner entrada) {
        System.out.println("Ingresá el nombre del rectangulo");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingresá la base del rectangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingresá la altura del rectangulo");
        double altura = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base, altura, nombre);
        return rectangulo;
    }

    public static Triangulo cargarTriangulo(Scanner entrada) {
        System.out.println("Ingresá el nombre del triangulo");
        entrada.nextLine();
        String nombre = entrada.nextLine();
        System.out.println("Ingresá la base del triangulo");
        double base = entrada.nextDouble();
        System.out.println("Ingresá la altura del triangulo");
        double altura = entrada.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura, nombre);
        return triangulo;
    }

    public static int borrarFigura(Figura[] figuras, int qActual) {
        figuras[qActual - 1] = null;
        qActual--;
        return qActual;
    }

    @SuppressWarnings("empty-statement")
    private static void figurasIguales(Figura[] figuras, int qActual) {
        boolean noIguales = true;
        for (int i = 0; i < qActual - 1; i++) {
            for (int j = 1; j < qActual; j++) {
                if (figuras[i] != figuras[j] && figuras[i].equals(figuras[j])) {
                    System.out.println("Existen figuras iguales");
                    System.out.println("La figura numero " + (i+1) + " es igual a la figura " + (j+1));
                    noIguales = false;
                }
            }
        }
        if (noIguales) {
            System.out.println("No existen figuras iguales");
        }

    }

}
