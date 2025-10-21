package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class MayoresAleatorios4 {
    public static int max4(int a, int b, int c, int d) {
        int mayor = a;
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

    public static int[] generarMaximos4(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            int a = rng.nextInt(1001); // [0, 1000]
            int b = rng.nextInt(1001);
            int c = rng.nextInt(1001);
            int d = rng.nextInt(1001);
            resultados[i] = max4(a, b, c, d);
        }
        return resultados;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;
        do {
            System.out.print("Introduce el número de repeticiones (DEBEN SER 20 COMO INDICA EL ENUNCIADO): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }
            repeticiones = scanner.nextInt();

            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no pueden ser un negativo");
            }
        } while (repeticiones <= 0);

        int[] maximos = generarMaximos4(repeticiones, rng);

        System.out.println("\nMayores de cada cuarteto de números aleatorios (0–1000):");
        for (int valor : maximos) {
            System.out.println(valor);
        }
    }
}