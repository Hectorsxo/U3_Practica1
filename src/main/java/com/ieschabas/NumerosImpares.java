package com.ieschabas;

/**
 * Ejercicio 2: Programa que muestra el producto de los 10 primeros números impares.
 *
 * Esta clase calcula el producto de los primeros diez números impares (1, 3, 5, ..., 19)
 * utilizando un bucle. El resultado final es 654729075.
 *
 * Método principal:
 * public static long productoDiezPrimerosImpares()
 *
 * Devuelve el producto de los diez primeros números impares.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class NumerosImpares {

    /**
     * Calcula el producto de los diez primeros números impares.
     *
     * El proceso comienza en 1 (primer número impar) y continúa
     * sumando 2 en cada iteración hasta completar los 10 primeros impares.
     *
     * @return El producto de los diez primeros números impares.
     */
    public static long productoDiezPrimerosImpares() {
        long producto = 1; // Acumula el resultado del producto
        int contador = 0;  // Lleva la cuenta de los números impares multiplicados
        int numero = 1;    // Primer número impar

        // Repite el proceso hasta multiplicar los 10 primeros números impares
        while (contador < 10) {
            producto *= numero; // Multiplica el número actual
            numero += 2;        // Avanza al siguiente número impar
            contador++;         // Incrementa el contador de impares procesados
        }

        return producto;
    }

    /**
     * Método principal para probar la funcionalidad del cálculo.
     *
     * Imprime en consola el resultado del producto de los diez primeros números impares.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println(productoDiezPrimerosImpares()); // Imprime: 654729075
    }
}

