
package com.xyk.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Principal {
    
    public static void main(String[] args) {
         
        ArrayList<String> androids = new ArrayList<>();
        androids.add("Cupcake");
        androids.add("Donut");
        androids.add("Eclair");
        androids.add("Froyo");
        androids.add("Gingerbread");
        androids.add("Honeycomb");

        
        System.out.println("Tamaño del Arraylist: " + androids.size());
        System.out.println("androids: " + androids);
        
        // Eliminar elementos del ArrayList        
        androids.remove(2);
        
        System.out.println("Tamaño del ArrayList: " + androids.size());
        System.out.println("androids: " + androids);
        
        Vector<String> androids2 = new Vector<>();        
        androids2.addElement("Ice Cream Sandwich");
        androids2.addElement("Jelly Bean");
        androids2.addElement("KitKat");
        androids2.addElement("Lollipop");
        androids2.addElement("Marshmallow");
        androids2.addElement("Nougat");
        androids2.addElement("Android O");
        
        System.out.println("Tamaño del Vector: " + androids2.size());
        System.out.println("androids2: " + androids2);
        
        androids2.remove(1);
        
        System.out.println("Tamaños del Vector: " + androids2.size());
        System.out.println("androids2: " + androids2);
        
    }
    
}
