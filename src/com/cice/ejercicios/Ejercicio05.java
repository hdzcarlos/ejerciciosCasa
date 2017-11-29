/*
 * Desarrollar un programa1 que a partir de un determinado numero, vaya realizando
 * la suma de todos los numeros consecutivos a dicho numero.
 * E proceso finalizara cuando se alcance o supere el valor de 100

 * Se mostrara solo el resultado final.
 */
package com.cice.ejercicios;

import java.util.Scanner;

/**
 *
 * @author chc10
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EJERCICIO05");
        System.out.println("===========");
        
        //Escaner
        // Tecleamos Scanner y pulsamos Ctrl + Espace para generar la linea de 
        // codigo que aparece arriba como import java.until.Scanner
        Scanner sc = new Scanner(System.in);
        
        // Declararmos las variables para 
     
        int numero = 0;
        int suma = 0;
        
        System.out.print("Introduzca un numero entero: ");
        numero = sc.nextInt();
      // Inicializaos la variable I con el valor de numero, con la condición
      // de la variable suma sea menor o igual a 100 y sumando 1 a i.
        for (int i= numero; suma <=100; i++){
            
            // Vamos a sumar el valor de Suma + 1 
            
            suma = suma + i;
            //suma += i; esto es una abrebiatura del codigo suma = suma + i
            }
        System.out.print("Dado el numero (" + numero +") La suma de sus consecutivos es: "+ suma);
        
        
        
        


    
    }
    
}
