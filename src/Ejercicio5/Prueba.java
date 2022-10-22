/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author ylian
 * 5) Dado un string de largo máximo 100, que contiene letras en mayúsculas, indicar la secuencia más
larga de letras "A" consecutivas. Ejemplo: ABAABCA debe retornar 2.
 */
public class Prueba {
    public static void main(String[] args) {
        String frase = "ABAABCA";
        int largoMax = secuencia(frase);
        System.out.println(largoMax);
    }
    
    public static int secuencia(String frase) {
        String[] aux = crearArreglo(frase.length());
        
        for (int i = 0, j = 0; i < frase.length() && j < frase.length(); i++, j++) {
            while (i < frase.length() && j < frase.length() && frase.charAt(i) == 'A') {
                aux[j] += 'A';
                i++;
            }
        }
        
        int largoMax = stringMasLargo(aux);
        
        return largoMax;
    }
    
    public static int stringMasLargo(String[] aux) {
        int largoMax = 0;
        
        for (int i = 0; i < aux.length; i++) {
            if (aux[i] != null && aux[i].length() > largoMax) {
                largoMax = aux[i].length();
            }
        }
        
        return largoMax;
    }
    
    public static String[] crearArreglo(int dimension) {
        String[] arr = new String[dimension];
        
        for (int i = 0; i < dimension; i++) {
            arr[i] = "";
        }
        
        return arr;
    }
    
    public static void imprimirArreglo(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
