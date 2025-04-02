/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.lecturayescriturainformación;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;



/**
 *
 * @author dam
 */
public class LecturaYEscrituraInformación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    static void escribir() {
        File fichero = new File("salida.txt");
        try {
            PrintStream ps = new PrintStream(fichero);
            ps.println("Hola bebe");
        } catch (FileNotFoundException ex) {
            System.err.print(ex);
        }
    }

    static void escribir2() {
        try {
            FileWriter fw = new FileWriter("salida.txt");
            fw.write("Hola bebe, ya que contigo no sirve la labia");
            fw.close();
        } catch (IOException ex) {
            System.err.print(ex);
        }

    }

    static void leer() {
        try {
            FileReader fr = new FileReader("ejemplo.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.err.print(ex);
        } catch (IOException ex) {
            System.err.print(ex);
        }
    }
}
