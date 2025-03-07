/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author dam
 */
public class MainPersona {
    public static void main(String [] args){
        //TODO code aplication logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce la edad");
        int edad = teclado.nextInt();
                
        teclado.nextLine();
        System.out.println("Introduce el DNI");
        String dni = teclado.nextLine();
        
        System.out.println("Introduce el sexo (H-Hombre, M-Mujer)");
        char sexo = teclado.nextLine().charAt(0);
        
        System.out.println("Introduce el peso en Kg");
        double peso = teclado.nextDouble();
        
        System.out.println("Introduce la altura en cm");
        double altura = teclado.nextDouble();
        
        Persona evelyn = new Persona(nombre, edad, dni, sexo, peso, altura);
        
        Persona felipe = new Persona(nombre, edad, dni, sexo);
        
        Persona ivan = new Persona();
        
        ivan.setEdad(28);
        ivan.setPeso(70);
        
        int imc = ivan.calcularIMC();
        System.out.println(imc);
        
        System.out.println(felipe);
        
    }
    
}
