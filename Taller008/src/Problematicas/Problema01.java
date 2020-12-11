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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena;
        char valor;
        System.out.println("Ingrese una palabra: ");
        cadena = entrada.nextLine();  // Universidad
        for(int i = 0; i < cadena.length(); i++){ // i < 11
            valor = cadena.charAt(i); // Universidad.charAt(0) >> U
                                      // Universidad.charAt(1) >> n
                                      // Universidad.charAt(2) >> i
                                      // Universidad.charAt(3) >> v
                                      // Universidad.charAt(4) >> e
                                      // Universidad.charAt(5) >> r
                                      // Universidad.charAt(6) >> s
                                      // Universidad.charAt(7) >> i
                                      // Universidad.charAt(8) >> d
                                      // Universidad.charAt(9) >> a
                                      // Universidad.charAt(10) >> d
            for(int contador = 0; contador <= i; contador++){
                System.out.printf("%s", valor);  // U
                                                 // nn
                                                 // iii
                                                 // vvvv
                                                 // eeeee
                                                 // rrrrrr
                                                 // sssssss
                                                 // iiiiiiii
                                                 // ddddddddd
                                                 // aaaaaaaaaa
                                                 // ddddddddddd
            }
            System.out.println();  //
        }
        
    }
    
}
