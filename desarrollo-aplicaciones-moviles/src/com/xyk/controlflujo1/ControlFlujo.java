
package com.xyk.controlflujo1;

public class ControlFlujo {
    
    public static void main(String[] args) {
        //if else
        //Obtener el número mayor
        int a = 5;
        int b = 5;
        
        if(a > b) {
            System.out.println("El número mayor es a");
        }
        else if(b > a){
            System.out.println("El número mayor es b");
        }
        else if (a == b) {
            System.out.println("Los números a y b son iguales");
        }
        
        //switch
        
        int c = 10;
        
        switch(c) {
            case 1:
                System.out.println("");
            break;
            
            case 2:
                System.out.println("");            
            break;
            
            case 3:
                System.out.println("");
            break;
            
            case 4:
                System.out.println("");
            break;
            
            case 5:
                System.out.println("");
            break;
            
            default:
                System.out.println("Desconocido");
            break;
        }
        
    }
    
}
