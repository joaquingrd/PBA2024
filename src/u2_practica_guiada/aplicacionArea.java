package u2_practica_guiada;

import java.util.Scanner;

public class aplicacionArea {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas figuras deseas ingresar?");
        int maxFiguras = entrada.nextInt();
        int figuraActual = 0;
        Figura Figuras[] = new Figura[maxFiguras];
        char opcion = 0;
        
System.out.println(opcion);
        mostrarMenu();
        opcion = entrada.next().charAt(0);
        System.out.println(opcion);


    }

    public static void mostrarMenu() {
        System.out.println("Menu principal");
        System.out.println("**************");
        System.out.println("1 Cargar figura");
        System.out.println("2 Mostrar figura");
        System.out.println("3 Salir");

    }

}
