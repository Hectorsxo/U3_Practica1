package com.ieschabas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 10: Programa que imprime caracteres y genera repeticiones del abecedario.
 *
 * Esta clase permite:
 * - Repetir un carácter un número determinado de veces.
 * - Generar repeticiones aleatorias para cada letra del abecedario (a-z).
 * - Construir una salida concatenando cada letra repetida según un mapa de repeticiones.
 *
 * Métodos principales:
 *
 * public static String repetirCaracter(char c, int veces)
 *  - Devuelve el carácter repetido el número de veces indicado.
 *  - Si veces < 0, muestra un mensaje indicando que no se permiten números negativos y solicita nuevamente la entrada.
 *
 * public static LinkedHashMap<Character, Integer> generarRepeticionesAbecedario(Random rng)
 *  - Genera un mapa con repeticiones aleatorias entre 1 y 30 para cada letra de 'a' a 'z'.
 *
 * public static String construirSalidaAbecedario(Map<Character, Integer> repeticiones)
 *  - Construye una cadena concatenando cada letra repetida según el mapa de repeticiones.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class ImprimirCaracteres {

    /**
     * Repite un carácter un número determinado de veces.
     *
     * @param c      El carácter a repetir.
     * @param veces  El número de repeticiones (debe ser >= 0).
     * @return Una cadena formada por el carácter repetido el número indicado de veces.
     * @throws IllegalArgumentException Si el número de repeticiones es negativo.
     */
    public static String repetirCaracter(char c, int veces) {
        if (veces < 0) {
            throw new IllegalArgumentException("Las veces no pueden ser un número negativo");
        }

        // Usa StringBuilder para construir la cadena de forma eficiente
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Genera un mapa ordenado con las letras del abecedario (a-z)
     * y un número aleatorio de repeticiones para cada una.
     *
     * @param rng Instancia de {@link java.util.Random} usada para generar números aleatorios.
     * @return Un {@link LinkedHashMap} donde cada letra se asocia con un número aleatorio entre 1 y 30.
     */
    public static LinkedHashMap<Character, Integer> generarRepeticionesAbecedario(Random rng) {
        LinkedHashMap<Character, Integer> repeticiones = new LinkedHashMap<>();

        // Genera repeticiones aleatorias para cada letra
        for (char letra = 'a'; letra <= 'z'; letra++) {
            int veces = rng.nextInt(30) + 1; // Genera un número entre 1 y 30
            repeticiones.put(letra, veces);
        }
        return repeticiones;
    }

    /**
     * Construye una cadena que contiene cada letra del abecedario
     * repetida según el número de veces indicado en el mapa de entrada.
     *
     * @param repeticiones Mapa que asocia letras con el número de repeticiones.
     * @return Una cadena con las repeticiones de cada letra, separadas por saltos de línea.
     */
    public static String construirSalidaAbecedario(Map<Character, Integer> repeticiones) {
        StringBuilder salida = new StringBuilder();

        // Recorre las entradas del mapa y genera las repeticiones de cada letra
        for (Map.Entry<Character, Integer> entrada : repeticiones.entrySet()) {
            char letra = entrada.getKey();
            int veces = entrada.getValue();
            salida.append(repetirCaracter(letra, veces)).append("\n");
        }

        return salida.toString();
    }

    /**
     * Método principal que permite al usuario interactuar con el programa.
     *
     * Primero solicita un carácter y un número de repeticiones para probar el método
     * {@link #repetirCaracter(char, int)}. Luego, genera automáticamente repeticiones
     * aleatorias para todas las letras del abecedario usando {@link #generarRepeticionesAbecedario(Random)}
     * y las muestra por pantalla mediante {@link #construirSalidaAbecedario(Map)}.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        // --- Entrada para repetir un carácter específico ---
        char caracter;
        int veces;

        System.out.print("Introduce un carácter: ");
        String input = scanner.nextLine();

        // Valida que el usuario no deje la entrada vacía
        while (input.isEmpty()) {
            System.out.print("Entrada vacía. Introduce un carácter: ");
            input = scanner.nextLine();
        }

        caracter = input.charAt(0);

        // Solicita el número de repeticiones
        do {
            System.out.print("Introduce el número de veces a repetir (>= 0): ");

            // Valida que la entrada sea un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }

            veces = scanner.nextInt();

            if (veces < 0) {
                System.out.println("Las veces no pueden ser un número negativo");
            }

        } while (veces < 0);

        // Muestra el resultado del método repetirCaracter
        System.out.println("\nResultado de repetirCaracter('" + caracter + "', " + veces + "):");
        System.out.println(repetirCaracter(caracter, veces));

        // --- Generación aleatoria para el abecedario ---
        System.out.println("\nGenerando repeticiones aleatorias para el abecedario (a-z)...");
        LinkedHashMap<Character, Integer> repAbc = generarRepeticionesAbecedario(rng);
        String salidaAbc = construirSalidaAbecedario(repAbc);

        // Muestra la salida completa del abecedario con repeticiones
        System.out.println("\nSalida del abecedario:");
        System.out.print(salidaAbc);

        // Cierra el Scanner
        scanner.close();
    }
}
