/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjPublicacion;

/**
 *
 * @author Felipe
 */
public abstract class Publicacion {
    private int codigo;
    private String titulo;
    private int annoPublicacion;
    
    public Publicacion(int codigo, String titulo, int annoPublicacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) {
        this.annoPublicacion = annoPublicacion;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo +
                ", annoPublicacion=" + annoPublicacion + '}';
    }
}
