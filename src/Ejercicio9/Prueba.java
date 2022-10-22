/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author ylian
 * 9) Dado un string (se asume que contendrá un mail válido, de 3 o más caracteres como nombre de
usuario), retornarlo en formato "oculto", esto es, dejando el primer y último caracter y sustituyendo
todos los del medio por "*".
Ej. "anaPEREZ@gmail.com", debe mostrar: "a******Z@gmail.com"
 */
public class Prueba {
    public static void main(String[] args) {
        String ej = "ylianaotero@gmail.com";
        System.out.println(formatoMail(ej));
    }
    
    public static String formatoMail(String correo) {
        String[] auxiliar = correo.split("@");
        String username = auxiliar[0];
        
        String oculto = String.valueOf(username.charAt(0));
        
        for (int i = 1; i < username.length() - 1; i++) {
            oculto += "*";
        }
        
        oculto += String.valueOf(username.charAt(username.length() - 1));
        
        oculto += "@" + auxiliar[1];
        
        return oculto;
    }
}
