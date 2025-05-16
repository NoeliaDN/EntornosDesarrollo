package com.excepciones;

import java.util.Scanner;

public class recover {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean exito = false;

        while (!exito) {
            try {
                System.out.print("Introduce un número: ");
                numero = Integer.parseInt(scanner.nextLine());
                exito = true; // Si la conversión es exitosa, salimos del bucle
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa solo números.");
            }
        }
        System.out.println("Número ingresado correctamente: " + numero);
    }
}
