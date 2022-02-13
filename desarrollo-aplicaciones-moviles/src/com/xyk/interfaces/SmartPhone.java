
package com.xyk.interfaces;

public class SmartPhone extends Telefono implements IDevolucion {
    
    private String SIM;
    
    public SmartPhone(int id, double precio, String marca, String modelo, String SIM) {
        super(id, precio, marca, modelo);
        this.SIM = SIM;
    }

    public String getSIM() {
        return SIM;
    }

    public void setSIM(String SIM) {
        this.SIM = SIM;
    }

    @Override
    public void hacerDevolucion() {
        System.out.println("Devolución de un smartphone");
    }
    
}
