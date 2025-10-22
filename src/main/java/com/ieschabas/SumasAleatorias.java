package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que calcula la suma de dos números enteros aleatorios entre 0 y 1000.
 *
 * Permite generar varios pares de números aleatorios, sumar sus valores y mostrar los resultados.
 * El número de repeticiones lo indica el usuario.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class SumasAleatorias {

    /**
     * Constructor por defecto de SumasAleatorias.
     */
    public SumasAleatorias(){

    }

    /**
     * Genera dos números aleatorios entre 0 y 1000 y devuelve su suma.
     *
     * @param rng Objeto de tipo Random utilizado para generar los números aleatorios.
     * @return La suma de dos números aleatorios entre 0 y 1000.
     */
    public static int sumaDosAleatorios(Random rng) {
        int a = rng.nextInt(1001); // Primer número aleatorio
        int b = rng.nextInt(1001); // Segundo número aleatorio
        return a + b;              // Devuelve la suma
    }

    /**
     * Genera un array con los resultados de varias sumas aleatorias.
     *
     * @param repeticiones Número de sumas que se deben generar.
     * @param rng Objeto Random para generar los números aleatorios.
     * @return Un array con las sumas generadas.
     */
    public static int[] generarSumas(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];

        // Genera tantas sumas como indique el usuario
        for (int i = 0; i < repeticiones; i++) {
            resultados[i] = sumaDosAleatorios(rng);
        }

        return resultados;
    }

    /**
     * Método principal. Pide al usuario cuántas sumas desea generar,
     * calcula las sumas aleatorias y muestra los resultados por consola.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        int repeticiones;

        // Solicita y valida el número de repeticiones
        do {
            System.out.print("Introduce el número de repeticiones (DEBE SER 20 SEGÚN EL ENUNCIADO): ");

            // Comprueba que el usuario introduzca un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada inválida
            }

            repeticiones = scanner.nextInt();

            // Verifica que el número sea positivo
            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser negativas ni cero.");
            }

        } while (repeticiones <= 0);

        // Genera las sumas aleatorias
        int[] sumas = generarSumas(repeticiones, rng);

        // Muestra los resultados
        System.out.println("\nResultados de las " + repeticiones + " sumas aleatorias:");
        for (int suma : sumas) {
            System.out.println(suma);
        }

        scanner.close();
    }
}
