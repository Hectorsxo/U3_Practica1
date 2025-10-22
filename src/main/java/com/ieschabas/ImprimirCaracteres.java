package com.ieschabas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Programa que imprime caracteres y genera repeticiones aleatorias del abecedario.
 *
 * Permite:
 * - Repetir un carácter un número determinado de veces.
 * - Generar repeticiones aleatorias para cada letra del abecedario (a–z).
 * - Construir una cadena concatenando cada letra repetida según un mapa de repeticiones.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class ImprimirCaracteres {

    /**
     * Constructor por defecto de ImprimirCaracteres.
     */
    public ImprimirCaracteres(){

    }

    /**
     * Repite un carácter un número determinado de veces.
     *
     * @param c     Carácter a repetir.
     * @param veces Número de repeticiones (debe ser mayor o igual a 0).
     * @return Cadena formada por el carácter repetido el número de veces indicado.
     * @throws IllegalArgumentException Si el número de repeticiones es negativo.
     */
    public static String repetirCaracter(char c, int veces) {
        if (veces < 0) {
            throw new IllegalArgumentException("Las veces no pueden ser un número negativo");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < veces; i++) {
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Genera un mapa ordenado con las letras del abecedario (a–z)
     * y un número aleatorio de repeticiones para cada una.
     *
     * @param rng Instancia de {@link Random} usada para generar los números aleatorios.
     * @return Mapa donde cada letra se asocia con un número aleatorio entre 1 y 30.
     */
    public static LinkedHashMap<Character, Integer> generarRepeticionesAbecedario(Random rng) {
        LinkedHashMap<Character, Integer> repeticiones = new LinkedHashMap<>();

        for (char letra = 'a'; letra <= 'z'; letra++) {
            int veces = rng.nextInt(30) + 1; // entre 1 y 30
            repeticiones.put(letra, veces);
        }
        return repeticiones;
    }

    /**
     * Construye una cadena que contiene cada letra del abecedario
     * repetida según el número de veces indicado en el mapa recibido.
     *
     * @param repeticiones Mapa que asocia letras con su número de repeticiones.
     * @return Cadena con las letras repetidas, separadas por saltos de línea.
     */
    public static String construirSalidaAbecedario(Map<Character, Integer> repeticiones) {
        StringBuilder salida = new StringBuilder();

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
     * {@link #repetirCaracter(char, int)}. Luego genera automáticamente repeticiones
     * aleatorias para todas las letras del abecedario mediante
     * {@link #generarRepeticionesAbecedario(Random)} y muestra la salida construida
     * con {@link #construirSalidaAbecedario(Map)}.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        char caracter;
        int veces;

        // --- Entrada de usuario ---
        System.out.print("Introduce un carácter: ");
        String input = scanner.nextLine();

        while (input.isEmpty()) {
            System.out.print("Entrada vacía. Introduce un carácter: ");
            input = scanner.nextLine();
        }

        caracter = input.charAt(0);

        do {
            System.out.print("Introduce el número de veces a repetir (>= 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }

            veces = scanner.nextInt();

            if (veces < 0) {
                System.out.println("Las veces no pueden ser un número negativo");
            }

        } while (veces < 0);

        // --- Prueba de repetición ---
        System.out.println("\nResultado de repetirCaracter('" + caracter + "', " + veces + "):");
        System.out.println(repetirCaracter(caracter, veces));

        // --- Repeticiones aleatorias del abecedario ---
        System.out.println("\nGenerando repeticiones aleatorias para el abecedario (a–z)...");
        LinkedHashMap<Character, Integer> repAbc = generarRepeticionesAbecedario(rng);
        String salidaAbc = construirSalidaAbecedario(repAbc);

        System.out.println("\nSalida del abecedario:");
        System.out.print(salidaAbc);

        scanner.close();
    }
}
