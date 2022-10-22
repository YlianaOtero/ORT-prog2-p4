/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author ylian
 * 6) Se reciben dos strings en minúsculas. El segundo contiene las mismas letras del primero
desordenadas, pero se agregó una letra más en algún lugar. Identificar cuál letra es.
Ejemplo hola y lboha, debe retornar b.
 * 
 */
public class Prueba {
    public static void main(String[] args) {
        String input1 = "hola";
        String input2 = "lboha";
        
        String letra = agregada(input1, input2);
        
        System.out.println(letra);
    }
    
    public static String agregada(String primera, String segunda){
        String letra = "";
        
        boolean encontrada = false;
        
        for (int i = 0; i < segunda.length() && !encontrada; i++) {
            String actual = String.valueOf(segunda.charAt(i));
            if (!primera.contains(actual)) {
                letra = actual;
                encontrada = true;
            }
        }
        
        return letra;
    }
}
