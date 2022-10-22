/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
import java.lang.*;
/**
 *
 * @author ylian
 * 2) Escribir el código necesario para mostrar el uso de los siguientes métodos de Math: max, min, abs,
pow, sqrt. Investigar cuáles otros métodos están disponibles. 
 */
public class DemostracionMath {
    public static void main(String args[]) {
        int num1 = 19;
        int num2 = 144;
        
        int max = Math.max(19, 144);
        int min = Math.min(19, 144);
        
        int abs = Math.abs(19 - 144);
        
        double pow = Math.pow(144, 19);
        double sqrt = Math.sqrt(144);
        
        System.out.println("max(" +num1 +", " +num2 +") = " +max);
        System.out.println("min(" +num1 +", " +num2 +") = " +min);
        System.out.println("abs(" +num1 +" - " +num2 +") = " +abs);
        System.out.println("pow(" +num2 +", " +num1 +") = " +pow);
        System.out.println("sqrt(" +num2 +") = " +sqrt);
    }
}
