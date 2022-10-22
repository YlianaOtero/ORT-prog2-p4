/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author ylian
 * 4) Implementar un método propio que comprima un string, esto es que elimine los espacios en blanco.
 */
public class Prueba {
    public static void main(String[] args) {
        String miString = "Hola este es un ejemplo";
        miString = eliminarEspacios(miString);
        System.out.println(miString);
    }
    
    public static String eliminarEspacios(String unString) {
        String aux = "";
        
        for (int i = 0; i < unString.length(); i++) {
            char actual = unString.charAt(i);
            if (actual != ' ') {
                aux += actual;
            }
        }
        
        return aux;
    }
}
