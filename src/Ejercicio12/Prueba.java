/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author ylian
 * 12) Ingresar los 3 coeficientes de una ecuación de segundo grado e indicar qué tipo de raíces tiene
(dos raíces reales diferentes, una raíz real doble o raíces imaginarias).
 */
public class Prueba {
    public static void main(String[] args) {
        System.out.println(tipoDeRaices(5,1,19));
    }
    
    public static String tipoDeRaices(double a, double b, double c) {
        String resultado = "";
        
        double discriminante = b*b - 4*a*c;
        
        if (discriminante > 0) {
            resultado = "Dos raices reales diferentes";
        } else if (discriminante == 0)  {
            resultado = "Una raiz real doble";
        } else {
            resultado = "Dos raices imaginarias";
        }
        
        return resultado;
    }
}
