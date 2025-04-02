/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg9.lecturayescriturainformación;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dam
 */
public class Serializacion {

    public static void main(String[] args) {
        //Escribir objeto
        try {
            Persona p = new Persona("Elba", "Nanero");
            FileOutputStream fos;
            fos = new FileOutputStream("persona.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Leer objeto
        try {
            FileInputStream fis = new FileInputStream("persona.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona pe = (Persona) ois.readObject();
            System.out.println(pe);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LecturaYEscrituraInformación.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Persona implements Serializable {

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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
