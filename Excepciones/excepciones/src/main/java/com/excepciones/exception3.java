package com.excepciones;

public class exception3 {
    
        public static void main(String[] args) {
            try {
                int[] numeros = {1, 2, 3};
                System.out.println(numeros[5]); // Error: Índice fuera de rango
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Has intentado acceder a una posición no válida en el array.");
            }
        }
    
}
