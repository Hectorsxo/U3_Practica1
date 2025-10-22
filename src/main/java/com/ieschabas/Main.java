package com.ieschabas;

/**
 * Clase Main por defecto generada por IntelliJ IDEA.
 *
 * Esta clase no se utiliza en el proyecto y solo sirve como plantilla por defecto.
 * Contiene un método main que imprime un mensaje de bienvenida y un pequeño bucle de ejemplo.
 *
 * Autor: IntelliJ IDEA
 * Versión: 1.0
 */
public class Main {

    /**
     * Constructor por defecto de Main.
     */
    public Main(){

    }

    /**
     * Método principal de la clase de ejemplo.
     * Imprime un mensaje de bienvenida y un bucle de ejemplo del 1 al 5.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
