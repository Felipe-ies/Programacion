/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioProductos;

/**
 *
 * @author dam
 */
public class MainProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Productos prod1 = new Productos();
        
        prod1.Producto(1, "mi descr", 32);

        System.out.println(prod1.getPrecio());
        System.out.println(prod1.precioConIva());      
    }
}
