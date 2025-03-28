/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioRectangulo;

/**
 *
 * @author Felipe
 */
public class Rectangulo {

    private int base;
    private int altura;
    private boolean esCuadrado;

    public Rectangulo(int base, int altura) {
        this.base = (base > 0)? base: 2 ;
        this.altura = (altura > 0)? altura: 1;
        this.esCuadrado = base == altura;
    }
    public Rectangulo(int base){
        this.esCuadrado = true;
        this.base = (base > 0)? base: 1;
        this.altura = base;
    }
    
    public int getBase(){
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }
    public boolean getEsCuadrado(){
        return this.esCuadrado;
    }
    
    public void setBase(int base){
        this.base = (base > 0)? base: 1;
        esCuadrado = base == altura;
    }
    public void setAltura(int altura){
        this.altura = (altura > 0)? altura: 1;
        esCuadrado = base == altura;
    }
    
    @Override
    public String toString(){
        String rectangulo = "Un rectángulo de base " + this.base + 
                " y altura " + this.altura;
        String cuadrado = "Un cuadrado de lado " + this.base;        
        return esCuadrado? cuadrado: rectangulo;
    }
    
    public boolean compare(Rectangulo rect2){
        //Compara si dos rectangulos son iguales
        boolean igual = false;
        if(this.base == rect2.getBase()){
            igual = this.altura == rect2.getAltura();
        }else if(this.base == rect2.getAltura()){
            igual = this.altura == rect2.getBase();
        }
        return igual;
    }
    
    public int perimetro(){
        return (2*(this.base + this.altura));
    }
    
    public int area(){
        return (this.base*this.altura);
    }
    
    public int ladoMayor(){
        int ladoM;
        if(this.base >= this.altura){
            ladoM = this.base;
        }else{
            ladoM = this.altura;
        }
        return ladoM;
    }
    
    public boolean convertirEnCuadrado(){
        boolean baseCambia = false;
        this.esCuadrado = true;
        if(this.base > this.altura){
            this.altura = this.base;
        }else if(this.base < this.altura){
            this.base = this.altura;
            baseCambia = true;
        }
        return baseCambia;
    }
}
