package com.ieschabas;

import java.util.Scanner;

/**
 * Programa que determina el mayor de dos números enteros introducidos por el usuario.
 *
 * El usuario ingresa dos números, y el programa muestra cuál de ellos es mayor.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class Mayores {

    /**
     * Constructor por defecto de Mayores.
     */
    public Mayores() {
    }

    /**
     * Devuelve el mayor de dos números enteros.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return El número mayor entre a y b.
     */
    public int max2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Método principal. Solicita dos números al usuario,
     * calcula cuál es el mayor y muestra el resultado por consola.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mayores comparador = new Mayores(); // Crear objeto para usar método no estático

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int mayor = comparador.max2(num1, num2); // Llamada al método no estático

        System.out.println("El mayor de " + num1 + " y " + num2 + " es: " + mayor);

        scanner.close();
    }*/
}
