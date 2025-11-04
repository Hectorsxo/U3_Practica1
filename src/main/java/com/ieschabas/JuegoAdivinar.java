package com.ieschabas;

/**
 * Programa que simula un juego de adivinanza de números.
 *
 * El jugador intenta adivinar un número secreto. El programa indica si el número
 * buscado es mayor, menor o si se ha acertado.
 * También puede simular una partida con una lista de intentos predefinidos.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class JuegoAdivinar {

    /**
     * Constructor por defecto de JuegoAdivinar.
     */
    public JuegoAdivinar() {
    }

    /**
     * Evalúa un intento del jugador comparando el número introducido
     * con el número secreto. Muestra un mensaje indicando si el número
     * buscado es mayor, menor o si ha sido acertado.
     *
     * @param secreto Número que el jugador debe adivinar.
     * @param intento Número introducido por el jugador en un intento.
     */
    public void evaluarIntento(int secreto, int intento) {
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
     * Recorre una lista de intentos y devuelve el número de intentos
     * realizados hasta adivinar el número secreto.
     * Si no se acierta, devuelve -1.
     *
     * @param secreto Número que el jugador debe adivinar.
     * @param intentos Array con los números introducidos por el jugador.
     * @return Número de intentos necesarios para acertar, o -1 si no se acierta.
     */
    public int jugar(int secreto, int[] intentos) {
        if (intentos == null) {
            System.out.println("Error: el arreglo de intentos es nulo.");
            return -1; // o lanza una excepción controlada si prefieres
        }

        for (int i = 0; i < intentos.length; i++) {
            int intento = intentos[i];
            int numIntento = i + 1;

            if (intento == secreto) {
                System.out.println("¡Has acertado!");
                return numIntento;
            } else if (intento < secreto) {
                System.out.println("El número es mayor. Has realizado " + numIntento + " intentos.");
            } else {
                System.out.println("El número es menor. Has realizado " + numIntento + " intentos.");
            }
        }
        return -1; // si no acierta en ningún intento
    }


        return -1; // No se acertó el número
    }

    /**
     * Método principal que ejecuta una partida de prueba del juego de adivinanza.
     * Define un número secreto y una lista de intentos, y muestra los resultados en consola.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    /*public static void main(String[] args) {
        int numeroSecreto = 27; // Número que el jugador debe adivinar
        int[] misIntentos = {10, 50, 20, 30, 27}; // Intentos de ejemplo

        // Crear un objeto de la clase JuegoAdivinar para usar sus métodos no estáticos
        JuegoAdivinar juego = new JuegoAdivinar();

        int resultado = juego.jugar(numeroSecreto, misIntentos);

        System.out.println("Número de intentos hasta acertar: " + resultado);
    }*/
}
