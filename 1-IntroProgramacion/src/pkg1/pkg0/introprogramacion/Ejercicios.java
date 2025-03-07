/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1.pkg0.introprogramacion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ejercicios {
    public static void ejercicios1() {
        // TODO code application logic here

        System.out.println("Ejercicios:");
        System.out.println("1. Cubo y Cuadrado");
        System.out.println("2. Longitud y Area del circulo");
        System.out.println("3. Par o Impar");
        System.out.println("4. Orden ascendente");
        System.out.println("5. Tres numeros. Si el 1º es negativo producto de los tres sino suma de los tres");
        System.out.println("6. Celcius y Farenheit");
        System.out.println("7. Horas, minutos y segundos");
        System.out.println("8. Temperatura de teclado y deportes");
        System.out.println("9. El mayor de 3 números");
        System.out.println("0. Salir del Programa");
        System.out.println("10. Muestra lista de ejercicios");
        System.out.println("_________________________________________________________________");
        System.out.print("1 al 9: Elegir ejercicio | 0: Salir | 10: Menu | -------------");

        Scanner teclado = new Scanner(System.in);
        int programa = teclado.nextInt();

        while (programa != 0) {
            if (programa == 10) {
                System.out.println("Ejercicios:");
                System.out.println("1. Cubo y Cuadrado");
                System.out.println("2. Longitud y Area del circulo");
                System.out.println("3. Par o Impar");
                System.out.println("4. Orden ascendente");
                System.out.println("5. Tres numeros. Si el 1º es negativo producto de los tres sino suma de los tres");
                System.out.println("6. Celcius y Farenheit");
                System.out.println("7. Horas, minutos y segundos");
                System.out.println("8. Temperatura de teclado y deportes");
                System.out.println("9. El mayor de 3 números");
            }

            switch (programa) {
                case 1 -> {
                    System.out.println("Cubo y Cuadrado");
                    System.out.print("Introduce un número: ");
                    int numero = teclado.nextInt();
                    int cuadrado = numero * numero;
                    int cubo = cuadrado * numero;
                    System.out.println("Para " + numero);
                    System.out.println("El cuadrado es: " + cuadrado);
                    System.out.println("El cubo es: " + cubo);
                }
                case 2 -> {
                    System.out.println("longitud y area de circulo");
                    System.out.print("Introduce el radio: ");
                    int radio = teclado.nextInt();
                    final double pi = 3.1416;
                    double longitud = 2 * pi * radio;
                    double area = pi * (radio * radio);
                    System.out.println("La longitud del circulo es: " + longitud);
                    System.out.println("El area del circulo es: " + area);
                }
                case 3 -> {
                    System.out.println("Par o impar");
                    System.out.print("Introduce un numero: ");
                    int num = teclado.nextInt();
                    int resto = num % 2;
                    if (resto == 0) {
                        System.out.println(num + " es par");
                    } else {
                        System.out.println(num + " es impar");
                    }
                }
                case 4 -> {
                    System.out.println("Orden ascendente");
                    System.out.print("Escribe un numero a: ");
                    int A = teclado.nextInt();
                    System.out.print("Escribe un numero b: ");
                    int B = teclado.nextInt();
                    if (A < B) {
                        System.out.println(A + "," + B);
                    } else {
                        System.out.println(B + "," + A);
                    }
                }
                case 5 -> {
                    System.out.println("Tres numeros. Si el 1º es negativo imprime producto, sino suma");
                    System.out.print("Introduce a: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce b: ");
                    int b = teclado.nextInt();
                    System.out.print("Introduce c: ");
                    int c = teclado.nextInt();
                    int result_suma = a + b + c;
                    int result_prod = a * b * c;
                    if (a < 0) {
                        System.out.println("El producto es: " + result_prod);
                    } else {
                        System.out.println("La suma es: " + result_suma);
                    }
                }
                case 6 -> {
                    System.out.println("Celcius y Farenheit");
                    double celcius, faren;
                    System.out.println("Que deseas convertir? opciones:");
                    System.out.println("1.Farenheit a Celcius");
                    System.out.println("2.Celcius a Farenheit");
                    System.out.print("Escribe 1 o 2: ");
                    int opcion = teclado.nextInt();
                    if (opcion == 1) {
                        System.out.print("Introduce Farenheits: ");
                        faren = teclado.nextDouble();
                        celcius = 5 * (faren - 32) / 9;
                        System.out.println("Son " + celcius + " Celcius");

                    } else {
                        System.out.print("Introduce Celcius: ");
                        celcius = teclado.nextDouble();
                        faren = (9 * celcius / 5) + 32;
                        System.out.println("Son " + faren + " Farenheits");
                    }
                }
                case 7 -> {
                    System.out.println("Horas, minutos y segundos");
                    System.out.println("Introduce un numero en segundos");

                    int num_seg = teclado.nextInt();
                    int hor, min, seg;

                    hor = (int) num_seg / 3600;
                    min = (int) (num_seg / 60) - (hor * 60);
                    seg = num_seg - (hor * 3600) - (min * 60);

                    System.out.println(num_seg + " son " + hor + " horas, " + min + " minutos, " + seg + " segundos.");
                }
                case 8 -> {
                    System.out.println("Temperatura de teclado");
                    int temp = teclado.nextInt();
                    if (temp > 30) {
                        System.out.println("Natación");
                    } else if (temp > 15 && temp <= 30) {
                        System.out.println("Golf");
                    } else if (temp > 5 && temp <= 15) {
                        System.out.println("Tennis");
                    } else if (temp > -10 && temp <= 5) {
                        System.out.println("Esquí");
                    } else if (temp <= -10) {
                        System.out.println("Damas");
                    }
                }
                case 9 -> {
                    System.out.println("Mayor de 3 numeros");
                    System.out.print("Introduce el 1º numero: ");
                    int num1 = teclado.nextInt();
                    System.out.print("Introduce el 2º numero: ");
                    int num2 = teclado.nextInt();
                    System.out.print("Introduce el 3º numero: ");
                    int num3 = teclado.nextInt();
                    if (num1 > num2) {
                        if (num1 > num3) {
                            System.out.println(num1 + " es el mayor");
                        } else {
                            System.out.println(num3 + " es el mayor");
                        }
                    } else if (num2 > num3) {
                        System.out.println(num2 + " es mayor");
                    } else {
                        System.out.println(num3 + " es mayor");
                    }
                }
            }
            System.out.println("_________________________________________________________________");
            System.out.print("1 al 9: Elegir ejercicio | 0: Salir | 10: Menu | -------------");
            programa = teclado.nextInt();

        }

    }
    
    public static void ejercicios2() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Ejercicio 5");
        System.out.println("Ejercicio 6");
        System.out.println("Ejercicio 7");
        System.out.println("Ejercicio 8");
        System.out.println("Ejercicio 9");
        System.out.println("Ejercicio 10");
        System.out.println("Ejercicio 11");
        System.out.println("----------------------------------------------");
        System.out.print("Elije ejercicio(1 al 11)| 0: Salir >>>>");
        int ejercicio = teclado.nextInt();

        while (ejercicio != 0) {
            switch (ejercicio) {
                case 1 -> {
                    /*
                    EJERCICIO 1
                    Escribe un programa en Java que lea la altura en metros de una persona y su
                    edad y obtenga su peso recomendado de acuerdo a la siguiente fórmula:
                    peso recomendado = (altura en cm – 100 + diez por ciento de la edad) * 0,9
                     */
                    System.out.print("Ingresa altura en metros: ");
                    double altura = teclado.nextDouble();
                    System.out.print("Ingresa edad: ");
                    int edad = teclado.nextInt();

                    double peso_rec = (((altura * 100) - 100) + (edad * 0.1)) * 0.9;

                    System.out.println("El peso recomendado es: " + peso_rec);
                }
                case 2 -> {
                    /*
                    EJERCICIO 2
                    Escribe un programa en Java que lea dos enteros y determine si el primero es
                    múltiplo del segundo.
                     */
                    System.out.println("Ingresa 2 números");
                    int ent1 = teclado.nextInt();
                    int ent2 = teclado.nextInt();
                    int resto = ent2 % ent1;
                    if (resto == 0) {
                        System.out.println(ent1 + " es múltiplo de " + ent2);
                    } else {
                        System.out.println(ent1 + " no es mútliplo de " + ent2);
                    }
                }
                case 3 -> {
                    /*EJERCICIO 3
                    Escribe un programa que reciba cinco números y que determine e imprima la
                    cantidad de números negativos, positivos y la cantidad de ceros recibidos.
                     */
                    System.out.println("Introduce 5 numeros:");

                    int neg_nums = 0, pos_nums = 0, ceros = 0;

                    for (int contador = 0; contador < 5; contador++) {
                        int num = teclado.nextInt();
                        if (num < 0) {
                            neg_nums++;
                        } else if (num > 0) {
                            pos_nums++;
                        } else {
                            ceros++;
                        }
                    }
                    System.out.println("Numeros negativos: " + neg_nums);
                    System.out.println("Numeros positivos: " + pos_nums);
                    System.out.println("Ceros: " + ceros);
                }
                case 4 -> {
                    /*EJERCICIO 4
                    Escribe un programa en Java que lea 10 enteros y que determine los enteros
                    mayor y menor del grupo.
                     */
                    System.out.println("Introduce 10 numeros: ");
                    int mayor = 0;
                    int menor = 0;
                    int cont_num = 1;
                    for (int contador = 0; contador < 10; contador++) {
                        System.out.print("Num. " + cont_num + ": ");
                        cont_num++;
                        int num = teclado.nextInt();
                        if (mayor < num || mayor == 0) {
                            mayor = num;
                        }
                        if (menor > num || menor == 0) {
                            menor = num;
                        }
                    }
                    System.out.println("El mayor es: " + mayor);
                    System.out.println("El menor es: " + menor);
                }
                case 5 -> {
                    /*EJERCICIO 5
                    Escribe un programa en Java que lea 6 enteros y que calcule la media.
                     */
                    int cont_num = 1;
                    int suma = 0;
                    for (int contador = 0; contador < 6; contador++) {
                        System.out.print("Ingresa num " + cont_num + ": ");
                        int num = teclado.nextInt();
                        cont_num++;
                        suma += num;
                    }
                    System.out.println("La media es: " + suma / 6.0);
                }
                case 6 -> {
                    /*EJERCICIO 6.
                    Escribe un programa que valide los datos del ejercicio 1. La altura no puede ser
                    mayor que 250 cm y el edad no puede ser superior a 120 años.
                     */
                    System.out.print("Ingresa altura en metros: ");

                    double altura = teclado.nextDouble();
                    while (altura > 2.5) {
                        System.out.print("Ingresa un valor menor a 250cm (2,5 mts): ");
                        altura = teclado.nextDouble();
                    }
                    System.out.print("Ingresa edad: ");
                    int edad = teclado.nextInt();
                    while (edad > 120) {
                        System.out.print("Ingresa un valor menor a 120 años: ");
                        edad = teclado.nextInt();
                    }
                    double peso_rec = (((altura * 100) - 100) + (edad * 0.1)) * 0.9;
                    System.out.println("El peso recomendado es: " + peso_rec);
                }
                case 7 -> {
                    /*EJERCICIO 7
                    Escribe un programa en el que dado un número imprima todos sus divisores.
                     */
                    System.out.print("Ingresa un numero: ");
                    int numero = teclado.nextInt();
                    //int resto;
                    System.out.print("Sus divisores son: ");
                    for (int i = 1; i <= numero; i++) {
                        //resto = numero % i;
                        if (numero % i == 0) {
                            System.out.print(i + ", ");
                        }
                    }
                    System.out.println("");
                }
                case 8 -> {
                    /*EJERCICIO 8
                    Escribe un programa que reciba un número y calcule su factorial.
                     */
                    System.out.print("Introduce un numero: ");
                    int numero = teclado.nextInt();
                    int factorial = 1;
                    for (int factor = 1; factor <= numero; factor++) {
                        factorial *= factor;
                    }
                    System.out.println("Factorial de " + numero + " es: " + factorial);
                }
                case 9 -> {
                    /*EJERCICIO 9
                    Escribe un programa con un menú que calcule según la opción seleccionada
                    por el usuario el 
                    1. Factorial de un número, 
                    2. Tabla de multiplicar de un
                    número, 
                    3. Suma de los divisores de un número.
                    El programa debe repetirse mostrando de nuevo el menú hasta que el usuario
                    seleccione la opción 
                    4. Fin
                     */
                    System.out.println("MENU------------------");
                    System.out.println("1. Factorial de un numero ");
                    System.out.println("2. Tabla de multiplicar de un numero");
                    System.out.println("3. Suma de divisores de un numero");
                    System.out.println("4. Fin");
                    System.out.print(">>>>>>>>>>>>>>>>>");
                    int menu = teclado.nextInt();

                    while (menu != 4) {
                        switch (menu) {
                            case 1 -> {
                                System.out.print("Introduce un numero: ");
                                int numero = teclado.nextInt();
                                int factorial = 1;
                                for (int factor = 1; factor <= numero; factor++) {
                                    factorial *= factor;
                                }
                                System.out.println("Factorial de " + numero + " es: " + factorial);
                            }
                            case 2 -> {
                                System.out.print("Introduce un numero: ");
                                int num = teclado.nextInt();
                                for (int mult = 0; mult <= 10; mult++) {
                                    System.out.println(num + " x " + mult + " = " + num * mult);
                                }
                            }
                            case 3 -> {
                                System.out.print("Ingresa un numero: ");
                                int numero = teclado.nextInt();
                                int resto;
                                int suma = 0;
                                System.out.println("Sus divisores son:");
                                for (int divisor = 1; divisor <= numero; divisor++) {
                                    resto = numero % divisor;
                                    if (resto == 0) {
                                        suma += divisor;
                                        System.out.println(divisor);
                                    }
                                  }
                                System.out.println("La suma de sus divisores es: " + suma);
                            }
                        }

                        System.out.println("MENU------------------");
                        System.out.println("1. Factorial de un numero ");
                        System.out.println("2. Tabla de multiplicar de un numero");
                        System.out.println("3. Suma de divisores de un numero");
                        System.out.println("4. Fin");
                        System.out.print(">>>>>>>>>>>>>>>>>");
                        menu = teclado.nextInt();
                    }
                }
                case 10 -> {
                    /*EJERCICIO 10
                    Escribe un programa que reciba del usuario un número compuesto por cinco
                    dígitos, que separe ese número en sus dígitos individuales y los imprima, cada
                    uno separado de los demás por tres espacios. Por ejemplo, si el usuario escribe
                    el número 42339, el programa debe imprimir:
                    4 2 3 3 9
                     */
                    teclado.nextLine();
                    System.out.print("Introduce un numero: ");
                    String numComp = teclado.nextLine();
                    int largo = numComp.length();
                    for (int i = 0; i < largo; i++) {
                        System.out.print(numComp.charAt(i)+"   ");
                    }
                    System.out.println("");
                }
                case 11 -> {
                    /*
                    EJERCICIO 11
                    Realizar un programa que calcule todos los números primos entre dos dados
                     */
                    System.out.print("Introduce un numero: ");
                    int a = teclado.nextInt();
                    System.out.print("Introduce un numero: ");
                    int b = teclado.nextInt();
                    int num, max, suma = 0;
                    if (a < b) {
                        num = a;
                        max = b;
                    } else {
                        num = b;
                        max = a;
                    }
                    for (num = 2; num < max; num++) {
                        boolean primo = true;
                        for (int i = 1; i < num; i++) {
                            if ((num % i == 0 && i != 1) || num < 2) {
                                primo = false;
                                break;
                            }
                        }
                        if (primo) {
                        System.out.print(num + ",");
                        suma ++;
                        }
                    }
                    System.out.printf("\nHay %d numeros primos en ese rango\n", suma);
                }
            }
            System.out.println("-------------------------------------------");
            System.out.print("Elije ejercicio(1 al 11)| 0: Salir >>>>");
            ejercicio = teclado.nextInt();
        }
    }
    
        public static void ejercicios3() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); //Inicializa Scanner como "teclado"
        
        System.out.println("MENU\nEjercicio 1: sueldo\nEjercicio 2: Año bisiesto\nEjercicio 3: Notas alumnos\nEjercicio 4: Piedra, papel o tijeras\nSalir = 5\n-----------------");
        int ejercicio = teclado.nextInt();
        
        while (ejercicio != 5){
            switch (ejercicio){
                case 1 -> {
                    /* 1. De un operario se conoce su sueldo y los años de antigüedad. Se pide confeccionar un
                    programa que lea los datos de entrada y muestre el sueldo a pagar:
                    Si el sueldo es mayor o igual a 1000 mostrar el sueldo en pantalla sin cambios.
                    Si el sueldo es inferior a 1000, el sueldo final dependerá de la antigüedad en la empresa
                    (solamente preguntar por la antigüedad si el sueldo es menor que 1000):
                    a. Si es igual o superior a 10 años, otorgarle un aumento del 20 %.
                    b. Si su antigüedad es menor a 10 años, otorgarle un aumento del 5 %.
                    */
                    double sueldo; int aAntiguedad;
                    System.out.println("Introduce tu sueldo y tu antiguedad.");
                    System.out.print("Sueldo: ");
                    sueldo = teclado.nextDouble();
                    System.out.print("Años de antiguedad: ");
                    aAntiguedad = teclado.nextInt();
                    System.out.println(""); //Agrega linea
                    if (sueldo >= 1000){
                        System.out.print("Sueldo: " + sueldo);
                    } else {
                        if (aAntiguedad >= 10){
                            System.out.println("Tu sueldo será: " + (sueldo*1.2));
                        } else {
                            System.out.println("Tu sueldo será: " + (sueldo*1.05));
                        }
                    }
                    System.out.println(""); //Agrega linea
                }
                case 2 -> {
                    
                    /*2. Un año es bisiesto si es múltiplo de 4, exceptuando los múltiplos de 100, que sólo son
                    bisiestos cuando son múltiplos además de 400, por ejemplo el año 1900 no fue bisiesto,
                    pero el año 2000 sí lo fue. 
                    Hacer un programa que pida al usuario un año, y diga si es o
                    no bisiesto (se recomienda usar el diagrama de flujo de la semana 2). Ejemplos de salida
                    (nótese el uso de pasado o futuro):
                    1901 no fue bisiesto
                    2016 fue bisiesto
                    2400 será bisiesto
                    2401 no será bisiesto
                    */
                    int option = 1;
                    while (option != 0) {
                        System.out.println("Ingresa un año");
                        int input = teclado.nextInt();
                        //Cond. bisiesto: año % 4 == 0; (año % 100 == 0 && año % 400 == 0)
                        if (input % 4 == 0 || (input % 100 == 0 && input % 400 == 0)) {
                            System.out.println(input + " es Bisiesto");
                        } else {
                            System.out.println(input + " no es Bisiesto");
                        }
                        teclado.nextLine();
                        System.out.println("Quieres ingresar otro número?(0 para Salir)");
                        option = teclado.nextInt();
                    }
                }
                case 3 -> {
                    /*3. Realizar un programa que lea de teclado la nota de un examen de cada uno de los
                    alumnos de una clase y calcule la media, la nota más alta, la más baja y el número de
                    alumnos presentados al examen. La entrada de datos se acaba cuando se lee una nota
                    negativa.*/
                    System.out.println("Ingresa notas de los alumnos: ");
                    double nota = 1, masAlta = 0, masBaja = 0, suma = 0;
                    int numAlumnos = 0, cantidad = 0;
                    System.out.println("Nota");
                    nota = teclado.nextInt();
                    while (nota > 0){
                        masAlta = nota; masBaja = nota;
                        if (nota < masBaja) {
                            masBaja = nota;
                        }
                        if (nota > masAlta) {
                            masAlta = nota;
                        }
                        numAlumnos ++;
                        suma += nota;
                        System.out.println("Nota");
                        nota = teclado.nextInt();
                        cantidad ++;
                    }
                    System.out.println("La mas baja es:" + masBaja);
                    System.out.println("La mas alta es: " + masAlta);
                    System.out.println("La media es: "+ (suma/cantidad));

                }
                case 4 -> {
                    /*4. Realizar un programa que juegue a piedra, papel y tijera, con las siguientes
                    especificaciones:
                    • Habrá un jugador que jugará contra la máquina.
                    • El número de partidas a realizar será una constante en el programa. El juego
                    se repetirá todas las veces que indique dicha constante.
                    • Se solicitará al jugador que introduzca su jugada PIEDRA, PAPEL o TIJERA,
                    mediante el siguiente mensaje:
                    ¿PIEDRA, PAPEL O TIJERA?
                    • El programa sacará aleatoriamente su jugada (piedra, papel o tijera). El
                    programa indicará quién ha ganado según las siguientes reglas:
                    o La piedra aplasta la tijera (Gana la piedra.)
                    o La tijera corta el papel (Gana la tijera.)
                    o El papel envuelve la piedra (Gana el papel.)
                    o En caso de empate se señalará EMPATE
                    */
                    teclado.nextLine();
                    final int partidas = 3;
                    Random opcion = new Random();
                    int contadorPc = 0, contadorJugador = 0, i = 0;
                    while (i < partidas) {
                        int opPc = opcion.nextInt(1,4);
                        System.out.println("¿PIEDRA, PAPEL O TIJERA?");
                        System.out.println("1 = PIEDRA\n2 = PAPEL\n3 = TIJERA");
                        int opJugador = teclado.nextInt();
                        if (opPc == 1) {
                            System.out.println("PC elije: PIEDRA");
                        } else if (opPc == 2) {
                            System.out.println("PC elije: PAPEL");
                        } else {
                            System.out.println("PC elije: TIJERA");
                        }
                        if (opPc == opJugador) {
                            System.out.println("EMPATE");
                        }else if (opPc == 1 && opJugador == 2) {
                            System.out.println("El papel envuelve la piedra (Gana Jugador)");
                            contadorJugador ++;
                            i++;
                        } else if (opPc == 1 && opJugador == 3){
                            System.out.println("La piedra aplasta la tijera (Gana Pc)");
                            contadorPc ++;
                            i++;
                        } else if (opJugador == 1 && opPc == 2){
                            System.out.println("El papel envuelve la piedra (Gana Pc)");
                            contadorPc ++; 
                            i++;
                        } else if (opJugador == 1 && opPc == 3){
                            System.out.println("La piedra aplasta la tijera (Gana Jugador)");
                            contadorJugador ++;
                            i++;
                        } else if (opPc == 2 && opJugador == 3){
                            System.out.println("La tijera corta el papel (Gana Jugador)");
                            contadorJugador ++;
                            i++;
                        } else if (opJugador == 2 && opPc == 3){
                            System.out.println("La tijera corta el papel (Gana Pc)");
                            contadorPc ++;
                            i++;
                        }
                    }
                    //System.out.printf("contadorPC: %d\ncontadorJugador: %d",contadorPc,contadorJugador); //Para controlar variables
                    if (contadorPc > contadorJugador) {
                        System.out.printf("Gana PC: %d vs %d",contadorPc,contadorJugador);
                    }
                    if (contadorPc < contadorJugador) {
                        System.out.printf("Gana Jugador: %d vs %d",contadorJugador, contadorPc);
                    }
                }
                } //Cierra switch
            System.out.println("------------------------------------------------");
            System.out.println("MENU\nEjercicio 1: sueldo\nEjercicio 2: Año bisiesto\nEjercicio 3: Notas alumnos\nEjercicio 4: Piedra, papel o tijeras\nSalir = 5 -----------------");
            System.out.println("Elije ejercicio | Salir = 5\n-------------------------");
            ejercicio = teclado.nextInt();
        } //Cierra while
    }
    
}
