package com.example;

public class Main {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        // Implementar solución
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 42;
        int intento;
        
        do {
            System.out.print("Adivina el número secreto: ");
            intento = scanner.nextInt();
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número.");
            } else {
                System.out.println("Intenta nuevamente.");
            }
        } while (intento != numeroSecreto);
    }

    }

}
