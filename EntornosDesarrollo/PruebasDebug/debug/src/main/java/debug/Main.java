package debug;
//package com.pruebas2;

public class Main {

    public static void main(String[] args) {

        //System.out.println(determinarParidad(5));
        //System.out.println(calcularSumaParesError(1,7));
        int [] v1 = {2, -3, 10, 2};
        System.out.println(encontrarMaximoError(v1));
        
    }


    
    
    
    public static String determinarParidad(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    
    public static int calcularFactorial(int numero) {        
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

 
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String obtenerDiaSemana(int dia) {
        //switch (dia) {
          //  case 1: return "Lunes";
            //case 2: return "Martes";
            //case 3: return "Miércoles";
            //case 4: return "Jueves";
            //case 5: return "Viernes";
            //case 6: return "Sábado";
            //case 7: return "Domingo";
            //default: return "Día inválido";
        //}

        //Versión más corta:
        return switch (dia) {
            case 1 ->  "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 ->  "Jueves";
            case 5 ->  "Viernes";
            case 6 ->  "Sábado";
            case 7 ->  "Domingo";
            default ->  "Día inválido";
        };
    }


    
    public static String clasificarEdad(int edad) {
        if (edad < 0) {
            return "Edad inválida";
        } else if (edad < 18) {
            return "Menor de edad";
        } else if (edad <= 65) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    } 

    public static String validarContraseña(String contraseña) {
        if (contraseña == null || contraseña.length() < 8) {
            return "Contraseña inválida: muy corta";
        }
        boolean tieneMayuscula = contraseña.matches(".*[A-Z].*");
        boolean tieneMinuscula = contraseña.matches(".*[a-z].*");
        boolean tieneNumero = contraseña.matches(".*[0-9].*");
        boolean tieneEspecial = contraseña.matches(".*[!@#$%^&*()].*");

        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneEspecial) {
            return "Contraseña válida";
        } else {
            return "Contraseña inválida: no cumple los requisitos";
        }
    }

    public String clasificarNumero(int numero) {
        if (numero > 0) {
            if (numero % 2 == 0) {
                return "Positivo y Par";
            } else {
                return "Positivo e Impar";
            }
        } else if (numero < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }

    //FUNCIONES CON ERRORES:
    
    public static int calcularSumaParesError(int inicio, int fin) {
        int suma = 0;
        for (int i = inicio; i <= fin; i++) {          
            if (i % 2 == 1) { 
                suma += i;
            }
        }
        return suma;
    }

    public static int calcularFactorialError(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
                factorial += i; 
        }
        return factorial;
    }
    
    public static int encontrarMaximoError(int[] arr) {
       // int max = 0; 

       //Cambiamos esto, porque si hay negativos no funciona:
       int max = Integer.MIN_VALUE; // Valor mínimo posible para un entero
       
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}