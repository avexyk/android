
package com.xyk.netflix;

public class Principal {
    
    public static void main(String[] args) {
        
        Pelicula peliculas[] = new Pelicula[5];
        peliculas[0] = new Pelicula("Sueños de Fuga", "Drama", "Frank Darabont", "02h:22m", 1994);
        peliculas[0].marcarVisto("00h:59m");
        peliculas[1] = new Pelicula("El Padrino", "Francis Ford Coppola");
        peliculas[2] = new Pelicula("Batman: El Caballero de la Noche", "Christopher Nolan");
        peliculas[3] = new Pelicula("La lista de Schindler", "Steven Spielberg");
        peliculas[4] = new Pelicula("El señor de los anillos: El retorno del rey", "Action", "Peter Jackson", "03h:21m", 2003);
        peliculas[4].marcarVisto("01h:50m");
        
        Serie series[] = new Serie[5];
        series[0] = new Serie("Planet Earth II", "Documentary", "David Attenborough", "04h:58m", 5);
        series[0].marcarVisto("02h:40m");
        series[1] = new Serie("Breaking Bad", "Vince Gilligan");
        series[2] = new Serie("Chernobyl", "Craig Mazin");
        series[3] = new Serie("Cosmos", "Neil deGrasse Tyson");
        series[4] = new Serie("Avatar: la leyenda de Aang", "Animation", " Michael Dante DiMartino", "00h:23m", 3);
        series[4].marcarVisto("00h:20m");
        
        System.out.println("/ ***** CATÁLOGO DE SERIES Y PELÍCULAS ***** /\n");
        
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
        
        for (Serie s : series) {
            System.out.println(s);
        }
        
        System.out.println("/ ***** PELÍCULAS Y SERIES VISUALIZADAS ***** /\n");
        
        for (Pelicula p : peliculas) {
            if (p.esVisto()) {
                System.out.println(p);
            }
        }
        
        for (Serie s : series) {
            if (s.esVisto()) {
                System.out.println(s);
            }
        }
        
        System.out.println("/ ***** SERIE CON MÁS TEMPORADAS ***** /\n");
        int t = 0;
        Object serieMas = null;
        
        for (Serie s : series) {
            if (s.getnoTemporadas() > t) {
                t = s.getnoTemporadas();
                serieMas = s;
            }
        }
        System.out.println(serieMas);
        
        System.out.println("/ ***** PELÍCULA DEL AÑO MÁS RECIENTE ***** /\n");
        int a = 0;
        Object peliculaMas = null;
        
        for (Pelicula p : peliculas) {
            if (p.getAnio() > a) {
                a = p.getAnio();
                peliculaMas = p;
            }
        }
        System.out.println(peliculaMas);
        
    }
    
}




