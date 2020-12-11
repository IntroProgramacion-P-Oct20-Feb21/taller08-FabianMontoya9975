/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author josef
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int n;
        int numerador;
        double denominador;
        double suma = 0;
        String cadena;
        
        System.out.println("Ingresar un número n(positivo): ");
        n = entrada.nextInt();
        // El usuario ingresa por teclado el valor de n
        // (siempre que sea un valor positivo)
        if(n >= 0){
            for (int i = 1; i <= n; i++){
                numerador = 1;
                denominador = Math.pow(2, i);
                suma = suma + (numerador / denominador);
                //  n     1
                //  Σ     ---
                // i=1    2^i
            }
            cadena = String.format("Suma total de los elementos de la serie "
                    + "es: %f", suma);
            // Se presenta en pantalla la suma de los elementos de
            // la serie
        } else {
            cadena = "Error, número ingresado no válido.";
        }
        System.out.printf("%s\n", cadena);
    }
   
}
