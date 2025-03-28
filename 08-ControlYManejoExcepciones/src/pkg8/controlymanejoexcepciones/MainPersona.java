/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.controlymanejoexcepciones;

/**
 *
 * @author dam
 */
public class MainPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Jhon", "Calle", 20);
        try {
            p1.setEdad(220);
        } catch (Exception e) {
            System.err.println(e);
            p1.setEdad(20);
        }

    }
}
