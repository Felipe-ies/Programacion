/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.controlymanejoexcepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class CheckedException {
    public static void main(String[] args){
        try {
            Scanner teclado = new Scanner(new File("fichero.txt"));
        } catch (FileNotFoundException ex) {
            int numero = 0;
            System.err.println("Error. Se captura la excepción y se inicializa entrada = 0");
        }
    

    }
}
