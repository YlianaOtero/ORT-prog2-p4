/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author ylian
 * 3) Leer un string y un carácter e indicar la cantidad de veces que aparece ese carácter en el string
 */
public class Prueba {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        String entrada = input.nextLine();
        char caracter = input.next().charAt(0);
        
        int cant = 0;
        
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == caracter) {
                cant++;
            }
        }
        
        System.out.println(cant);
    }
}
