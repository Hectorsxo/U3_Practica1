package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Programa que genera un número par aleatorio menor que un límite dado.
 *
 * El usuario introduce un número límite y el programa genera un número par aleatorio
 * comprendido entre 0 (inclusive) y dicho límite (exclusive).
 *
 * Si el límite es menor o igual que 0, se muestra un mensaje de error y se solicita nuevamente la entrada.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class AleatoriosPar {

    /**
     * Constructor por defecto de AleatoriosPar.
     */
    public AleatoriosPar() {
    }

    /**
     * Genera un número par aleatorio menor que el límite especificado.
     *
     * @param limite Valor máximo (no incluido) hasta el cual se puede generar el número par.
     *               Debe ser mayor que 0.
     * @param rng Instancia de {@link java.util.Random} utilizada para la generación aleatoria.
     * @return Un número par aleatorio menor que el límite.
     * @throws IllegalArgumentException Si el límite es menor o igual que 0.
     */
    public int parAleatorioMenorQue(int limite, Random rng) {
        if (limite <= 0) {
            throw new IllegalArgumentException("El límite debe ser mayor que 0.");
        }

        int maxPar = limite - 1;
        if (maxPar % 2 != 0) {
            maxPar--; // Ajusta al número par más cercano inferior
        }

        if (maxPar < 0) {
            return 0;
        }

        int numPares = (maxPar / 2) + 1;
        int indice = rng.nextInt(numPares);
        return indice * 2;
    }

    /**
     * Método principal que solicita un número límite al usuario,
     * valida la entrada y muestra un número par aleatorio menor que dicho límite.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        AleatoriosPar generador = new AleatoriosPar(); // Crear objeto para usar método no estático
        int limite;

        // Solicita un límite válido
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

        // Generación y salida del resultado
        int parAleatorio = generador.parAleatorioMenorQue(limite, rng);
        System.out.println("Número par aleatorio generado: " + parAleatorio);

        scanner.close();
    }*/
}
