
package com.xyk.objetos1;

// Importando clases static

import static com.xyk.objetos1.Calculadora.*;
import static java.lang.Math.*;

public class Principal {
    
    public static void main(String[] args) {
        
        Telefono miTelefono = new Telefono();
        miTelefono.mostrarDatos();
        
        System.out.println("a + b = " + suma(8, 9));
        System.out.println("El valor de BIP es: " + BIP);
        System.out.println("El valor de PI es: " + PI);
        
    }
    
}
