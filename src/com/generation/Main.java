package com.generation;

public class Main {

    public static void main(String[] args) {
	// Declaración de variables en JAVA
        String nombres = "Luis Angel";  //variable de tipo cadena de chars, va siempre entre""

        //Datos primitivos
        byte edad = 127;  //variable de tipo numero byte +-2^(8)
        short numeroCorto = 1500;  //+-2^(8*2)
        int numIntegro = 50000; // +-2^(8*4)
        long numLargo = 500000000; // +- 2^(8*8)
        // se agrega una f al final, para que no marque error
        float numDecimal = 10.121212454545454545544545f;  // +-2^(8*4) con decimales
        // se agrega una d al final, para que no marque error
        double numDecimalProfundo = 10.12121212121212121212121211212212121221212121212121212221121212212121d; // 2^(8*8) con decimales

        char character = 'r'; //variable para un único carácter va entre ''

        System.out.println(nombres);
        System.out.println(edad);
        System.out.println(numeroCorto);
        System.out.println(numIntegro);
        System.out.println(numLargo);
        System.out.println(numDecimal);
        System.out.println(numDecimalProfundo);
        System.out.println(character);

        //Se pueden igualar entre variables numéricas SOLO en este orden: byte -> short -> int -> long -> float -> double
        short edadEnShort = (short) (edad + 1);
        System.out.println(edadEnShort);

        int edadEnInt = edadEnShort - 1;
        short edadEnShort2 = (short) edadEnInt;  //asi se fuerza
        System.out.println(edadEnShort2);


        //suma de bytes (Ejercicio para aplicar)
        byte numByte1 = 120;
        byte numByte2 = 120;
        short suma = (short)(numByte1 + numByte2) ;
        System.out.println(suma);


        /*
            Operadores aritméticos en JAVA
            + sumar o concatenar cadenas
            - restar
            * multiplicar
            / dividir
            % residuo

            Ejercicio: utilizar todos los operadores
        */
        System.out.println("______________________________________________________________________________");
        short num1 = 128;
        short num2 = 32;
        System.out.println("Ejercicio: Utilizar todos los operadores en operaciones con los números: " + num1 + " y " + num2);

        int sumaE = num1 + num2;
        int resta = num1 - num2;
        long producto = num1 * num2;
        float division = (float) num2 / num1;
        int residuo = num2 % num1;

        System.out.println("La suma es: "+ sumaE);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + producto);
        System.out.println("La division es: " + division);
        System.out.println("El residuo es: " + residuo);

    }
}
