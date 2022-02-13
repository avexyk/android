
package com.xyk.netflixlist;

import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Sueños de Fuga", "Drama", "Frank Darabont", "02h:22m", 1994));
        peliculas.get(0).marcarVisto("00h:59m");
        peliculas.add(new Pelicula("El Padrino", "Francis Ford Coppola"));
        peliculas.add(new Pelicula("Batman: El Caballero de la Noche", "Christopher Nolan"));
        peliculas.add(new Pelicula("La lista de Schindler", "Steven Spielberg"));
        peliculas.add(new Pelicula("El señor de los anillos: El retorno del rey", "Action", "Peter Jackson", "03h:21m", 2003));
        peliculas.get(4).marcarVisto("01h:50m");
        
        ArrayList<Serie> series = new ArrayList<>();
        series.add(new Serie("Planet Earth II", "Documentary", "David Attenborough", "04h:58m", 5));
        series.get(0).marcarVisto("02h:40m");
        series.add(new Serie("Breaking Bad", "Vince Gilligan"));
        series.add(new Serie("Chernobyl", "Craig Mazin"));
        series.add(new Serie("Cosmos", "Neil deGrasse Tyson"));
        series.add(new Serie("Avatar: la leyenda de Aang", "Animation", " Michael Dante DiMartino", "00h:23m", 3));
        series.get(4).marcarVisto("00h:20m");
        
        
        System.out.println("/ ***** CATÁLOGO DE SERIES Y PELÍCULAS ***** /\n");
        
        try {
            for (int i = 0; i < peliculas.size(); i++) {
            System.out.println(peliculas.get(i));
        }
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" !! Se ha solicitado una o más peliculas que no existen!!\n");
        }
        
        System.out.println("/==================================================/\n");
        
        try {
            for (int i = 0; i < series.size(); i++) {
            System.out.println(series.get(i));
        }
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" !! Se ha solicitado una o más series que no existen!!\n");
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




