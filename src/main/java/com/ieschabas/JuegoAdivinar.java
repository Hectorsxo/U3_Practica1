package com.ieschabas;

/**
 /**
 * Ejercicio 4: Programa que genera un número par aleatorio menor que un límite dado.
 *
 * Esta clase permite al usuario introducir un número límite y devuelve un número par
 * aleatorio comprendido entre 0 (inclusive) y el límite (exclusive).
 *
 * Método principal:
 *
 * public static int parAleatorioMenorQue(int limite, Random rng)
 *  - Devuelve un número par aleatorio 0 <= x < limite, cumpliendo x % 2 == 0.
 *  - Si el límite es menor o igual a 0, muestra un mensaje indicando que no se permiten
 *    números negativos y solicita nuevamente la entrada.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class JuegoAdivinar {

    /**
     * Evalúa un intento comparando el número introducido con el número secreto.
     * Muestra por consola si el número buscado es mayor, menor o si ha sido acertado.
     *
     * @param secreto El número que el jugador debe adivinar.
     * @param intento El número introducido por el jugador en un intento.
     */
    public static void evaluarIntento(int secreto, int intento) {
        if (intento < secreto) {
            System.out.println("El número es mayor.");
        } else if (intento > secreto) {
            System.out.println("El número es menor.");
        } else {
            System.out.println("¡Has acertado!");
        }
    }

    /**
     * Simula una partida del juego de adivinanza.
     * Recorre un conjunto de intentos y devuelve el número de intentos realizados
     * hasta adivinar el número secreto. Si no se acierta, devuelve -1.
     *
     * @param secreto  El número que el jugador debe adivinar.
     * @param intentos Array con los números introducidos por el jugador.
     * @return El número de intentos necesarios para acertar, o -1 si no se acierta.
     */
    public static int jugar(int secreto, int[] intentos) {
        // Recorremos todos los intentos realizados por el jugador
        for (int i = 0; i < intentos.length; i++) {
            int intento = intentos[i];
            int numIntento = i + 1; // Contador de intentos (comienza en 1)

            // Comprobamos si el intento coincide con el número secreto
            if (intento == secreto) {
                System.out.println("¡Has acertado!");
                return numIntento; // Retorna el número de intentos usados hasta acertar
            } else if (intento < secreto) {
                System.out.println("El número es mayor. Has realizado " + numIntento + " intentos.");
            } else {
                System.out.println("El número es menor. Has realizado " + numIntento + " intentos.");
            }
        }

        // Si no se acierta tras todos los intentos, se devuelve -1
        return -1;
    }

    /**
     * Método principal que ejecuta una partida de prueba del juego de adivinanza.
     * Define un número secreto y un conjunto de intentos, y muestra los resultados en consola.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        int numeroSecreto = 27; // Número que el jugador debe adivinar
        int[] misIntentos = {10, 50, 20, 30, 27}; // Lista de intentos de prueba

        // Ejecuta el juego con los valores definidos y guarda el resultado
        int resultado = jugar(numeroSecreto, misIntentos);

        // Muestra por consola cuántos intentos se necesitaron para acertar
        System.out.println("Número de intentos hasta acertar: " + resultado);
    }
}
