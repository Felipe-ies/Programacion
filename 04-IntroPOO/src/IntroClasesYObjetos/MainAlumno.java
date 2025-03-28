/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IntroClasesYObjetos;

/**
 *
 * @author dam
 */
public class MainAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno felipe = new Alumno();
        
        
        felipe.nombre = "Felipe";
        felipe.apellidos = "Cagna";
        felipe.ciclo = "DAM";
        felipe.codAlumno = "cod123";
        
        
        felipe.imprimirInfo();
    }
}
