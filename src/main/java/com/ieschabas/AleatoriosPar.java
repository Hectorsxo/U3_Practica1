package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

public class AleatoriosPar {

    public static int parAleatorioMenorQue(int limite, Random rng) {
        if (limite <= 0) {
            throw new IllegalArgumentException("El límite debe ser mayor que 0.");
        }


        int maxPar = limite - 1;
        if (maxPar % 2 != 0) {
            maxPar--;
        }

        if (maxPar < 0) {
            return 0;
        }


        int numPares = (maxPar / 2) + 1; // porque incluye el 0
        int indice = rng.nextInt(numPares);
        return indice * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        int limite;
        do {
            System.out.print("Introduce un número límite (debe ser > 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next();
            }
            limite = scanner.nextInt();

            if (limite <= 0) {
                System.out.println("El límite no puede ser un número negativo ni cero.");
            }
        } while (limite <= 0);

        int parAleatorio = parAleatorioMenorQue(limite, rng);
        System.out.println("Número par aleatorio generado: " + parAleatorio);
    }
}
