/*
 * Escribir un programa que dado el precio de un producto, calcule el precio
 * aplicando un descuento del 15%  
 *
 * Tiene que pintar por consola el precio original y el rebajado.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author chc10
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos las variable.
       
        String producto;
        double precio;
        double resultado;
        
        //Scanner
        Scanner sc = new Scanner (System.in);
        
        // Muestra por consola los datos.
        System.out.println ("EJERCICIO 3");
        System.out.println("============");
        System.out.print("Introduzca el nombre del producto: ");
        
        // Almacenamos el nombre del producto
        producto = sc.nextLine();
        
        // Pedimos el precio del producto
        System.out.print("Introduzca el precio del producto: ");
        
        //Almacenamos el precio del producto.
        precio = sc.nextDouble();
        
        //Calculamos el resultado
        resultado = precio * ( 1 - 0.15 );
        
        System.out.println("El precio de las zapatillas con el descuento es de : " + resultado + "€");
        
        
        
    }
    
}
