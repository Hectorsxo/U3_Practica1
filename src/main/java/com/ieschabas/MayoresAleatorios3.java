package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que calcula el mayor de tres números aleatorios entre 0 y 1000.
 *
 * Genera grupos de tres números aleatorios y determina el mayor de cada grupo.
 * El proceso se repite tantas veces como indique el usuario.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class MayoresAleatorios3 {

    /**
     * Constructor por defecto de MayoresAleatorios3.
     */
    public MayoresAleatorios3() {
    }

    /**
     * Devuelve el mayor de tres números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @return El número mayor entre a, b y c.
     */
    public int max3(int a, int b, int c) {
        int mayor = a; // Se asume que el primero es el mayor

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    /**
     * Genera un array que contiene los valores máximos de varios grupos
     * de tres números aleatorios entre 0 y 1000.
     *
     * @param repeticiones Número de grupos (tríos) a generar.
     * @param rng Objeto Random usado para generar los números aleatorios.
     * @return Un array con los valores máximos de cada trío.
     * @throws IllegalArgumentException si rng es null o si repeticiones es negativo.
     */
    public int[] generarMaximos3(int repeticiones, Random rng) {
        if (rng == null) {
            throw new IllegalArgumentException("El generador Random no puede ser nulo.");
        }
        if (repeticiones < 0) {
            throw new IllegalArgumentException("El número de repeticiones no puede ser negativo.");
        }

        int[] resultados = new int[repeticiones];

        // Genera los tríos y calcula el máximo de cada uno
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001);
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);

            resultados[i] = max3(a, b, c);
        }

        return resultados;
    }
}

    /**
     * Método principal. Pide al usuario el número de repeticiones,
     * genera los máximos de cada trío aleatorio y los muestra por consola.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        MayoresAleatorios3 comparador = new MayoresAleatorios3(); // Crear objeto para usar métodos no estáticos
        int repeticiones;

        // Solicita y valida el número de repeticiones
        do {
            System.out.print("Introduce el número de repeticiones (DEBE SER 20 PARA ESTE EJERCICIO): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada no válida
            }

            repeticiones = scanner.nextInt();

            if (repeticiones <= 0) {
                System.out.println("Las repeticiones deben ser un número positivo.");
            }

        } while (repeticiones <= 0);

        // Genera los valores máximos usando el objeto
        int[] maximos = comparador.generarMaximos3(repeticiones, rng);

        // Muestra los resultados
        System.out.println("\nMayores de cada uno de los " + repeticiones +
                " tríos de números aleatorios (0–1000):");
        for (int max : maximos) {
            System.out.println(max);
        }

        scanner.close(); // Cierra el Scanner
    }*/

