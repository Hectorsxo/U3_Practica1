package com.ieschabas;

import java.util.Scanner;

/**
 * Ejercicio 6: Programa que calcula el área y la longitud de una circunferencia.
 *
 * Esta clase permite al usuario introducir el radio de una circunferencia y calcula:
 * - Área = π * r^2
 * - Longitud = 2 * π * r
 *
 * Métodos principales:
 *
 * public static double area(double radio)
 *  - Devuelve el área de la circunferencia.
 *
 * public static double longitud(double radio)
 *  - Devuelve la longitud (circunferencia) correspondiente al radio.
 *
 * - Si el radio introducido es menor que 0, muestra un mensaje indicando que no se permiten
 *   números negativos y solicita nuevamente la entrada.

 * @author Héctor Crespo
 * @version 1.0
 */
public class Circunferencia {

    /**
     * Calcula el área de una circunferencia dado su radio.
     *
     * @param radio El radio de la circunferencia. Debe ser un valor no negativo.
     * @return El área de la circunferencia.
     * @throws IllegalArgumentException Si el radio es negativo.
     */
    public static double area(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        // Fórmula del área: π * r²
        return Math.PI * radio * radio;
    }

    /**
     * Calcula la longitud (perímetro) de una circunferencia dado su radio.
     *
     * @param radio El radio de la circunferencia. Debe ser un valor no negativo.
     * @return La longitud (perímetro) de la circunferencia.
     * @throws IllegalArgumentException Si el radio es negativo.
     */
    public static double longitud(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser un número negativo");
        }
        // Fórmula de la longitud: 2 * π * r
        return 2 * Math.PI * radio;
    }

    /**
     * Método principal que solicita al usuario el radio de una circunferencia,
     * valida la entrada y muestra por consola el área y la longitud calculadas.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radio;

        // Solicita repetidamente un radio válido (>= 0)
        do {
            System.out.print("Introduce el radio de la circunferencia (debe ser >= 0): ");

            // Valida que la entrada sea un número
            while (!scanner.hasNextDouble()) {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next(); // Descarta la entrada inválida
            }

            radio = scanner.nextDouble();

            if (radio < 0) {
                System.out.println("El radio no puede ser un número negativo");
            }

        } while (radio < 0); // Se repite hasta que el radio sea válido

        // Cálculos de área y longitud
        double area = area(radio);
        double longitud = longitud(radio);

        // Muestra los resultados con dos decimales
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Longitud: %.2f%n", longitud);

        // Cierre del Scanner para liberar recursos
        scanner.close();
    }
}
