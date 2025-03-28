/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroClasesYObjetos;

/**
 *
 * @author dam
 */
public class MainCoche {
    public static void main(String [] args){
        Coche seat = new Coche();
        
        seat.modelo = "LEON";
        seat.matricula = "LAS123";
        seat.color = "ROJO";
        
        
        seat.imprimirDatosCoche();
    }
}
