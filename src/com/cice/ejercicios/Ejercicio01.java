/*
 * Pedir al usuario que introduzca dos números enteros y vamos a decir si son
 * iguales o a es mayor que b o menor que b.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 * autor Carlos Hernandez
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creeo dos variables donde almacenar numeros solicitados
        int a = 1;
        int b = 2;
        
        //El escaner
        Scanner sc = new Scanner(System.in);
        
        //Pedir al usuario que introduzca 2 numeros enteros.
        
        System.out.println("EJERCICIO 01");
        System.out.println("============");
        System.out.print("Introduce un número entero: ");
    
        //Almaceno el número que me escrbe el usuario
        a = sc.nextInt();
        
        //Solicito el segundo numero
        System.out.println("Introduce el segundo número entero: ");
        
        //Almaceno el segundo numero
        b = sc.nextInt();
        
        //Comprobar si a es mayor, menor o igual que b.
        
        if (a < b){
            
            System.out.println("A (" + a + ") es menor que B (" + b + ")");
            
        }else if (a > b){
            
             System.out.println("a (" + a +") es mayor que B (" + b +")");
          
        }else{
             System.out.println("a("+ a +") es igual que B (" + b +") ");
                     
             
             
             
                  
                      
        }
    }
    
}
