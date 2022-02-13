
package com.xyk.netflixlist;

public class Serie extends Catalogo {

    private int noTemporadas = 1;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, String duracion, int noTemporadas) {
        super(titulo, genero, creador, duracion);
        this.noTemporadas = noTemporadas;
        
    }

    public int getnoTemporadas() {
        return noTemporadas;
    }

    public void setnoTemporadas(int noTemporadas) {
        this.noTemporadas = noTemporadas;
    }

    @Override
    public String toString() {
        return super.toString() + ",\n noTemporadas= " + noTemporadas + "\n";
    }
    
    
    
    
}
