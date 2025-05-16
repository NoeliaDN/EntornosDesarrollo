package com.excepciones;

import java.util.Scanner;

public class noExceptions {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = num1 / num2; // Puede provocar división por cero
        System.out.println("Resultado de la división: " + resultado);

        int[] numeros = {10, 20, 30, 40, 50};
        System.out.print("Introduce un índice para ver su contenido: ");
        int indice = scanner.nextInt();
        
        System.out.println("Valor en el índice " + indice + ": " + numeros[indice]); // Puede generar ArrayIndexOutOfBoundsException

        scanner.close();
    }
}
