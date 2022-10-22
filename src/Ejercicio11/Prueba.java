/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author ylian
 * 11) Escribir un programa que simule el lanzamiento de una moneda y muestra por pantalla la
frecuencia de los resultados de mil lanzamientos. Nota: investigar Math.random() que devuelve un
valor aleatorio real entre 0 y 1.
 */
public class Prueba {
    public static void main(String[] args) {
        frecuenciaMoneda();
    }
    
    public static void frecuenciaMoneda(){
        int cantUno = 0;
        int cantDos = 0;
        
        for (int i = 0; i < 1000; i++) {
            int rand = (int)(Math.random() * 2) + 1;
            if (rand == 1) {
                cantUno++;
            } else {
                cantDos++;
            }
        }
        
        System.out.println("En mil lanzamientos, un lado de la moneda salio " 
                            +cantUno +" veces, y el otro "+cantDos +" veces." );
        
    }
}
 