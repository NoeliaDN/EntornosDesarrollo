package com.excepciones;

public class exception2 {

        public static void main(String[] args) {
            try {
                int resultado = 10 / 0;
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero no permitida.");
            }
        }
}