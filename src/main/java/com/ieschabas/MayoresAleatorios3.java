package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 8: Programa que devuelve el mayor de tres números aleatorios entre 0 y 1000.
 *
 * Esta clase genera tríos de números aleatorios y determina el mayor de cada trío.
 * El proceso se puede repetir varias veces según indique el usuario (por ejemplo, 20 repeticiones).
 *
 * Métodos principales:
 *
 * public static int max3(int a, int b, int c)
 *  - Devuelve el mayor de los tres números proporcionados.
 *
 * public static int[] generarMaximos3(int repeticiones, Random rng)
 *  - Genera un arreglo con los máximos de los tríos aleatorios.
 *  - Si repeticiones <= 0, muestra un mensaje indicando que no se permiten números negativos
 *    y solicita nuevamente la entrada.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class MayoresAleatorios3 {

    /**
     * Devuelve el mayor de tres números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @return El valor mayor entre {@code a}, {@code b} y {@code c}.
     */
    public static int max3(int a, int b, int c) {
        int mayor = a; // Asume que el primero es el mayor

        // Compara con el segundo número
        if (b > mayor) {
            mayor = b;
        }

        // Compara con el tercero
        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    /**
     * Genera un arreglo de números que contienen los valores máximos
     * de múltiples tríos de números aleatorios generados entre 0 y 1000.
     *
     * @param repeticiones Número de tríos a generar.
     * @param rng Instancia de {@link java.util.Random} utilizada para generar los números aleatorios.
     * @return Un arreglo de enteros donde cada elemento es el mayor de un trío generado aleatoriamente.
     */
    public static int[] generarMaximos3(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];

        // Genera "repeticiones" tríos de números aleatorios y guarda el mayor de cada uno
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001); // Número aleatorio entre [0, 1000]
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);

            resultados[i] = max3(a, b, c);
        }

        return resultados;
    }

    /**
     * Método principal que solicita al usuario cuántas repeticiones realizar,
     * genera los máximos de los tríos aleatorios y los muestra por pantalla.
     *
     * Por consigna del ejercicio, el usuario debe introducir 20 repeticiones.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;

        // --- Solicitud y validación del número de repeticiones ---
        do {
            System.out.print("Introduce el número de repeticiones (DEBE SER 20 PARA ESTE EJERCICIO): ");

            // Verifica que la entrada sea un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada incorrecta
            }

            repeticiones = scanner.nextInt();

            // Valida que el número sea positivo
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser un número negativo");
            }

        } while (repeticiones <= 0);

        // --- Generación de resultados ---
        int[] maximos = generarMaximos3(repeticiones, rng);

        // --- Salida de resultados ---
        System.out.println("Mayores de cada uno de los " + repeticiones + " tríos de números aleatorios (0–1000):");
        for (int max : maximos) {
            System.out.println(max);
        }

        // Cierra el Scanner
        scanner.close();
    }
}
