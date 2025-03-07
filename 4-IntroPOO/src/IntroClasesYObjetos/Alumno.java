/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroClasesYObjetos;

/**
 *
 * @author dam
 */
public class Alumno {
    
    //Datos o atributos
    String codAlumno;
    String nombre;
    String apellidos;
    String ciclo;
    
    //Metodos o funciones
    void imprimirInfo(){
        System.out.println(codAlumno + " " + nombre + " " + apellidos + " " 
             + ciclo);
    }    
}
