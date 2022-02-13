
package com.xyk.netflixlist;

public class Catalogo implements Visualizable {
    
    private String titulo;
    private String genero;
    private String creador;
    private String duracion;
    private boolean visto;
    
    private String tiempoVisto = "00h:00m";

    public Catalogo() {
        
    }

    public Catalogo(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "No definido";
        this.duracion = "No definido";
        this.visto = false;
    }

    public Catalogo(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return " titulo= " + titulo + ", \n genero= " + genero + ", \n creador= " + creador + ", \n duracion= " + duracion + ", \n visto= " + visto + ", \n tiempo visto= " + tiempoVisto;
    }

    @Override
    public String marcarVisto(String tiempoVisto) {
        this.visto = true;
        this.tiempoVisto = tiempoVisto;
        return "";
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public String tiempoVisto() {
        return this.tiempoVisto;
    }

    
    

}
