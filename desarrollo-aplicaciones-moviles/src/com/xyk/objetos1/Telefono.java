
package com.xyk.objetos1;

public class Telefono {
    
    String id, marca, modelo;
    int precio;
    
    public Telefono() {
        id = "72A21F";
        marca = "Motorola";
        modelo = "G";
        precio = 2500;
    }
    
    public void mostrarDatos(){
        System.out.println("Datos del teléfono");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }
    
}
