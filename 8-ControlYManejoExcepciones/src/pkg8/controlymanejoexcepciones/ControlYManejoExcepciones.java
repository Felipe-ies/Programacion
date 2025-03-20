/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.controlymanejoexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class ControlYManejoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        UNCHECKED EXCEPTION
        */
        
        Scanner teclado = new Scanner(System.in);
        int entrada;
        try {
            entrada = teclado.nextInt();
        }catch (Exception e){
            entrada = 0;
            System.err.println(e);
        }
    }    
}
