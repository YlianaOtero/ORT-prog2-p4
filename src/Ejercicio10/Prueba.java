/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author ylian
 * 10) Dado un string (se asume que contendrá letras y dígitos) mostrar por pantalla qué porcentaje son
las vocales y qué porcentaje son dígitos.
Ej. "9holA888" tiene 25% de vocales y 50% de dígitos
 */
public class Prueba {
    public static void main(String[] args) {
        String ej = "9holA888";
        Porcentajes(ej);
    }
    
    public static void Porcentajes(String frase) {
        int cantLetras = 0;
        int cantVocales = 0;
        int cantDigitos = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            String actual = String.valueOf(frase.charAt(i));
            if (esDigito(actual)) {
                cantDigitos++;
            } else {
                cantLetras++;
                if (esVocal(actual)) {
                    cantVocales++;
                }
            }
        }
        
        double porcentajeVocales = porcentaje(cantVocales, cantLetras);
        double porcentajeDigitos = porcentaje(cantDigitos, frase.length());
        
        System.out.println(frase + " tiene " +porcentajeVocales + "% de vocales y " +porcentajeDigitos +"% de digitos.");
        
    }
    
    public static double porcentaje(int cant, int total) {
        return 100 * cant / total;
    }
    
    public static boolean esVocal(String letra) {     
        String vocales = "AEIOU";
        boolean es = vocales.contains(letra);
        return es;
    }
    
    public static boolean esDigito(String letra) {     
        String digitos = "0123456789";
        boolean es = digitos.contains(letra);
        return es;
    }
}
