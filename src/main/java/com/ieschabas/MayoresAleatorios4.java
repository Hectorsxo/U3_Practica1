package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 9: Programa que devuelve el mayor de cuatro números aleatorios entre 0 y 1000.
 *
 * Esta clase genera cuartetos de números aleatorios y determina el mayor de cada grupo.
 * El proceso se puede repetir varias veces según indique el usuario (por ejemplo, 20 repeticiones).
 *
 * Métodos principales:
 *
 * max4(int a, int b, int c, int d)
 *  - Devuelve el mayor de los cuatro números proporcionados.
 *
 * generarMaximos4(int repeticiones, Random rng)
 *  - Genera un arreglo con los máximos de los cuartetos aleatorios.
 *  - Si repeticiones <= 0, muestra un mensaje indicando que no se permiten números negativos
 *    y solicita nuevamente la entrada.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class MayoresAleatorios4 {

    /**
     * Devuelve el mayor de cuatro números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @param d Cuarto número.
     * @return El valor máximo entre a, b, c y d.
     */
    public static int max4(int a, int b, int c, int d) {
        int mayor = a; // Asumimos que el primero es el mayor inicialmente

        // Comparamos sucesivamente con los otros tres números
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        if (d > mayor) {
            mayor = d;
        }

        return mayor;
    }

    /**
     * Genera un arreglo de enteros que contiene los máximos de varios
     * cuartetos de números aleatorios comprendidos entre 0 y 1000.
     *
     * @param repeticiones Número de grupos (cuartetos) a generar.
     * @param rng Instancia de Random usada para generar los números aleatorios.
     * @return Un arreglo con los valores máximos de cada cuarteto.
     */
    public static int[] generarMaximos4(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];

        // Genera "repeticiones" grupos de 4 números aleatorios y guarda el mayor de cada uno
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001); // Genera un número entre 0 y 1000 (inclusive)
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            int d = rng.nextInt(1001);

            resultados[i] = max4(a, b, c, d);
        }

        return resultados;
    }

    /**
     * Método principal que solicita al usuario un número de repeticiones,
     * genera los máximos de cuartetos aleatorios y los muestra por consola.
     *
     * Según el enunciado del ejercicio, se deben generar 20 cuartetos.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;

        // Solicitud y validación del número de repeticiones
        do {
            System.out.print("Introduce el número de repeticiones (DEBEN SER 20 COMO INDICA EL ENUNCIADO): ");

            // Verifica que la entrada sea un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada inválida
            }

            repeticiones = scanner.nextInt();

            // Comprueba que el número sea positivo
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser un número negativo.");
            }

        } while (repeticiones <= 0);

        // Generación de máximos
        int[] maximos = generarMaximos4(repeticiones, rng);

        // Salida de resultados
        System.out.println("\nMayores de cada cuarteto de números aleatorios (0–1000):");
        for (int valor : maximos) {
            System.out.println(valor);
        }

        // Cierra el scanner para liberar recursos
        scanner.close();
    }
}

