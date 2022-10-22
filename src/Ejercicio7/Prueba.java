/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author ylian
 * 7) Dada una frase (string) y dos secuencias de largo máximo 100, retornar "SI" si las dos secuencias
aparecen la misma cantidad de veces en el string. En otro caso retornar "NO".
 */
public class Prueba {
    public static void main(String[] args){
        String frase =  "gatovacaperroleonperrogatogatoovejaperro";
        String secuencia1 = "gato";
        String secuencia2 = "oveja";
        
        System.out.println(mismaCantidad(frase, secuencia1, secuencia2));
        System.out.println(cantidadSecuenciaEnFrase(frase, secuencia1));
        System.out.println(cantidadSecuenciaEnFrase(frase, secuencia2));

      
    }
    
    public static String mismaCantidad(String frase, String secuencia1, String secuencia2) {
        String res = "NO";
        
        if (secuencia1.length() <= frase.length() && secuencia2.length() <= frase.length()) {
            if (cantidadSecuenciaEnFrase(frase, secuencia1) == cantidadSecuenciaEnFrase(frase, secuencia2)) {
                res = "SI";
            }
        }
        
        return res;
        
    }
    
    public static int cantidadSecuenciaEnFrase(String frase, String secuencia) {
        int cant = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            int j = 0;
            
            String actualFrase = String.valueOf(frase.charAt(i));
            String actualSecuencia = String.valueOf(secuencia.charAt(j));
            
            while (i < frase.length()-1 && j < secuencia.length()-1 && actualFrase.equals(actualSecuencia)) {
                i++;
                j++;
                actualFrase = String.valueOf(frase.charAt(i));
                actualSecuencia = String.valueOf(secuencia.charAt(j));
            } 
            
            if (j == secuencia.length() - 1 && actualFrase.equals(actualSecuencia)) {
                cant++;
            }
        }
        
        return cant;
    }
    
    public static String[] crearArreglo(int dimension) {
        String[] arr = new String[dimension];
        
        for (int i = 0; i < dimension; i++) {
            arr[i] = "";
        }
        
        return arr;
    }
    
    public static void imprimirArreglo(String[] arr) {
        for (String arr1 : arr) {
            System.out.println(arr1);
        }
    }
}
