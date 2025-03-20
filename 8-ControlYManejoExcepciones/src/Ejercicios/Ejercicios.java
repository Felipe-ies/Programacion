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
}
