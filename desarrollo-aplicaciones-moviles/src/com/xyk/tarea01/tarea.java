
package com.xyk.tarea01;

public class tarea {
    
    public static void main(String[] args) {
        
        int[][] miArreglo = new int[4][4];
        int g = 0;
        
        for(int i = 0; i < 4; i ++) {
            for(int j = 0; j < 4; j ++) {
                int h = (j+1)*2 + g;
                miArreglo[i][j] = h;
            }
            g += 8;
        }                
        
        for(int[] a:miArreglo) {
            System.out.println();
            for(int b:a) {
                System.out.print(b + " ");
            }
        }     
        
        System.out.println("");
    }
    
}
