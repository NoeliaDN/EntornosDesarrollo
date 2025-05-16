package com.excepciones;

public class error1 {
    
        public static void metodoRecursivo() {
            metodoRecursivo(); // Llamada infinita
        }
        
        public static void main(String[] args) {
            metodoRecursivo();
        }
    
}
