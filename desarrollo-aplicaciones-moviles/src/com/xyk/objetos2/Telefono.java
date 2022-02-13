
package com.xyk.objetos2;

public class Telefono {    
    
    private int id;
    private String marca;
    private String modelo;
    private double precio;
    
    // Por valor
    public Telefono() {
        this.id = 5;
        this.marca = "Motorola";
        this.modelo = "G";
        this.precio = 2500.00;
    }
    
    // Atributos mínimos para que existe un objeto tipo Telefono
    // Por referencia o por paso por parámetro o argumento
    public Telefono(int id, String marca, String modelo, double precio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 1000) {
            this.precio = precio;
        }else {
            //System.out.println("\nEl ingresado no es válido.\nEl precio se mantinene igual.");
            this.precio = 1199;
        }
        
    }     
    
    public void mostrarDatos() {
        System.out.println("Datos Teléfono");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }
  
}
