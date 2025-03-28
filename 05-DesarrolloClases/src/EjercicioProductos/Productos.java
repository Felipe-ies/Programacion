/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioProductos;

/**
 *
 * @author dam
 */
public class Productos {

    private int id;
    private String descripcion;
    private double precio;
    private double iva = 0.21;

    public void Producto() {
        this.id = 1;
        this.descripcion = "";
        this.precio = 13;
    }

    public void Producto(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //Getters
    public int getId() {
        return this.id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public double getIva() {
        return this.iva;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //Metodos
    public double precioConIva() {
        return precio + (precio * iva);
    }

}
