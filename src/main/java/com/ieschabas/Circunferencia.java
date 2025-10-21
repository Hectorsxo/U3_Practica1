package com.ieschabas;

import java.util.Scanner;

public class Circunferencia {

    public static double area(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        return Math.PI * radio * radio;
    }


    public static double longitud(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;

        do {
            System.out.print("Introduce el radio de la circunferencia (debe ser >= 0): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next(); // descartar entrada inválida
            }
            radio = scanner.nextDouble();

            if (radio < 0) {
                System.out.println("El radio no puede ser un número negativo");
            }
        } while (radio < 0);

        // Cálculos
        double area = area(radio);
        double longitud = longitud(radio);

        // Resultados
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Longitud: %.2f%n", longitud);
    }
}