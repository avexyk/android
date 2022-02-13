
package com.xyk.operadores1;

public class Operadores {
    
    public static void main(String[] args) {
        
        int a = 2, b = 5, c = 0;
        
        //Suma
        c = a + b;
        System.out.println("Resultado de la suma: " + c);
        
        //Resta
        c = a - b;
        System.out.println("Resultado de la resta: " + c);
        
        //Multiplicacion
        c = a * b;
        System.out.println("Resultado de la multiplicación: " + c);
        
        //Division
        c = b / a;
        System.out.println("Resultado de la división: " + c);
        
        //Residuo
        c = b % a;
        System.out.println("Residuo de la división: " + c);
        
        //Operaciones de Asignacion con operacion        
        c = 2;

        c += a;
        System.out.println("c += a -> " + c);
        
        c *= a;
        System.out.println("c *= a -> " + c);
        
        c -= a;
        System.out.println("c -= a -> " + c);
        
        c /= a;
        System.out.println("c /= a -> " + c);
        
        c %= a;
        System.out.println("c %= a -> " + c);
        
        // Operador Incremento Prefijo y Postfijo
        // Operador Decremento Prefijo y Postfijo
        
        int i = 3;
        ++i;
        
        System.out.println(i);
        
        i++;
        
        System.out.println(i);
        
        --i;
        
        System.out.println(i);
        
        i--;
        
        System.out.println("Prefijo " + i);
        
        System.out.println("Impresion Prefijo: " + (++i));
        System.out.println("Impresion Postfijo: " + (i++));
        System.out.println("i: " + i);
        
        // Operador de Equidad == !=
        a = 5;
        b = 4;                
        System.out.println(a == b);
        System.out.println(a != b);
        a = 6;
        b = 6;
        System.out.println(a == b);
        System.out.println(a != b);
        
        // Operadores Relacionales <> <= =>
        
        System.out.println("a < b ->" + (a < b)); //false
        System.out.println("a > b ->" + (a > b)); //true
        
        System.out.println("a >= b ->" + (a >= b)); //true
        System.out.println("a <= b ->" + (a <= b)); //true
        
        // Operadores lógicos
        
        boolean j = true;
        boolean k = false;
        
        // AND &&
        System.out.println("j && k -> " + (j && k));
        
        boolean l = true;
        boolean m = true;
        
        System.out.println("l && m -> " + (l && m));
        
        // OR ||
        boolean n = true;
        boolean o = false;
        
        System.out.println("n || o -> " + (n || o));
        
        boolean p = true;
        boolean q = true;
        
        System.out.println("p || q -> " + (p || q));
        
        // NOT !
        boolean r = true;
        
        System.out.println("!r ->" + (!r));
        
        boolean s = false;
        
        System.out.println("!s ->" + (!s));
        
    }
    
}
