
package com.xyk.herenciapolimorfismo;

public class Principal {
    
    public static void main(String[] args) {
        
        Playera playera = new Playera(10, 99.95, "Mediana", "Blanco", "Polo");
        Jeans jeans  = new Jeans(20, 399.99, "34", "Azul", "Vintage", 'H');
        Calcetin calcetin = new Calcetin(30, 29.98, "Mediana", "Negro");       
        
        playera.mostrarDatos("Playera Polo");
        jeans.mostrarDatos("Jeans Naútica");
        calcetin.mostrarDatos("Calcetin Wilson");
        
    }
    
}
