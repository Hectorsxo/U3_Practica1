package com.ieschabas;

import java.util.Scanner;

/**
 * Ejercicio 7: Programa que devuelve el mayor de dos números enteros.
 *
 * Esta clase permite al usuario introducir dos números y determina cuál de ellos es mayor.
 *
 * Método principal:
 *
 * public static int max2(int a, int b)
 *  - Devuelve el valor mayor entre los dos números proporcionados.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Mayores {

    /**
     * Devuelve el mayor de dos números enteros.
     *
     * @param a El primer número a comparar.
     * @param b El segundo número a comparar.
     * @return El valor mayor entre {@code a} y {@code b}.
     */
    public static int max2(int a, int b) {
        // Si a es mayor que b, devuelve a; en caso contrario, devuelve b
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Método principal que solicita al usuario dos números enteros,
     * los compara usando {@link #max2(int, int)} y muestra cuál es el mayor.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        // Solicita al usuario el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Llama al método max2 para obtener el mayor
        int mayor = max2(num1, num2);

        // Muestra el resultado por consola
        System.out.println("El mayor de " + num1 + " y " + num2 + " es: " + mayor);

        // Cierra el scanner para liberar recursos
        scanner.close();
    }
}
