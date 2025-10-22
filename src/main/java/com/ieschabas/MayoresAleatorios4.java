package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que calcula el mayor de cuatro números aleatorios entre 0 y 1000.
 *
 * Genera grupos de cuatro números aleatorios y determina el mayor de cada grupo.
 * El proceso se repite tantas veces como indique el usuario.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class MayoresAleatorios4 {

    /**
     * Constructor por defecto de MayoresAleatorios4.
     */
    public MayoresAleatorios4(){

    }

    /**
     * Devuelve el mayor de cuatro números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @param d Cuarto número.
     * @return El número mayor entre a, b, c y d.
     */
    public static int max4(int a, int b, int c, int d) {
        int mayor = a; // Se asume que el primero es el mayor

        // Compara con los demás números
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
     * Genera un array que contiene los valores máximos de varios grupos
     * de cuatro números aleatorios entre 0 y 1000.
     *
     * @param repeticiones Número de grupos (cuartetos) a generar.
     * @param rng Objeto Random usado para generar los números aleatorios.
     * @return Un array con los valores máximos de cada grupo.
     */
    public static int[] generarMaximos4(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];

        // Genera los grupos y calcula el máximo de cada uno
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001);
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            int d = rng.nextInt(1001);

            resultados[i] = max4(a, b, c, d);
        }

        return resultados;
    }

    /**
     * Método principal. Pide al usuario el número de repeticiones,
     * genera los máximos de cada grupo aleatorio y los muestra por consola.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones;

        // Solicita y valida el número de repeticiones
        do {
            System.out.print("Introduce el número de repeticiones (DEBEN SER 20 COMO INDICA EL ENUNCIADO): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada no válida
            }

            repeticiones = scanner.nextInt();

            if (repeticiones <= 0) {
                System.out.println("Las repeticiones deben ser un número positivo.");
            }

        } while (repeticiones <= 0);

        // Genera los valores máximos
        int[] maximos = generarMaximos4(repeticiones, rng);

        // Muestra los resultados
        System.out.println("\nMayores de cada cuarteto de números aleatorios (0–1000):");
        for (int valor : maximos) {
            System.out.println(valor);
        }

        scanner.close(); // Cierra el Scanner
    }
}


