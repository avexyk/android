
package com.xyk.arreglos;

public class Arreglo {
    
    public static void main(String[] args) {
        
        int[] nuevoArreglo = new int[5];
        nuevoArreglo[2] = 5;
        
        System.out.println(nuevoArreglo[2]);
        
        double[][] nuevoArreglo2D = new double[2][2]; //matriz i j
        // i --> renglon
        // j --> columna
        nuevoArreglo2D[0][0] = 3;
        nuevoArreglo2D[0][1] = 7;
        nuevoArreglo2D[1][0] = 3;
        nuevoArreglo2D[1][1] = 4;
        
        System.out.println(nuevoArreglo2D[1][1]);
        
        for(double[] i:nuevoArreglo2D) {
            System.out.println();
            for(double j:i) {
                System.out.print(j + " ");
            }
        }
        
        char[][][] arregloChar = new char[1][1][1];
        arregloChar[0][0][0] = 'a';
        
    }
    
}
