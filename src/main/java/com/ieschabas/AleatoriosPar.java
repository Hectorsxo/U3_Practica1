package com.ieschabas;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que genera un número par aleatorio menor que un límite dado.
 * @author Héctor Crespo
 * @version 1.0
 */
public class AleatoriosPar {

    /**
     * Genera un número par aleatorio menor que el límite especificado.
     *
     * @param limite El valor máximo (no incluido) hasta el cual se puede generar el número par.
     *               Debe ser mayor que 0.
     * @param rng    Instancia de {@link java.util.Random} usada para generar el número aleatorio.
     * @return Un número par aleatorio menor que el límite. Si el límite es menor o igual que 1, devuelve 0.
     * @throws IllegalArgumentException Si el límite es menor o igual que 0.
     */
    public static int parAleatorioMenorQue(int limite, Random rng) {
        if (limite <= 0) {
            throw new IllegalArgumentException("El límite debe ser mayor que 0.");
        }

        // Calcula el número par máximo menor que el límite
        int maxPar = limite - 1;
        if (maxPar % 2 != 0) {
            maxPar--; // Asegura que maxPar sea par
        }

        // Si no existen pares válidos, se devuelve 0
        if (maxPar < 0) {
            return 0;
        }

        // Cantidad de números pares posibles (incluye el 0)
        int numPares = (maxPar / 2) + 1;

        // Selecciona un índice aleatorio de los pares posibles
        int indice = rng.nextInt(numPares);

        // Devuelve el número par correspondiente
        return indice * 2;
    }

    /**
     * Método principal que solicita al usuario un límite positivo, valida la entrada
     * y genera un número par aleatorio menor que dicho límite.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        int limite;

        // Solicita repetidamente un límite válido (> 0)
        do {
            System.out.print("Introduce un número límite (debe ser > 0): ");

            // Comprueba que el usuario introduzca un número entero
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada no válida. Por favor, introduce un número entero.");
                scanner.next(); // Descarta la entrada incorrecta
            }

            limite = scanner.nextInt();

            // Valida que el número sea mayor que cero
            if (limite <= 0) {
                System.out.println("El límite no puede ser un número negativo ni cero.");
            }

        } while (limite <= 0); // Repite mientras el límite no sea válido

        // Genera y muestra el número par aleatorio
        int parAleatorio = parAleatorioMenorQue(limite, rng);
        System.out.println("Número par aleatorio generado: " + parAleatorio);

        // Cierra el Scanner para liberar recursos
        scanner.close();
    }
}
