package com.ieschabas;

import java.util.Scanner;

/**
 * Programa que calcula el área y la longitud de una circunferencia.
 *
 * Permite al usuario introducir el radio de una circunferencia y calcula:
 *
 * Área = π · r²
 * Longitud = 2 · π · r
 *
 * Si el usuario introduce un valor negativo, se muestra un mensaje de error
 * y se solicita nuevamente la entrada.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class Circunferencia {

    /**
     * Constructor por defecto de Circunferencia.
     */
    public Circunferencia() {
    }

    /**
     * Calcula el área de una circunferencia a partir de su radio.
     *
     * @param radio Radio de la circunferencia (debe ser mayor o igual que 0).
     * @return Área de la circunferencia.
     * @throws IllegalArgumentException Si el radio es negativo.
     */
    public double area(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        return Math.PI * radio * radio;
    }

    /**
     * Calcula la longitud (perímetro) de una circunferencia a partir de su radio.
     *
     * @param radio Radio de la circunferencia (debe ser mayor o igual que 0).
     * @return Longitud (perímetro) de la circunferencia.
     * @throws IllegalArgumentException Si el radio es negativo.
     */
    public double longitud(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        return 2 * Math.PI * radio;
    }

    /**
     * Método principal que solicita al usuario el radio de una circunferencia,
     * valida la entrada y muestra el área y la longitud correspondientes.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circunferencia circ = new Circunferencia(); // Crear un objeto para usar métodos no estáticos
        double radio;

        // Solicitud y validación de entrada
        do {
            System.out.print("Introduce el radio de la circunferencia (debe ser >= 0): ");

            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next();
            }

            radio = scanner.nextDouble();

            if (radio < 0) {
                System.out.println("El radio no puede ser un número negativo.");
            }

        } while (radio < 0);

        // Cálculos usando el objeto
        double area = circ.area(radio);
        double longitud = circ.longitud(radio);

        // Salida formateada
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Longitud: %.2f%n", longitud);

        scanner.close();
    }*/
}
