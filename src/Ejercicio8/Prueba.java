/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author ylian
 * 8) Dados dos strings, retornar "SI" si el primer string contiene todas las letras del segundo string o
"NO" en otro caso. Se asumen los dos string vienen en mayúscula.
 */
public class Prueba {
    public static void main(String[] args) {
        String s1 = "HOLA";
        String s2 = "OA";
        
        System.out.println(mismasLetras(s1, s2));
    }
    
    public static String mismasLetras(String frase1, String frase2) {
        String resultado = "NO";
        
        if (frase1.contains(frase2) || mismasLetrasEager(frase1, frase2)) {
            resultado = "SI";
        }
        
        return resultado;
    }
    
    public static boolean mismasLetrasEager(String frase1, String frase2) {
        boolean resultado = true;
        
        for (int i = 0; i < frase2.length() && resultado; i++) {
            String letraActual = String.valueOf(frase2.charAt(i));
            if (!frase1.contains(letraActual)) {
                resultado = false;
            }
        }
        
        return resultado;
    }
}
