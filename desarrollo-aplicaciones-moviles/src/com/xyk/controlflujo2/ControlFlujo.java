
package com.xyk.controlflujo2;

public class ControlFlujo {
    
    public static void main(String[] args) {
        
        // while
        int a = 5;
        
        while(a <= 5) {
            System.out.println("a: " + a);
            a++; //Incremento de a
        }
        
        //for
        for(int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
        
        // array unidimensional
        int[] miArreglo = new int[5];
        
        // length automáticamente cuenta cuantos elementos tiene
        for(int j = 0; j < 5; j++) {
            miArreglo[j] = j*5;
            System.out.println("miArreglo["+j+"]" + miArreglo[j]);
        }
        
        // for each por cada
        for (int i:miArreglo) {
            System.out.println(i);
        }
        
    }
    
}
