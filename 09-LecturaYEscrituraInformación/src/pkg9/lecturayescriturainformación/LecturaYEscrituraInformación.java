/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg9.lecturayescriturainformación;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        Persona p = new Persona("Elba", "Nanero");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream("persona.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileInputStream fis = new FileInputStream("persona.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p = (Persona) ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static void escribir() {
        File fichero = new File("salida.txt");
        try {
            PrintStream ps = new PrintStream(fichero);
            ps.println("Hola bebe");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void escribir2() {
        try {
            FileWriter fw = new FileWriter("salida.txt");
            fw.write("Hola bebe, ya que contigo no sirve la labia");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Serialización
}

class Persona {

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
