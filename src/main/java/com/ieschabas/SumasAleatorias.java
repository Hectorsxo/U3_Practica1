package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class SumasAleatorias {


    public static int sumaDosAleatorios(Random rng) {
        int a = rng.nextInt(1001);
        int b = rng.nextInt(1001);
        return a + b;
    }

    public static int[] generarSumas(int repeticiones, Random rng) {
        int[] resultados = new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            resultados[i] = sumaDosAleatorios(rng);
        }
        return resultados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int repeticiones;

        do {
            System.out.print("Introduce el número de repeticiones (debe ser > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }
            repeticiones = scanner.nextInt();

            if (repeticiones <= 0) {
                System.out.println("Las repeticiones no puede ser un número negativo");
            }
        } while (repeticiones <= 0);


        int[] sumas = generarSumas(repeticiones, rng);


        System.out.println("Resultados de las " + repeticiones + " sumas aleatorias:");
        for (int suma : sumas) {
            System.out.println(suma);
        }
    }
}