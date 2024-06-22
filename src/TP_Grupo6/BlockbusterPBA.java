package TP_Grupo6;

import java.util.Scanner;

public class BlockbusterPBA {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maxVideos = 200;
        int cantActual = 0;
        Video videos[] = new Video[maxVideos];

        System.out.println("****************************");
        System.out.println("------------*---------------");
        System.out.println("-----------***-------------");
        System.out.println("-------************---------");
        System.out.println("----------******------------");
        System.out.println("----------**--**------------");
        System.out.println("----------*----*------------");
        System.out.println("Bienvenido a PBABlockbuster!");
        System.out.println("****************************");

        int opcion;
        do {
            menuPrincipal();
            while (!entrada.hasNextInt()) {
                System.out.println("Por favor, ingrese un numero valido.");
                entrada.next();
            }
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    videos[cantActual] = cargarPelicula(entrada);
                    System.out.println(videos[cantActual].toString());
                    cantActual++;
                    System.out.println("");
                    System.out.println("");

                }
                case 2 -> {
                    videos[cantActual] = cargarSerie(entrada);
                    System.out.println(videos[cantActual].toString());
                    cantActual++;
                    System.out.println("");
                    System.out.println("");

                }
                case 3 -> {
                    videos[cantActual] = cargarCapitulo(entrada, videos, cantActual);
                    if (videos[cantActual] != null) {
                        Capitulo indexCap = (Capitulo) videos[cantActual];
                        String tituloSerie = videos[indexCap.getiSerie()].getTitulo();
                        System.out.println("Serie: " + tituloSerie + " | " + videos[cantActual].toString());
                    }
                    cantActual++;
                    System.out.println("");
                    System.out.println("");

                }
                case 4 -> {
                    actualizarPelicula(entrada, videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 5 -> {
                    actualizarSeries(entrada, videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 6 -> {
                    actualizaCapitulos(entrada, videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 7 -> {
                    listadoSubMenu(entrada, cantActual, videos);
                    System.out.println("");
                    System.out.println("");

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
        System.out.println("*****************************");
        System.out.println("1 - Registrar Pelicula");
        System.out.println("2 - Registrar Serie");
        System.out.println("3 - Registrar Capitulo");
        System.out.println("4 - Actualizar Pelicula");
        System.out.println("5 - Actualizar Serie");
        System.out.println("6 - Actualizar Capitulo");
        System.out.println("7 - Listados");
        System.out.println("9 - Salir");
        System.out.println("*****************************");
    }

    public static void listadoSubMenu(Scanner entrada, int cantActual, Video[] videos) {
        int opcion;
        do {
            subMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> {
                    videosVistos(videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 2 -> {
                    videosPendientes(videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 3 -> {
                    videosFavoritos(videos, cantActual);
                    System.out.println("");
                    System.out.println("");

                }
                case 4 -> {
                    serieConMasCapitulos(videos);
                    System.out.println("");
                    System.out.println("");

                }
                case 5 -> {
                    peliculaMasCorta(videos);
                    System.out.println("");
                    System.out.println("");

                }
                case 9 -> {
                    menuPrincipal();
                }
                default ->
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 9);
    }

    public static void subMenu() {
        System.out.println("---- SELECCIONAR OPCION: ----");
        System.out.println("****************************");
        System.out.println("1 - Videos vistos");
        System.out.println("2 - Mis videos pendientes");
        System.out.println("3 - Mis favoritos");
        System.out.println("4 - Serie con mas capitulos");
        System.out.println("5 - Pelicula mas corta");
        System.out.println("9 - Volver al menu principal");
        System.out.println("****************************");
    }

    public static Pelicula cargarPelicula(Scanner entrada) {
        System.out.print("Ingrese titulo de la pelicula: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        int anio;
        do {
            System.out.print("Ingrese anio de la pelicula: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            anio = entrada.nextInt();
        } while (anio <= 0);

        String genero;
        do {
            System.out.print("Ingrese genero de la pelicula: ");
            genero = entrada.next().trim();
            if (!genero.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                System.out.print("Por favor, ingrese un genero valido en letras: ");
                genero = "";
            }
        } while (genero.isEmpty());

        int duracion;
        do {
            System.out.print("Ingrese duracion de la pelicula (en minutos): ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            duracion = entrada.nextInt();
        } while (duracion <= 0);

        Pelicula pelicula = new Pelicula(titulo, anio, genero, duracion);
        return pelicula;
    }

    public static Serie cargarSerie(Scanner entrada) {
        System.out.print("Ingrese titulo de la serie: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();
        int anio;
        do {
            System.out.print("Ingrese anio de la serie: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            anio = entrada.nextInt();
        } while (anio <= 0);

        String genero;
        do {
            System.out.print("Ingrese genero de la serie: ");
            genero = entrada.next().trim();
            if (!genero.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                System.out.println("Por favor, ingrese un genero valido en letras.");
                genero = "";
            }
        } while (genero.isEmpty());

        int temporadas;
        do {
            System.out.print("Ingrese numero de temporadas de la serie: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            temporadas = entrada.nextInt();
        } while (temporadas <= 0);
        int capTemp;
        do {
            System.out.print("Ingrese la cantidad de capitulos por temporada: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            capTemp = entrada.nextInt();
        } while (capTemp <= 0);

        Serie serie = new Serie(titulo, anio, genero, temporadas, capTemp);
        return serie;
    }

    public static Capitulo cargarCapitulo(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("******************************Series****************************");
        System.out.println("----------------------------------------------------------------");

        boolean seriesEncontradas = false;
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie && !(video[i] instanceof Capitulo)) {
                System.out.println((i + 1) + " - " + video[i].toString());
                seriesEncontradas = true;
            }
        }

        if (!seriesEncontradas) {
            System.out.println("Primero necesitas registrar una serie");
            return null;
        }

        int serie = -1;
        int iSerie;
        while (true) {
            System.out.print("A cual serie pertenece el Capitulo? ");
            if (entrada.hasNextInt()) {
                serie = entrada.nextInt() - 1;
                iSerie = serie;
                if (serie >= 0 && serie < cantActual && video[serie] instanceof Serie) {
                    break;
                } else {
                    System.out.println("Indice de serie invalido o el video seleccionado no es una serie. Intente nuevamente.");
                }
            } else {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
        }

        Serie indexSerie = (Serie) video[serie];
        int numeroCapitulo;
        int capTemp = indexSerie.getCapTemp();
        String genero = indexSerie.getGenero();
        int temporadas = indexSerie.getTemporadas();
        int anioSerie = indexSerie.getAnio();

        do {
            System.out.print("Ingrese el numero del capitulo: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            numeroCapitulo = entrada.nextInt();
            if (numeroCapitulo > capTemp) {
                System.out.println("Las temporadas solo tienen " + capTemp + " capitulos.");
            }
        } while (numeroCapitulo <= 0 || numeroCapitulo > capTemp);

        System.out.print("Ingrese titulo del capitulo: ");
        entrada.nextLine();
        String titulo = entrada.nextLine();

        int anio = 0;
        do {
            System.out.print("Ingrese anio del capitulo: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            anio = entrada.nextInt();
            if (anio < anioSerie) {
                System.out.print("Por favor, ingrese un anio mayor que " + anioSerie + ", que es el anio de la serie.");
            }
        } while (anio < anioSerie);

        int duracion;
        do {
            System.out.print("Ingrese duracion del capitulo (en minutos): ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            duracion = entrada.nextInt();
        } while (duracion <= 0);

        int temporada;
        do {
            System.out.print("Ingrese la temporada a la cual pertenece el Capitulo: ");
            while (!entrada.hasNextInt()) {
                System.out.print("Por favor, ingrese un numero valido: ");
                entrada.next();
            }
            temporada = entrada.nextInt();
            if (temporada > temporadas) {
                System.out.println("La serie solo tiene " + temporadas + " temporadas.");
            }
        } while (temporada <= 0 || temporada > temporadas);

        Capitulo capitulo = new Capitulo(iSerie, titulo, anio, genero, temporadas, capTemp, duracion, temporada, numeroCapitulo);
        indexSerie.agregarCapitulo(capitulo);
        return capitulo;
    }

    public static void actualizarPelicula(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("**************************Peliculas*****************************");
        System.out.println("----------------------------------------------------------------");

        boolean peliculasEncontradas = false;
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula) {
                System.out.println((i + 1) + " - " + video[i].toString());
                peliculasEncontradas = true;
            }
        }

        if (!peliculasEncontradas) {
            System.out.println("No se encontro ninguna pelicula");
        } else {
            int peli = -1;
            while (true) {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Que peli queres actualizar?");
                System.out.println("----------------------------------------------------------------");
                if (entrada.hasNextInt()) {
                    peli = entrada.nextInt() - 1;
                    if (peli >= 0 && peli < cantActual && video[peli] instanceof Pelicula) {
                        break;
                    } else {
                        System.out.println("Indice de pelicula invalido. Intente nuevamente.");
                    }
                } else {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
            }

            int tiempoVisto;
            do {
                System.out.print("Ingrese la cantidad de minutos vistos de la pelicula (en minutos): ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
                tiempoVisto = entrada.nextInt();
                if (tiempoVisto < 0) {
                    System.out.println("El tiempo visto no puede ser negativo.");
                } else if (tiempoVisto > video[peli].getDuracion()) {
                    System.out.println("El tiempo visto no puede superar la duracion de la pelicula.");
                }

                video[peli].setTiempoVisto(tiempoVisto);
            } while (tiempoVisto < 0 || tiempoVisto > video[peli].getDuracion());
            video[peli].tiempoVisto();

            int calificacion;
            do {
                System.out.print("Ingrese la calificacion de la pelicula (1-10): ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
                calificacion = entrada.nextInt();
                video[peli].setCalificacion(calificacion);
            } while (calificacion < 1 || calificacion > 10);
            video[peli].ponerCalificacion();

            System.out.println(video[peli].toString() + " | Tiempo visto: " + tiempoVisto + " | Calificacion: " + calificacion);
        }
    }

    public static void actualizarSeries(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("*****************************Series*****************************");
        System.out.println("----------------------------------------------------------------");
        boolean seriesEncontradas = false;
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie && !(video[i] instanceof Capitulo)) {
                System.out.println((i + 1) + " - " + video[i].toString());
                seriesEncontradas = true;
            }
        }
        if (!seriesEncontradas) {
            System.out.println("No se encontro ninguna serie");
        } else {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Que serie queres actualizar?");
            System.out.println("----------------------------------------------------------------");

            int serie = -1;
            boolean validInput = false;
            while (!validInput) {
                if (entrada.hasNextInt()) {
                    serie = entrada.nextInt();
                    serie = (serie - 1);
                    if (serie >= 0 && serie < cantActual && video[serie] instanceof Serie) {
                        validInput = true;
                    } else {
                        System.out.println("Indice de serie invalido. Intente nuevamente.");
                    }
                } else {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
            }

            int calificacion;
            do {
                System.out.print("Ingrese la calificacion de la serie (1-10): ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
                calificacion = entrada.nextInt();
                video[serie].setCalificacion(calificacion);
            } while (calificacion < 1 || calificacion > 10);
            video[serie].ponerCalificacion();

            System.out.println(video[serie].toString() + " | Calificacion: " + calificacion);
        }
    }

    public static void actualizaCapitulos(Scanner entrada, Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("**************************Capitulos*****************************");
        System.out.println("----------------------------------------------------------------");
        boolean capitulosEncontrados = false;
        String tituloSerie = "";
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                if (video[i] instanceof Capitulo) {
                    Capitulo indexCap = (Capitulo) video[i];
                    tituloSerie = video[indexCap.getiSerie()].getTitulo();
                    System.out.println((i + 1) + " - " + "Serie : " + tituloSerie + " | " + video[i].toString());
                    System.out.println("");
                    capitulosEncontrados = true;
                }
            }
        }

        if (!capitulosEncontrados) {
            System.out.println("No se encontro ningun capitulo");
        } else {
            boolean validInput = false;
            int capituloIndex = -1;
            while (!validInput) {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Que capitulo queres actualizar?");
                System.out.println("----------------------------------------------------------------");
                if (entrada.hasNextInt()) {
                    capituloIndex = entrada.nextInt();
                    capituloIndex = (capituloIndex - 1);
                    if (capituloIndex >= 0 && capituloIndex < cantActual && video[capituloIndex] instanceof Capitulo) {
                        validInput = true;
                    } else {
                        System.out.println("Indice de capitulo invalido o el video seleccionado no es un capitulo. Intente nuevamente.");
                    }
                } else {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
            }

            int tiempoVisto;
            do {
                System.out.print("Ingrese la cantidad de minutos vistos del capitulo (en minutos): ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
                tiempoVisto = entrada.nextInt();
                if (tiempoVisto < 0) {
                    System.out.println("El tiempo visto no puede ser negativo.");
                } else if (tiempoVisto > video[capituloIndex].getDuracion()) {
                    System.out.println("El tiempo visto no puede superar la duracion de la pelicula.");
                }

                video[capituloIndex].setTiempoVisto(tiempoVisto);
            } while (tiempoVisto < 0 || tiempoVisto > video[capituloIndex].getDuracion());
            video[capituloIndex].tiempoVisto();

            int calificacion;
            do {
                System.out.print("Ingrese la calificacion del capitulo (1-10): ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, ingrese un numero valido: ");
                    entrada.next();
                }
                calificacion = entrada.nextInt();
            } while (calificacion < 1 || calificacion > 10);
            video[capituloIndex].ponerCalificacion();

            System.out.println("Serie : " + tituloSerie + " | " + video[capituloIndex].toString() + " | Tiempo visto: " + tiempoVisto + " | Calificacion: " + calificacion);
        }
    }

    public static void videosVistos(Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("PBA Blockbuster - Videos ya vistos");
        System.out.println("----------------------------------------------------------------");

        boolean peliculaVistaEncontrada = false;
        boolean serieVistaEncontrada = false;

        System.out.println("----------------------------------------------------------------");
        System.out.println("****************************Peliculas***************************");
        System.out.println("----------------------------------------------------------------");
        for (Video v : video) {
            if (v instanceof Pelicula) {
                if (v.visto && v.duracion == v.tiempoVisto) {
                    System.out.println(v.toString());
                    peliculaVistaEncontrada = true;
                }
            }
        }
        if (!peliculaVistaEncontrada) {
            System.out.println("No fueron encontradas peliculas vistas");
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("*****************************Series*****************************");
        System.out.println("----------------------------------------------------------------");
        String tituloSerie = "";

        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                if (video[i] instanceof Capitulo) {
                    Capitulo indexCap = (Capitulo) video[i];
                    tituloSerie = video[indexCap.getiSerie()].getTitulo();
                    if (indexCap.visto && indexCap.duracion == indexCap.tiempoVisto) {
                        System.out.println("Serie: " + tituloSerie + " | " + video[i].toString());
                        serieVistaEncontrada = true;
                    }
                }
            }
        }
        if (!serieVistaEncontrada) {
            System.out.println("No fueron encontradas series vistas");
        }

    }

    public static void videosPendientes(Video[] video, int cantActual) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("PBA Blockbuster - Videos pendientes");
        System.out.println("----------------------------------------------------------------");

        boolean peliculaPendiente = false;
        boolean seriePendiente = false;

        System.out.println("----------------------------------------------------------------");
        System.out.println("***************************Peliculas****************************");
        System.out.println("----------------------------------------------------------------");
        for (Video v : video) {
            if (v instanceof Pelicula) {
                if (v.tiempoVisto < v.duracion && v.visto) {

                    System.out.println(v.toString() + " | Tiempo visto: " + v.minutosEnHoras(v.tiempoVisto));
                    peliculaPendiente = true;
                }
            }
        }
        if (!peliculaPendiente) {
            System.out.println("No fueron encontradas peliculas pendientes");
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("******************************Series****************************");
        System.out.println("----------------------------------------------------------------");

        String tituloSerie = "";

        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie) {
                if (video[i] instanceof Capitulo) {
                    Capitulo indexCap = (Capitulo) video[i];
                    tituloSerie = video[indexCap.getiSerie()].getTitulo();
                    if (indexCap.tiempoVisto < indexCap.getDuracion() && indexCap.visto) {
                        System.out.println("Serie: " + tituloSerie + " | " + video[i].toString() + " | Tiempo visto: " + indexCap.tiempoVisto + "min");
                        seriePendiente = true;
                    }
                }
            }
        }
        if (!seriePendiente) {
            System.out.println("No fueron encontradas series pendientes");
        }

    }

    public static void videosFavoritos(Video[] video, int cantActual) {

        System.out.println("----------------------------------------------------------------");
        System.out.println("Tus peliculas y series favoritas ordenadas por su calificacion");
        System.out.println("----------------------------------------------------------------");
        boolean peliculaCalificada = false;
        boolean serieCalificada = false;

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
        System.out.println("***********************Peliculas Favoritas**********************");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Pelicula && video[i].getCalificacion() > 7) {
                System.out.println(video[i].getTitulo() + " - Calificacion: " + video[i].getCalificacion());
                peliculaCalificada = true;
            }
        }
        if (!peliculaCalificada) {
            System.out.println("Todavia no tenes peliculas favoritas");
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("************************Series Favoritas************************");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < cantActual; i++) {
            if (video[i] instanceof Serie && video[i].getCalificacion() > 7) {
                System.out.println(video[i].getTitulo() + " - Calificacion: " + video[i].getCalificacion());
                serieCalificada = true;
            }
        }
        if (!serieCalificada) {
            System.out.println("Todavia no tenes series favoritas");
        }

    }

    private static void serieConMasCapitulos(Video[] video) {

        Serie serieConMasCapitulos = null;

        for (Video v : video) {
            if (v instanceof Serie) {
                Serie serieActual = (Serie) v;
                if (serieConMasCapitulos == null || serieActual.compareCap(serieConMasCapitulos) > 0) {
                    serieConMasCapitulos = serieActual;
                }
            }
        }

        if (serieConMasCapitulos != null) {
            System.out.println("La serie con mas capitulos es: " + serieConMasCapitulos.getTitulo() + " | " + "Temporadas: " + serieConMasCapitulos.getTemporadas() + " | " + "Capitulos: " + serieConMasCapitulos.getCapTemp());
        } else {
            System.out.println("No se encontro ninguna serie.");
        }

    }

    private static void peliculaMasCorta(Video[] video) {
        Pelicula peliMenorDuracion = null;

        for (Video v : video) {
            if (v instanceof Pelicula) {
                Pelicula peliActual = (Pelicula) v;
                if (peliMenorDuracion == null || peliActual.compareDuracion(peliMenorDuracion) < 0) {
                    peliMenorDuracion = peliActual;
                }
            }
        }

        if (peliMenorDuracion != null) {
            System.out.println("La pelicula con menor duracion es: " + peliMenorDuracion.getTitulo() + ", con una duracion de " + peliMenorDuracion.getDuracion() + " minutos");
        } else {
            System.out.println("No se encontro ninguna pelicula.");
        }
    }
}
