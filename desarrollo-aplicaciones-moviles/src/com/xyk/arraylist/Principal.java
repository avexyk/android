// ArrayList trabaja solo con objetos y va incrementándose dinámicamente

package com.xyk.arraylist;

// De aquí proviene ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
         
        ArrayList<String> androids = new ArrayList<>();
        androids.add("Cupcake");
        androids.add("Donut");
        androids.add("Eclair");
        androids.add("Froyo");
        androids.add("Gingerbread");
        androids.add("Honeycomb");
        androids.add("Ice Cream Sandwich");
        androids.add("Jelly Bean");
        androids.add("KitKat");
        androids.add("Lollipop");
        androids.add("Marshmallow");
        androids.add("Nougat");
        androids.add("Android O");
        
        System.out.println("Tamaño del Arraylist: " + androids.size());
        System.out.println("androids: " + androids);
        
        // Eliminar elementos del ArrayList        
        androids.remove(2);
        
        System.out.println("Tamaño del ArrayList: " + androids.size());
        System.out.println("androids: " + androids);
    }
    
}
