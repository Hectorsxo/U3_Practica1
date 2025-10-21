package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class MayoresAleatorios3 {
    public static int max3(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }
    public static int[] generarMaximos3(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001); // [0, 1000]
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            resultados[i] = max3(a, b, c);
        }
        return resultados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;
        do {
            System.out.print("Introduce el número de repeticiones (DEBE SER 20 PARA ESTE EJERCICIO): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }
            repeticiones = scanner.nextInt();

            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser un número negativo");
            }
        } while (repeticiones <= 0);


        int[] maximos = generarMaximos3(repeticiones, rng);


        System.out.println("Mayores de cada uno de los 20 tríos de números aleatorios (0–1000):");
        for (int max : maximos) {
            System.out.println(max);
        }
    }
}