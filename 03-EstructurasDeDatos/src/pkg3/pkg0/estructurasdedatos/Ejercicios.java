/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg3.pkg0.estructurasdedatos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Ejercicios {
    public static void ejercicios1() {
        // TODO code application logic here
        Random rd = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.println("--------MENU--------");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        System.out.println("Ejercicio 4");
        System.out.println("Salir 5");
        System.out.print("Ingresa tu elección: ");
        int ejercicio = teclado.nextInt();
        System.out.println("");
        while (ejercicio != 5) {
            switch (ejercicio) {

                case 1 -> {
                    //Ejercicio 1
                    System.out.println("Ejercicio 1");
                    //a
                    char[] f = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
                    System.out.println("El 7mo elemento del array es " + f[6]);
                    //b
                    int[] a = {8, 8, 8, 8, 8}; //Crea array a con 5 elementos '8'

                    //c Crea array c con 100 elementos random y luego suma sus elementos
                    int[] c = new int[100];
                    int suma = 0;
                    for (int i : c) {
                        c[i] = rd.nextInt(0, 101);
                        suma += c[i];
                    }
                    System.out.println("La suma de los 100 enteros del array 'c' es: " + suma);

                    //d 
                    int[] array_a = new int[11]; //Crea array a
                    for (int i = 0; i < 10; i++) {
                        array_a[i] = rd.nextInt(0, 101);
                    }
                    float[] b = new float[34];//Crea array b

                    for (int i = 0; i < 10; i++) {
                        b[i] = array_a[i];
                        System.out.println(b[i]);
                    }
                }
                case 2 -> {
                    //Ejercicio 2
                    System.out.println("Ejercicio 2");
                    String[] dias = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
                    System.out.println("Introduce un numero del 1 al 7:");
                    int num = teclado.nextInt();
                    while (num < 1 || num > 7) {
                        System.out.println("Introduce un numero del 1 al 7:");
                        num = teclado.nextInt();
                    }
                    int dia = num - 1; //Resta 1 a variable num para facilitar uso de elección y compatibilidad con array
                    switch (dia) {
                        case 0 -> {
                            System.out.println(dias[6]);
                            System.out.println(dias[dia + 1]);
                        }
                        case 6 -> {
                            System.out.println(dias[dia - 1]);
                            System.out.println(dias[0]);
                        }
                        default -> {
                            System.out.println(dias[dia - 1]);
                            System.out.println(dias[dia + 1]);
                        }
                    }
                }
                case 3 -> {
                    //Ejercicio 3
                    System.out.println("\nEjecicio 3");
                    System.out.println("Elige opcion: (1. CIFRAR | 2. DESCIFRAR)");
                    int eleccion = teclado.nextInt();
                    while (eleccion != 1 && eleccion != 2) {
                        System.out.println("Eleccion debe ser 1 o 2.");
                        eleccion = teclado.nextInt();
                    }
                    int divisor = 1000;

                    if (eleccion == 1) {   //Cifrado                        
                        System.out.println("Introduce un numero: ");
                        int numero = teclado.nextInt();

                        int[] numRaw = new int[4];
                        int[] numEd = new int[4];
                        //Cifrado
                        for (int i = 0; i < 4; i++) {
                            numRaw[i] = (int) numero / divisor;
                            numero = numero - numRaw[i] * divisor;
                            divisor /= 10;
                            numRaw[i] = (numRaw[i] + 7) % 10;
                        }
                        numEd[0] = numRaw[2];
                        numEd[2] = numRaw[0];
                        numEd[1] = numRaw[3];
                        numEd[3] = numRaw[1];
                        System.out.println("Número cifrado: ");
                        for (int i = 0; i < 4; i++) {
                            System.out.print(numEd[i]);
                        }
                        System.out.println("\n");
                    } else {   //Descifrado
                        System.out.println("Introduce un numero: ");
                        int numero = teclado.nextInt();
                        int[] numRaw = new int[4];
                        int[] numEd = new int[4];
                        divisor = 1000;
                        for (int i = 0; i < 4; i++) {
                            numRaw[i] = (int) numero / divisor;
                            numero = numero - numRaw[i] * divisor;
                            divisor /= 10;
                        }
                        numEd[0] = numRaw[2];
                        numEd[2] = numRaw[0];
                        numEd[1] = numRaw[3];
                        numEd[3] = numRaw[1];
                        for (int i = 0; i < 4; i++) {
                            numEd[i] = (numEd[i] + 10 - 7) % 10;
                        }
                        System.out.println("Número descifrado: ");
                        for (int i = 0; i < 4; i++) {
                            System.out.print(numEd[i]);
                        }
                        System.out.println("\n");
                        System.out.println("\n");
                    }
                }
                case 4 -> {
                    //Ejercicio 4
                    System.out.println("Ejercicio 4");
                    int[] lista = new int[50];
                    int sumaLista = 0;
                    for (int i = 0; i < lista.length; i++) {
                        lista[i] = rd.nextInt(0, 100); //numeros de hasta 2 cifras
                        sumaLista += lista[i];
                    }
                    System.out.println("Introduce un número: ");
                    int numero = teclado.nextInt();
                    int cuentaNum = 0, mayor = -1, cuentaMay = 0, menor = 100;

                    for (int i = 0; i < lista.length; i++) {
                        if (numero == lista[i]) {
                            System.out.println("Numero en posición: " + i); //a
                            cuentaNum++;
                            System.out.printf("%d aparece %d veces en lista", numero, cuentaNum); //b
                        } else {
                            System.out.println(-1);
                        }
                        if (numero > mayor) {
                            mayor = numero;
                            cuentaMay++;
                            System.out.printf("El numero mayor es %d y aparece %d veces.", mayor, cuentaMay);//c
                        }
                        if (numero < menor) {
                            menor = numero;
                        }
                    }
                    //d
                    if (cuentaNum > cuentaMay) {
                        System.out.println("Verdadero");
                    }
                    //e
                    int media = sumaLista / lista.length;
                    System.out.println("La media es " + media);

                    //d
                    int media2 = (mayor - menor) / 2;
                    System.out.println("La media entre el mayor y el menor es " + media2);

                    //g
                    int x = lista.length - 1;
                    int[] listaInv = new int[x + 1];
                    for (int i = 0; i < lista.length; i++) {
                        listaInv[i] = lista[x];
                        x--;
                    }
                }
            } //Fin switch
            System.out.println("--------MENU--------");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Salir 5");
            System.out.print("Ingresa tu elección: ");
            ejercicio = teclado.nextInt();
            System.out.println("");
        }//Fin while
    }
    
    public static void ejercicios2() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Elije ejercicio: ");
        System.out.println("1. Letra de Nif");
        System.out.println("2. Abuela Maria");
        System.out.println("3. Mediana");
        System.out.println("4. Salir");
        int ejercicio = teclado.nextInt();
        while (ejercicio != 4) {
            switch (ejercicio) {
                case 1 -> { //Digito control NIE
                    teclado.nextLine();
                    char[] letras = {
                        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                        'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                        'C', 'K', 'E'};
                    char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; //Usar (int)'9' - '0' para no hacer este array
                    System.out.println("Ingresa tu DNI/NIE");
                    /*String numero = teclado.nextLine();*/
                    String numero = teclado.nextLine();

                    while (numero.length() != 8) {
                        System.out.println("Escribe tu DNI/NIE correctamente");
                        numero = teclado.nextLine();
                    }
                    int[] arrayNum = new int[8];
                    if (numero.charAt(0) == 'X'){
                        arrayNum[0] = 0;
                    } else if (numero.charAt(0) == 'Y') {
                        arrayNum[0] = 1;
                    } else if (numero.charAt(0) == 'Z') {
                        arrayNum[0] = 2;
                    } else {
                        for (int j = 0; j < nums.length; j++) {
                            if (numero.charAt(0) == nums[j]) {
                                arrayNum[0] = j;
                            }
                        }

                    }
                    for (int i = 1; i < arrayNum.length; i++) {
                        for (int j = 0; j < nums.length; j++) {
                            if (numero.charAt(i) == nums[j]) {
                                arrayNum[i] = j;
                            }
                        }
                    }
                    int multiplicador = 10000000;
                    int documento = 0;
                    for (int i = 0; i < arrayNum.length; i++) {
                        documento += arrayNum[i] * multiplicador;
                        multiplicador /= 10;
                    }
                    System.out.println(documento);
                    System.out.println(documento + "" + letras[documento % 23]);
                }

                case 2 -> {//Abuela Maria
                    int[] dientesArr = new int[6];
                    int[] dientesAba = new int[6];

                    for (int i = 0; i < 6; i++) {
                        System.out.println("Ingresa diente de arriba (0 a 2000)");
                        dientesArr[i] = teclado.nextInt();
                        while (dientesArr[i] < 0 || dientesArr[i] > 2000) {
                            System.out.println("Ingresa valores correctos 0 a 2000");
                            dientesArr[i] = teclado.nextInt();
                        }
                        System.out.println("Ingresa diente de abajo (0 a 2000)");
                        dientesAba[i] = teclado.nextInt();
                        while (dientesAba[i] < 0 || dientesAba[i] > 2000) {
                            System.out.println("Ingresa valores correctos 0 a 2000");
                            dientesAba[i] = teclado.nextInt();
                        }
                    }
                    for (int i = 0; i < 6; i++) {
                        System.out.print(dientesArr[i]);
                    }
                    System.out.println("");
                    for (int i = 0; i < 6; i++) {
                        System.out.print(dientesAba[i]);
                    }
                    System.out.println("");

                    boolean encajan = true;
                    int control = dientesArr[0] + dientesAba[0];
                    int i = 1;
                    while (encajan && i < 6) {
                        if ((dientesArr[i] + dientesAba[i]) != control) {
                            encajan = false;
                        }
                        i++;
                    }
                    if (encajan) {
                        System.out.println("Los dientes encajan");
                    } else {
                        System.out.println("Los dientes no encajan");
                    }

                    System.out.println("");
                }
                case 3 -> {
                    System.out.println("Introduce la cantidad de valores de la muestra: ");
                    int largo = teclado.nextInt();
                    while (largo < 0 || largo > 25000) {
                        System.out.println("Introduce la cantidad de valores de la muestra: ");
                        largo = teclado.nextInt();
                    }
                    int[] array = new int[largo];
                    int menor = 0;
                    for(int i = 0; i<array.length;i++){
                        System.out.println("Ingresa numero: ");
                        int num = teclado.nextInt();
                        while(num < 0){
                            System.out.println("Ingresa un numero positivo: ");
                            num = teclado.nextInt();
                        }
                        if(menor > num){
                            menor = num;
                        }
                    }
                    
                    
                    
                    System.out.println("");
                }
            }//Fin switch
            System.out.println("Elije ejercicio: ");
            System.out.println("1. Letra de Nif");
            System.out.println("2. Abuela Maria");
            System.out.println("3. Mediana");
            System.out.println("4. Salir");
            ejercicio = teclado.nextInt();
        }//FIn de while
    }
    
    //Ejercicios3 fue actualizar carrera de Caballos
    
    public static void ejercicios4() {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("----Elije ejercicio----");
        System.out.println("1. Ejercicios billetes y monedas");
        System.out.println("2. Notas");
        System.out.println("3. Salir");
        int opcion = teclado.nextInt();

        while (opcion != 3) {
            switch(opcion){
                case 1->{
                    double[] dinero = {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.01};
                    System.out.print("Ingresa un monto: ");
                    double monto = teclado.nextDouble();
                    
                    for(int i=0; i<dinero.length; i++){
                        int division = (int)(monto/dinero[i]);
                        if(division > 0){
                            int mult = (int)(monto/dinero[i]);
                            monto = monto - (dinero[i]*mult);
                            System.out.println(mult + " x " + dinero[i]);
                        }
                    }
                    
                }
                case 2->{
                    boolean input = true;
                    int[] notas = new int[11];
                    int num = 0;
                    while(input){
                        System.out.printf("\n%d .Introduce la nota del alumno(Del 0 al 10): ",num);  //{1,4,3,4} aux 1
                        int nota = teclado.nextInt();
                        num++;
                        if(nota<0){
                            input = false;
                        }else{
                            notas[nota] ++;
                        }
                    }
                    System.out.println(" ");
                    int mayor = 0;
                    for(int i=0; i<notas.length; i++){
                        if(mayor < notas[i]){
                            mayor = notas[i];
                        }
                        System.out.print(i + ": ");
                        for(int j=0; j<notas[i]; j++){
                            System.out.print("#");
                        }
                        System.out.println("");
                    }
                    System.out.println("La nota/s que mas se repite es: ");
                    for(int i = 0; i<notas.length; i++){
                        if(notas[i] == mayor){
                            System.out.println(i);
                        }
                    }
                    System.out.println("");
                }
            }
            System.out.println("----Elije ejercicio----");
            System.out.println("1. Ejercicios billetes y monedas");
            System.out.println("2. Notas");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
        }
    }
    
    public static void charArray() {
        // TODO code application logic here
        /*
        Realiza los ejercicios utilizando arrays de char (sin métodos de String). Luego hazlos de nuevo utilizando métodos de la clase String en los casos en los que veas que es más sencillo.

        1. Escribe un programa que lea una línea de texto desde el teclado e imprima la línea del revés.
        2. Cuenta la cantidad de ocurrencias de una letra en un texto. Por ejemplo, “h” en “El gato decía hola muchas veces al día, hola”, retorna 2. La letra y la línea, leída de teclado.
        3. Busca una palabra dentro de un texto y sustitúyela con un “*”. Por ejemplo, “auto” en “Había muchos autos” queda “Había muchos *”.
        4. Genera un palíndromo a partir de una palabra, por ejemplo “auto” queda “autotua”.
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una linea de texto:");
        //String texto = JOptionPane.showInputDialog("Introduce una linea de texto:");
        String texto = teclado.nextLine();
        char[] arrayChar = texto.toCharArray();

        for (int i = 0; i < arrayChar.length / 2; i++) {
            char aux = arrayChar[i];
            arrayChar[i] = arrayChar[arrayChar.length - (i + 1)];
            arrayChar[arrayChar.length - (i + 1)] = aux;
        }
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i]);
        }
        System.out.println("\n");
        System.out.print("Busca una letra: ");
        //String letraIn = JOptionPane.showInputDialog("Busca una letra: ");
        char letra = teclado.nextLine().charAt(0);
        //char letra = letraIn.charAt(0);
        int contador = 0;
        for (int i = 0; i < arrayChar.length; i++) {
            if (letra == arrayChar[i]) {
                contador++;
            }
        }
        System.out.println(contador);

        System.out.print("Busca una palabra: ");
        String palabra = teclado.nextLine();
        texto = texto.replaceAll(palabra, "*");
        System.out.println(texto);

        System.out.println("Ingresa una palabra");
        String palabra2 = teclado.nextLine();
        char[] arrayPalabra = palabra2.toCharArray();
        for (int i = 0; i < arrayPalabra.length / 2; i++) {
            char aux = arrayPalabra[i];
            arrayPalabra[i] = arrayPalabra[arrayPalabra.length - (i + 1)];
            arrayPalabra[arrayPalabra.length - (i + 1)] = aux;
        }
        System.out.println("");
        System.out.print(palabra2);
        for (int i = 1; i < arrayPalabra.length; i++) {
            System.out.print(arrayPalabra[i]);
        }
        System.out.println("");
    }
    
     public static void ahorcado(){
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        String mensaje = "esto es ahorcado";
        char[] arrayChar = mensaje.toCharArray();
        char[] ahorcado = new char[arrayChar.length];
        final int INTENTOS_MAX = 5;
        int intentos = 0;
        for (int i = 0; i < ahorcado.length; i++) {
            ahorcado[i] = '_';
        }
        int contador = 0;
        while (intentos < INTENTOS_MAX && contador < arrayChar.length) {
            System.out.println("Intentos: " + (INTENTOS_MAX - intentos));
            System.out.println("Ingresa una letra:");
            char letra = teclado.nextLine().charAt(0);
            boolean letraEx = false;
            for (int i = 0; i < arrayChar.length; i++) {
                if (letra == arrayChar[i]) {
                    ahorcado[i] = letra;
                    letraEx = true;
                    contador ++;
                }
            }
            if(!letraEx){
                intentos++;
                System.out.println("Letra incorrecta");
            }
            System.out.println("");
            for (int i = 0; i < ahorcado.length; i++) {
                System.out.print(ahorcado[i]);
            }
            System.out.println("");
        }
        if (intentos == INTENTOS_MAX) {
            System.out.println("Has perdido");
        } else {
            System.out.println("Solucionaste");
        }
    }
     
     public static void alanSmithee() {
        // TODO code application logic here
        /*
        Alan Smithee
        The Alias Men
        frase
        fresas
        esponja
        japones
        Tom Marvolo Riddle
        I am Lord Voldemort
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos casos de prueba quieres realizar?");
        int pruebas = teclado.nextInt();
        while (pruebas < 0) {
            System.out.println("Introduce un número válido (mayor a 0)");
            pruebas = teclado.nextInt();
        }
        teclado.nextLine();
        String[] arrayPruebas = new String[pruebas];
        char[] alfabeto = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
        };

        for (int i = 0; i < pruebas; i++) {
            int[] conteo1 = new int[alfabeto.length];
            int[] conteo2 = new int[alfabeto.length];
            System.out.println("\nComparación Numero: " + (i + 1));
            System.out.println("Introduce la 1º frase");
            String frase1 = teclado.nextLine().toLowerCase();
            while (frase1.length() > 1000) {
                System.out.println("Introduce la 1º frase(menor a 1000 caracteres)");
                frase1 = teclado.nextLine().toLowerCase();
            }
            System.out.println("Introduce la 2º frase");
            String frase2 = teclado.nextLine().toLowerCase();
            while (frase1.length() > 1000) {
                System.out.println("Introduce la 1º frase(menor a 1000 caracteres)");
                frase2 = teclado.nextLine().toLowerCase();
            }
            for (int j = 0; j < frase1.length(); j++) {
                for (int x = 0; x < alfabeto.length; x++) {
                    if (frase1.charAt(j) == alfabeto[x]) {
                        conteo1[x]++;
                    }
                }
            }
            for (int j = 0; j < frase2.length(); j++) {
                for (int x = 0; x < alfabeto.length; x++) {
                    if (frase2.charAt(j) == alfabeto[x]) {
                        conteo2[x]++;
                    }
                }
            }
            int contador = 0;
            for (int z = 0; z < conteo1.length; z++) {
                if (conteo1[z] == conteo2[z]) {
                    contador++;
                }
            }
            if (contador == alfabeto.length) {
                arrayPruebas[i] = "SI";
            } else {
                arrayPruebas[i] = "NO";
            }

        }
        for (int i = 0; i < arrayPruebas.length; i++) {
            System.out.println(arrayPruebas[i]);
        }
        System.out.println("");

    }
     
     public static void arraysMulti() {
        // TODO code application logic here
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Ejercicio 1");
        int[][] b = new int[2][3];
        for (int i = 0; i < b[1].length; i++) {
            b[1][i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][2] = i + 3;
            }
        }
        int menor = b[0][0];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] < menor) {
                    menor = b[i][j];
                }
            }
        }
        System.out.println("El menor valor del array b es: " + menor);
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }
        System.out.println("\nEjercicio 2");
        //Ejercicio 2
        int[][] abril = new int[4][7];
        int[] tempS = new int[4];
        int sumaMes = 0;
        for (int i = 0; i < abril.length; i++) {
            int sumaSem = 0;
            for (int j = 0; j < abril[i].length; j++) {
                abril[i][j] = random.nextInt(10, 30);
                sumaSem += abril[i][j];
                sumaMes += abril[i][j];
            }
            System.out.println("La media de la semana " + (i + 1) + " es: " + (sumaSem / 7));
        }
        System.out.println("");
        for (int i = 0; i < abril.length; i++) {
            System.out.println(Arrays.toString(abril[i]));
        }
        System.out.println("\nLa media del mes es: " + (sumaMes / 28));

        //Ejercicio 3
        System.out.println("\nEjercicio 3");
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[][] anno = new int[12][];
        int[] mediaMes = new int[anno.length];
        int sumaA = 0;
        for (int i = 0; i < anno.length; i++) {
            sumaMes = 0;
            anno[i] = new int[diasMes[i]];
            for (int j = 0; j < anno[i].length; j++) {
                anno[i][j] = random.nextInt(-5, 40);
                sumaMes += anno[i][j];
            }
            mediaMes[i] = sumaMes / anno[i].length;
        }

        for (int i = 0; i < anno.length; i++) {
            System.out.println(Arrays.toString(anno[i]));
        }
        for (int i = 0; i < mediaMes.length; i++) {
            sumaA += mediaMes[i];
        }

        System.out.println("\nLa media mensual es: " + Arrays.toString(mediaMes));
        System.out.println("La media anual es: " + (double) (sumaA / 12));

        //Ejercicio 4
        /*Equipos con id (1 a N)
          Puntos → Gana:3, Empata:1, Pierde:0
          C/Jornada → Jornada, idLocal, golesLocal,idVisitante,golesVisitante
          TablaFinal → 0 idEquipo, 1 partJug,2 golesFavor,3 golesContra,4 Puntos
         */
        String[] equipos = {
            "Real Madrid",
            "FC Barcelona",
            "Atlético de Madrid",
            "Sevilla FC",
            "Real Sociedad",
            "Real Betis",
            "Villarreal CF",
            "Athletic Club",
            "Valencia CF",
            "Rayo Vallecano"
        };
        int cantE = equipos.length;
        final int JORNADAS = 3;
        int[][] partidos = new int[JORNADAS * (equipos.length / 2)][5];
        int[][] posiciones = new int[equipos.length][5];
        for (int i=0; i<posiciones.length; i++){
            posiciones[i][0] = i;
        }
        for (int i = 0; i < JORNADAS; i++) {
            System.out.printf("\n\nJORNADA %d\n", (i + 1));
            for (int j = 0; j < (equipos.length / 2); j++) {
                int partido = j + (5 * i);
                System.out.printf("\nPartido %d", partido + 1);
                int rdLocal = random.nextInt(0, cantE);
                while (posiciones[rdLocal][1] > i) {
                    rdLocal = random.nextInt(0, cantE);
                }
                int rdVisitante = random.nextInt(0, cantE);
                while ((posiciones[rdVisitante][1] > i) || rdVisitante == rdLocal) {
                    rdVisitante = random.nextInt(0, cantE);
                }
                posiciones[rdLocal][1]++;
                posiciones[rdVisitante][1]++;
                int rdGolesL = random.nextInt(0, 7);
                int rdGolesV = random.nextInt(0, 7);
                partidos[partido][0] = (int) i + 1;
                partidos[partido][1] = rdLocal;
                partidos[partido][2] = rdGolesL;
                partidos[partido][3] = rdGolesV;
                partidos[partido][4] = rdVisitante;
                System.out.println(Arrays.toString(partidos[partido]));
            }
        }

        for (int[] p : partidos) {
            if(p[2]>p[3]){
                posiciones[p[1]][4] +=3;
            }else if(p[2]<p[3]){
                posiciones[p[4]][4] +=3;
            }else{
                posiciones[p[1]][4] +=1;
                posiciones[p[4]][4] +=1;
            }
            posiciones[p[1]][2] += p[2];
            posiciones[p[4]][3] += p[3];
        }
        
        Arrays.sort(posiciones, (x,y) -> y[4] - x[4]);
        
        System.out.println("\nId,PJ,GF,GC,Pts");
        for(int[] i: posiciones){
            System.out.print(Arrays.toString(i));
            System.out.println(equipos[i[0]]);
        }
        
        //Ejercicio 5
        int[][] buscaminas;
        System.out.println("Introduce 2 numeros");
        int largo = teclado.nextInt();
        int ancho = teclado.nextInt();


    }
    
}
