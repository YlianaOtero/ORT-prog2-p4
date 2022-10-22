/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * 1) Escribir el código necesario que ejemplifique el uso de los siguientes métodos de String: equals,
compareTo, indexOf, length, toUpperCase, toLowerCase, equalsIgnoreCase, trim. 
 */
public class DemostracionString {
    private String ejemplo1;
    private String ejemplo2;
    
    /**
     * @param args the command line arguments
     */
    
    public DemostracionString() {
        this.ejemplo1 = "  String de ejemplo numero 1...  ";
        this.ejemplo2 = "  String de ejemplo numero 2...  ";
    }
    
    public DemostracionString(String unString1) {
        this.ejemplo1 = unString1;
        this.ejemplo2 = "String de ejemplo numero 2...";
    }
    
    public DemostracionString(String unString1, String unString2) {
        this.ejemplo1 = unString1;
        this.ejemplo2 = unString2;
    }
    
    public static void ejemplificarequals(DemostracionString demo) {
        System.out.println(demo);
        System.out.println();
        
        boolean sonIguales = demo.ejemplo1.equals(demo.ejemplo2);
        
        System.out.println("Si usamos equals entre estos ejemplos, el resultado es: " +sonIguales);
    }
    
    public static void ejemplificarequalsIgnoreCase(DemostracionString demo) {
        System.out.println(demo);
        System.out.println();
        
        boolean sonIguales = demo.ejemplo1.equalsIgnoreCase(demo.ejemplo2);
        
        System.out.println("Si usamos equalsIgnoreCase entre estos ejemplos, el resultado es: " +sonIguales);
    }
    
    public static void ejemplificarcompareTo(DemostracionString demo) {
        System.out.println(demo);
        System.out.println();
        
        int valor = demo.ejemplo1.compareTo(demo.ejemplo2);
        
        System.out.println("Si usamos compareTo entre estos ejemplos, el resultado es: " +valor);
    }
    
    public static void ejemplificarindexOf(DemostracionString demo, char letraEn1, char letraEn2) {
        System.out.println(demo);
        System.out.println();
        
        int indexEn1 = demo.ejemplo1.indexOf(letraEn1);
        int indexEn2 = demo.ejemplo2.indexOf(letraEn2);
        
        System.out.println("Si usamos indexOf("+letraEn1+") en el ejemplo 1, el resultado es: " +indexEn1);
        System.out.println("Si usamos indexOf("+letraEn2+") en el ejemplo 2, el resultado es: " +indexEn2);
    }
    
    public static void ejemplificarlength(DemostracionString demo) {
        System.out.println(demo);
        System.out.println();
        
        int largo1 = demo.ejemplo1.length();
        int largo2 = demo.ejemplo2.length();
        
        System.out.println("Si usamos length en el ejemplo 1, el resultado es: " +largo1);
        System.out.println("Si usamos length en el ejemplo 2, el resultado es: " +largo2);
    }
    
        public static void ejemplificartrim(DemostracionString demo) {
        System.out.println(demo);
        System.out.println();
        
        String nuevo1 = demo.ejemplo1.trim();
        String nuevo2 = demo.ejemplo2.trim();
        
        System.out.println("Si usamos trim en el ejemplo 1, el resultado es: " +nuevo1);
        System.out.println("Si usamos trim en el ejemplo 2, el resultado es: " +nuevo2);
    }
    
    
    public static void ejemplificartoLowerCase(DemostracionString demo) {
        System.out.println("Antes de utilizar toLowerCase:");
        System.out.println(demo);
        System.out.println();
        
        String ejemplo1_minus = demo.ejemplo1.toLowerCase();
        String ejemplo2_minus = demo.ejemplo2.toLowerCase();
        
        DemostracionString demo2 = new DemostracionString(ejemplo1_minus, ejemplo2_minus);
        
        System.out.println("Despues de utilizar toLowerCase:");
        System.out.println(demo2);
    }
    
    public static void ejemplificartoUpperCase(DemostracionString demo) {
        System.out.println("Antes de utilizar toUpperCase:");
        System.out.println(demo);
        System.out.println();
        
        String ejemplo1_mayus = demo.ejemplo1.toUpperCase();
        String ejemplo2_mayus = demo.ejemplo2.toUpperCase();
        
        DemostracionString demo2 = new DemostracionString(ejemplo1_mayus, ejemplo2_mayus);
        
        System.out.println("Despues de utilizar toUpperCase:");
        System.out.println(demo2);
    }
    
    
    
    @Override
    public String toString() {
        return "El primer string de ejemplo es " +this.ejemplo1 + ", y el segundo es " +this.ejemplo2;
    }
    
}
