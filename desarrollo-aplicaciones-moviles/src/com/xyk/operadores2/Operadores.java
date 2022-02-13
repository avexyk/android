
package com.xyk.operadores2;

public class Operadores {
    
    public static void main(String[] args) {
        
        // Diferencia entre incremento prefijo y postfijo
        int x = 6, y;
        y = ++x;
        
        // La operación incremento se asigna primero a “y” y el resultado se asigna finalmente a “x”
        System.out.println("El valor de y es: " + y + "\nEl valor de x es: " + x);
        
        int a = 6, b;
        b = a++;
        
        // La operación asignación sucede primero y se asigna el valor inicial de a a b
        System.out.println("El valor de y es: " + b + "\nEl valor de x es: " + a);
        
        int i = 2;
        i++;
        // En el operador incremento importa mucho el orden de las operaciones, tanto al incrementar como al asignar.
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

    }
    
}
