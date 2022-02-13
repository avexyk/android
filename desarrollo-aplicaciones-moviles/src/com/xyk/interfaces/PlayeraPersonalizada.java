
package com.xyk.interfaces;

public class PlayeraPersonalizada extends Ropa {
    
    private String logo;
    
    public PlayeraPersonalizada(int id, double precio, String talla, String color, String logo) {
        super(id, precio, talla, color);
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }    

    @Override
    public void mostrarDatos(String nombreClase) {
        super.mostrarDatos(nombreClase);
        System.out.println("Logo: " + logo);
    }    
    
}
