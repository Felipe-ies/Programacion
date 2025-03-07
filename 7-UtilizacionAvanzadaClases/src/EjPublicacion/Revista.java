/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjPublicacion;

/**
 *
 * @author Felipe
 */
public class Revista extends Publicacion{
    private int numero;
    
    public Revista(int codigo, String titulo, int numero, int annoPublicacion) {
        super(codigo, titulo, annoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "***REVISTA*** " + super.toString() + ", Numero=" + numero;
    }
}
