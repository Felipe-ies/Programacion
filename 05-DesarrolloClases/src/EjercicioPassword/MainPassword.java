/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPassword;

/**
 *
 * @author Felipe
 */
public class MainPassword {

    public static void main(String[] args) {
        Password ps = new Password("aaa0CCCCCCC");
        String res = ps.esValida();
        System.out.println(res);
    }

}
