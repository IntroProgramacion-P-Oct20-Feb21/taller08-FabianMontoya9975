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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char valor;
        for(int i = 1; i <= 26; i++){
            valor = (char)(i + 96); // (97) >> a
                                    // (98) >> b
                                    // (99) >> c
                                    // (100) >> d
                                    // ...
                                    // (122) >> z
            for (int contador = 1; contador <= i; contador++){
                System.out.printf("%s", valor);
                // a
                // bb
                // ccc
                // dddd
                // eeeee
                // ffffff
                // ggggggg
                // hhhhhhhh
                // iiiiiiiii
                // jjjjjjjjjj
                // kkkkkkkkkkk
                // llllllllllll
                // mmmmmmmmmmmmm
                // nnnnnnnnnnnnnn
                // ooooooooooooooo
                // pppppppppppppppp
                // qqqqqqqqqqqqqqqqq
                // rrrrrrrrrrrrrrrrrr
                // sssssssssssssssssss
                // tttttttttttttttttttt
                // uuuuuuuuuuuuuuuuuuuuu
                // vvvvvvvvvvvvvvvvvvvvvv
                // wwwwwwwwwwwwwwwwwwwwwww
                // xxxxxxxxxxxxxxxxxxxxxxxx
                // yyyyyyyyyyyyyyyyyyyyyyyyy
                // zzzzzzzzzzzzzzzzzzzzzzzzzz
            }
            System.out.println();
        }
        
    }
   
}
