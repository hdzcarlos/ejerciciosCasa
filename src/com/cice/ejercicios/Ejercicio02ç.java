/*
 * Escribir un programa que escriba tu nombre completo en una linea,
 * y en la siguiente linea tu fecha de nacimiento.
 *
 * 2 variables de tipo String -> cada una contendrá la inforación solicitada.
 * Pntar por consola las dos lineas con un "sout"
 *
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * author chc10
 */
public class Ejercicio02ç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos las variables necesarias
        
        String nombre;
        String fecha;
        // Escaner
        
        Scanner sc = new Scanner(System.in);
        
        // Muestro por consola los mensajes.
        
        System.out.println("EJERCICIO 02");
        System.out.println("============");
        System.out.print("Introduce tu nombre completo: ");
        //Almaceno mi nombre
        
        nombre = sc.nextLine();
        //Solicito la fecha de nacimiento.
        System.out.print("Introduce tu fecha de nacimiento: ");
        
        // Almaceno mi fecha de nacimiento
        fecha = sc.nextLine();
        
        //Pintar el resultado de los datos introducidos
        
        System.out.println("Tu nombre es: (" + nombre + ")");
        
        // Pintamos la fecha por consola.
        
        System.out.println("Y naciste el: (" + fecha + ")");
        
        
        
        
    }
    
}
