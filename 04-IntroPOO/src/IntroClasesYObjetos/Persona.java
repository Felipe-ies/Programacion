/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroClasesYObjetos;

/**
 *
 * @author dam
 */
public class Persona {

    //Atributos
    //Deben ser privados salvo excepciones
    //Solo se pueden ver dentro de la clase
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    //Constructores. Son métodos especiales para crear los objetos
    //Los constructores no devuelven nada, ni siquiera usan void
    //Se llaman igual que la clase
    /*Sobrecarga de constructores.
    En java los métodos pueden estar sobrecargados, es decir, llamarse
    con el mismo nombre. En este caso se ditingue uno de otro por el número
    y tipo de sus parametros.
     */
    //Por defecto(salvo métodos intermedios internos de la clase), los métodos
    //seran "públicos"
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = dni;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos getters y setters para trabajar con los atributos
    //getters → obtienen el valor del atributo
    //setters → cambian el valor del atributo
    //Métodos Getter
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public char getSexo() {
        return this.sexo;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    //Metodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 120) {
            this.edad = 120;
        } else if (edad < 0) {
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            this.sexo = 'O';
        } else {
            this.sexo = sexo;
        }
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    int calcularIMC() {
        double alturaM = this.altura / 100;
        double IMC = this.peso / (alturaM * alturaM);
        int resultado = 0;
        if (IMC > 25) {
            resultado = 1;
        } else if (IMC < 20) {
            resultado = -1;
        }
        return resultado;
    }

    public boolean esMayorEdad() {
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Persona(" + 
                "Nombre: " + this.nombre + ", " +
                "edad:" + this.edad +  ", " +
                "DNI: " + this.DNI +  ", " +
                "sexo: " + this.sexo + ", " +
                "peso: " + this. peso + ", " +
                "altura: " + this.altura + ")";
    }

}
