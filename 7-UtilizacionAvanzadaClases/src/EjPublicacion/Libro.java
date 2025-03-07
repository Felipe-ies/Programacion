/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjPublicacion;

/**
 *
 * @author Felipe
 */
public class Libro extends Publicacion implements Prestable{
    private boolean prestado;
    
    public Libro(int codigo, String titulo, int annoPublicacion){
        super(codigo,titulo,annoPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "***LIBRO*** " + super.toString() + ", Prestado=" + prestado;
    }
    
    @Override
    public void prestar() {
        prestado = true;
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
    
    
}
