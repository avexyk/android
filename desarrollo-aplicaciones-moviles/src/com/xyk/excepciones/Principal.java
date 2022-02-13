// La idea es evitar que el programa se interrumpa
package com.xyk.excepciones;

public class Principal {
    
    public static void main(String[] args) {
        
        try {
            int[] numeros = {5,2,8};
            
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
            System.out.println(numeros[3]);
        // En exception se coloca el error que sale en consola
        // Al haber error entra al catch
        } catch (ArrayIndexOutOfBoundsException arrayE) {
            System.out.println("Esta intentando entrar a un índice no definido");

        } catch (Exception e) {
            System.out.println("Ocurrio este error");
            // Imprime todas las clases donde estubo saltando cuando ocurrio este tipo de error
            // Imprimir para el usuario la siguiente instruccion no es algo práctico ni conveniente
            // La siguiente línea funciona más para los programadores
            e.printStackTrace();
        }
        // Luego de pasar por el catch entra al finally
        // No importa si no hay error siempre pasará por el finally si es que esta 
        finally {
            System.out.println(":P");
        }
        
    }
    
}
