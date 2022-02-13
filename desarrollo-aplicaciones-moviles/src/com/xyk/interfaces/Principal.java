
package com.xyk.interfaces;

public class Principal {
    
    public static void main(String[] args) {
        
        Playera playera = new Playera(10, 99.95, "Mediana", "Blanco", "Polo");
        PlayeraPersonalizada playeraPersonalizada = new PlayeraPersonalizada(40, 199.95, "Grande", "Rojo", "Debian 9");
        Jeans jeans  = new Jeans(20, 399.99, "34", "Azul", "Nulo", 'H');
        Calcetin calcetin = new Calcetin(30, 29.98, "Mediana", "Negro");     
        
        playera.mostrarDatos("Playera Polo");
        playeraPersonalizada.mostrarDatos("Playera Debian 9");
        jeans.mostrarDatos("Jeans Naútica");
        calcetin.mostrarDatos("Calcetin Wilson");
        
        playera.hacerDevolucion();
        jeans.hacerDevolucion();
        calcetin.hacerDevolucion();
        
        SmartPhone smartPhone = new SmartPhone(90, 3999.99, "Motorola", "X", "Telcel");
        smartPhone.hacerDevolucion();
        
    }
    
}
