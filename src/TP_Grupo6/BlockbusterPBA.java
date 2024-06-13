package TP_Grupo6;

import java.util.Scanner;

public class BlockbusterPBA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxVideos = 200;
        int cantActual = 0;
        Video videos[] = new Video[maxVideos];

        System.out.println("**********");
        System.out.println("Bienvenido a PBABlockbuster!");
        System.out.println("**********");

        int opcion;
        do {
            menuPrincipal();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    videos[cantActual] = cargarPelicula(entrada);
                    System.out.println(videos[cantActual].toString());
                    cantActual++;
                }
                case 2 -> {
                    videos[cantActual] = cargarSerie(entrada);
                    System.out.println(videos[cantActual].toString());
                    cantActual++;
                }
                case 3 -> {
                    System.out.println(videos[cantActual].toString());
                }
                case 4 -> {
                    actualizarPelicula(entrada, videos, cantActual);
                }
                case 5 -> {
                    actualizarSeries(entrada, videos, cantActual);
                }
                case 6 -> {
                }
                case 7 -> {
                    listadoSubMenu(entrada, cantActual, videos);
                }
                case 9 ->
                    System.out.println("Gracias por elegir la PBABlockbuster!");
                default ->
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 9);
    }

    public static void menuPrincipal() {
        System.out.println("---- SELECCIONAR OPCION: ----");
        System.out.println("**********");
        System.out.println("1 - Registrar Pelicula");
        System.out.println("2 - Registrar Serie");
        System.out.println("3 - Registrar Capitulo");
        System.out.println("4 - Actualizar Pelicula");
        System.out.println("5 - Actualizar Serie");
        System.out.println("6 - Actualizar Capitulo");
        System.out.println("7 - Listados");
        System.out.println("9 - Salir");
        System.out.println("***********");
    }

    public static void listadoSubMenu(Scanner entrada, int cantActual, Video[] videos) {
        System.out.println("---- SELECCIONAR OPCION: ----");
        System.out.println("**********");
        System.out.println("1 - Videos vistos");
        System.out.println("2 - Mis videos pendientes");
        System.out.println("3 - Mis favoritos");
        System.out.println("4 - Serie con mas capítulos");
        System.out.println("5 - Pelicula mas corta");
        System.out.println("9 - Volver al menu principal");
        System.out.println("***********");

        int opcion;
        do {
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    videosVistos(videos, cantActual);
                }
                case 2 -> {
                    videosPendientes(videos, cantActual);
                }
                case 3 -> {
                    videosFavoritos(videos, cantActual);
                }
                case 4 -> {
                    serieConMasCapitulos(videos, cantActual);
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                default ->
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 9);
    }

    public static Pelicula cargarPelicula(Scanner entrada) {
        System.out.println("Ingrese el titulo de la pelicula: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el anio de la pelicula: ");
        int anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el genero de la pelicula: ");
        String genero = entrada.nextLine();
        System.out.println("Ingrese la duracion de la pelicula: ");
        int duracion = entrada.nextInt();
        Pelicula pelicula = new Pelicula(titulo, anio, genero, duracion);
        return pelicula;
    }

    public static Serie cargarSerie(Scanner entrada) {
        System.out.println("Ingrese el titulo de la serie: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el anio de la serie: ");
        int anio = entrada.nextInt();
        System.out.println("Ingrese el genero de la serie: ");
        entrada.nextLine();
        String genero = entrada.nextLine();
        System.out.println("Ingrese la duracion de la serie: ");
        int duracion = entrada.nextInt();
        System.out.println("Ingrese las temporadas de la serie: ");
        int temporadas = entrada.nextInt();
        System.out.println("Ingrese la cantidad de capitulos por cada temporada: ");
        int capTemp = entrada.nextInt();
        Serie serie = new Serie(titulo, anio, genero, duracion, temporadas, capTemp);
        return serie;
    }

    public static Capitulo cargarCapitulo(Scanner entrada) {
        System.out.println("Ingrese el titulo del Capitulo: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el anio del Capitulo: ");
        int anio = entrada.nextInt();
        System.out.println("Ingrese el genero del Capitulo: ");
        String genero = entrada.nextLine();
        System.out.println("Ingrese la duracion del Capitulo: ");
        int duracion = entrada.nextInt();
        System.out.println("Ingrese la temporada del Capitulo: ");
        int temporadas = entrada.nextInt();
        System.out.println("Ingrese la temporada del Capitulo: ");
        int capTemp = entrada.nextInt();
        Capitulo capitulo = new Capitulo(titulo, anio, genero, duracion, temporadas, capTemp);
        return capitulo;
    }

    public static void actualizarPelicula(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Peliculas");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula) {
                System.out.println(i + " " + video[i].toString());
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("¿Que peli queres actualizar?");
        System.out.println("----------------------------------------------------------------");
        int peli = entrada.nextInt();
        System.out.println("¿Cuantos minutos viste de la peli?");
        int minutos = entrada.nextInt();
        video[peli].tiempoVisto(minutos);
        System.out.println("Califica la pelicula del 1 al 10");
        int calificacion = entrada.nextInt();
        video[peli].ponerCalificacion(calificacion);
        System.out.println(video[peli].toString() + " | Tiempo visto: " + minutos + " | Calificacion: " + calificacion);
    }

    public static void actualizarSeries(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Series");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                System.out.println(i + " " + video[i].toString());
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("¿Que serie queres actualizar?");
        System.out.println("----------------------------------------------------------------");
        int serie = entrada.nextInt();
        System.out.println("¿Cuantos minutos viste de la serie?");
        int minutos = entrada.nextInt();
        video[serie].tiempoVisto(minutos);
        System.out.println("Califica la serie del 1 al 10");
        int calificacion = entrada.nextInt();
        video[serie].ponerCalificacion(calificacion);
        System.out.println(video[serie].toString() + " | Tiempo visto: " + minutos + " | Calificacion: " + calificacion);
    }

    public static void videosVistos(Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("PBA Blockbuster - Videos ya vistos");
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Peliculas");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula) {
                if (video[i].visto) {
                    System.out.println(video[i].toString());
                }
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Series");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                if (video[i].visto) {
                    System.out.println(video[i].toString());
                }

            }
        }
    }

    public static void videosPendientes(Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("PBA Blockbuster - Videos pendientes");
        System.out.println("----------------------------------------------------------------");

        System.out.println("----------------------------------------------------------------");
        System.out.println("Peliculas");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula) {
                if (video[i].tiempoVisto < video[i].duracion && video[i].visto) {
                    System.out.println(video[i].toString());
                }
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Series");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                if (video[i].tiempoVisto < video[i].duracion && video[i].visto) {
                    System.out.println(video[i].toString());
                }
            }
        }
    }

    public static void videosFavoritos(Video[] video, int cantActual) {

        System.out.println("----------------------------------------------------------------");
        System.out.println("Tus peliculas y series favoritas ordenadas por su calificacion");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual - 1; i++) {
            for (int j = 0; j < cantActual - i - 1; j++) {
                if (video[j].compareTo(video[j + 1]) < 0) {
                    Video temp = video[j];
                    video[j] = video[j + 1];
                    video[j + 1] = temp;
                }
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Peliculas Favoritas");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula && video[i].getCalificacion() > 7) {
                System.out.println(video[i].titulo + " - Calificación: " + video[i].calificacion);
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Series Favoritas");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie && video[i].getCalificacion() > 7) {
                System.out.println(video[i].titulo + " - Calificación: " + video[i].calificacion);
            }
        }
    }

    private static void serieConMasCapitulos(Video[] video, int cantActual) {
       
    int masCapitulos = -1;
    for (int i = 0; i < cantActual - 1; i++) {
        for (int j = 0; j < cantActual - i - 1; j++) {
            if (video[j] instanceof Serie && video[j + 1] instanceof Serie) {
                Serie serie1 = (Serie) video[j];
                Serie serie2 = (Serie) video[j + 1];

                if ((serie1.getTemporadas() * serie1.getCapTemp()) < (serie2.getTemporadas() * serie2.getCapTemp())) {
                    masCapitulos = j + 1; // Actualizar índice de la serie con más capítulos
                }
            }
        }
    }

    if (masCapitulos != -1) {
        System.out.println("La serie con mas capitulos es: " + video[masCapitulos].getTitulo());
    } else {
        System.out.println("No se encontró ninguna serie en el array.");
    }

    }
}
