package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 /**
 * Ejercicio 5: Programa que calcula la suma de dos enteros aleatorios entre 0 y 1000.
 *
 * Esta clase permite generar pares de números aleatorios, calcular su suma y repetir
 * el proceso varias veces según indique el usuario (por ejemplo, 20 repeticiones).
 *
 * Métodos principales:
 *
 * public static int sumaDosAleatorios(Random rng)
 *  - Devuelve la suma de dos números aleatorios entre 0 y 1000.
 *
 * public static int[] generarSumas(int repeticiones, Random rng)
 *  - Genera un arreglo con las sumas de los pares aleatorios repetidas la cantidad indicada.
 *  - Si repeticiones <= 0, muestra un mensaje indicando que no se permiten números negativos
 *    y solicita nuevamente la entrada.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class SumasAleatorias {

    /**
     * Genera dos números aleatorios entre 0 y 1000 (inclusive)
     * y devuelve la suma de ambos.
     *
     * @param rng Instancia de {@link java.util.Random} utilizada para generar los números aleatorios.
     * @return La suma de dos números aleatorios en el rango [0, 1000].
     */
    public static int sumaDosAleatorios(Random rng) {
        int a = rng.nextInt(1001); // Primer número aleatorio
        int b = rng.nextInt(1001); // Segundo número aleatorio
        return a + b;              // Devuelve la suma
    }

    /**
     * Genera un arreglo con el resultado de varias sumas aleatorias.
     *
     * @param repeticiones Número de sumas que se deben generar.
     * @param rng Instancia de {@link java.util.Random} usada para la generación de números aleatorios.
     * @return Un arreglo de enteros que contiene las sumas generadas.
     */
    public static int[] generarSumas(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];

        // Genera tantas sumas aleatorias como indique el usuario
        for (int i = 0; i < repeticiones; i++) {
            resultados[i] = sumaDosAleatorios(rng);
        }

        return resultados;
    }

    /**
     * Método principal que solicita al usuario cuántas sumas desea generar,
     * calcula dichas sumas y las muestra por consola.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;

        // --- Solicitud y validación del número de repeticiones ---
        do {
            System.out.print("Introduce el número de repeticiones (DEBE SER 20 SEGÚN EL ENUNCIADO): ");

            // Comprueba que el usuario introduzca un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta entrada inválida
            }

            repeticiones = scanner.nextInt();

            // Verifica que el número sea positivo
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser un número negativo ni cero.");
            }

        } while (repeticiones <= 0);

        // --- Generación de sumas aleatorias ---
        int[] sumas = generarSumas(repeticiones, rng);

        // --- Impresión de resultados ---
        System.out.println("\nResultados de las " + repeticiones + " sumas aleatorias:");
        for (int suma : sumas) {
            System.out.println(suma);
        }

        // Cierre del scanner
        scanner.close();
    }
}
