/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class Ejercicios {

    public static void main(String[] args) {
        //Ejercicio1
        System.out.println(ejercicio1());

        //Ejercicio2
        try {
            ejercicio2();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Ejercicio3
        int edadErronea = -5;
        ejercicio3(edadErronea);

    }

    public static String ejercicio1() {
        System.out.println("Ej.1: División por 0");
        int num1 = 2;
        int cero = 0;
        try {
            return "" + num1 / cero;
        } catch (Exception e) {
            return "Error: división por cero";
        }
    }

    public static void ejercicio2() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[array.length]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void ejercicio3(int edad) {
        System.out.println("Solicitando edad...");
        if (edad < 0) {
            try {
                throw new EdadInvalidaException("Error. La edad debe ser > 0");
            } catch (EdadInvalidaException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Edad correcta" + edad);
    }
}

class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String error_La_edad_debe_ser__0) {
    }

    //Ejercicio 9
    public static char caracterEn(String cadena, int pos) throws Exception {
        if (pos >= 0 && pos < cadena.length()) {
            return cadena.charAt(pos);
        } else {
            throw new Exception("Posición inválida");
        }
    }

}

/*
10.Construye un programa “main” en Java que realice las siguientes acciones:

-Crea un objeto de la clase “Scanner” y lo asocia con la entrada estándar 
-Lee un objeto de tipo “String” de la misma en un objeto “lect_teclado”;
-Invoca al método “caracterEn” definido en el ejercicio anterior, con la “String” leída  de la entrada estándar y el entero “7”, mostrándolo por pantalla;
-Captura la posible excepción, mostrando por pantalla un mensaje:
“Has intentado recuperar una posición de la cadena de caracteres que no existe;”.

11.Define una clase “NumeroNegativoExcepcion” que herede de “Exception” y que contenga un constructor sin parámetros y un constructor que reciba 
como parámetro una “String”, de tal modo que ambos invoquen a los constructores de la clase “Exception” correspondientes.

12.¿Cuál es la peculiaridad de las excepciones del tipo “RuntimeException” (o de las subclases de la misma)?

13.¿Qué información nos aporta el método “printStackTrace (): void” sobre una excepción?

*/

//11
class NumeroNegativoExcepcion extends Exception{

    public NumeroNegativoExcepcion(String message) {
        super("Número no debe ser negativo");
    }
    
}