package com.excepciones;

public class exception1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int resultado = a / b; // Esto generará una excepción de tipo ArithmeticException
        System.out.println("Resultado: " + resultado);
    }
}