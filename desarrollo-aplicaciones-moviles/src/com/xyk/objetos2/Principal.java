 
package com.xyk.objetos2;

public class Principal {
    
    public static void main(String[] args) {
        
        // Telefono miTelefono = new Telefono();
        // miTelefono.mostrarDatos();        
        
        Telefono tuTelefono = new Telefono(1, "Nexus", "4", 4000.00);
        tuTelefono.mostrarDatos();
        tuTelefono.setPrecio(759.99);
        // System.out.println("\nModificar precio del teléfono a: $" + tuTelefono.getPrecio());
        System.out.println();
        tuTelefono.mostrarDatos();
        
    }
    
}
