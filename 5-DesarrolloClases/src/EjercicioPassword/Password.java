/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPassword;

/**
 *
 * @author Felipe
 */
public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public String esValida() {
        String respuesta = "Validando password:";
        int index = 0;
        boolean largo8 = this.password.length() >= 8;
        boolean mayus = false;
        boolean minus = false;
        boolean isNum = false;
        while ((!mayus && !minus && !isNum) || (index < this.password.length())) {
            //Se puede agregar más condiciones, ya que no están incluidos caracteres
            //que contenga acentos, dieresis, etc.
            if (!mayus) {
                mayus = (((int) (this.password.charAt(index)) >= (int) 'A')
                        && ((int) (this.password.charAt(index)) <= (int) 'Z'))
                        || ((int) (this.password.charAt(index)) == (int)'Ñ');
            }
            if (!minus) {
                minus = (((int) (this.password.charAt(index)) >= (int) 'a')
                        && ((int) (this.password.charAt(index)) <= (int) 'z'))
                        || ((int) (this.password.charAt(index)) == (int)'ñ');
            }
            if (!isNum) {

                isNum = (((int) (this.password.charAt(index)) >= (int) '0')
                        && ((int) (this.password.charAt(index)) <= (int) '9'));
            }
            index++;
        }

        respuesta += "\nMínimo 8 caracteres: " + largo8;
        respuesta += "\nContiene MAYÚSCULAS: " + mayus;
        respuesta += "\nContiene minúsculas: " + minus;
        respuesta += "\nContiene números(0-9): " + isNum;

        return respuesta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Password{" + "password=" + password + '}';
    }

}
