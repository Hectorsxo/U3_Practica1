package com.ieschabas;

/**
 * Programa que calcula el producto de los diez primeros números impares.
 *
 * Multiplica los números 1, 3, 5, ..., 19 y muestra el resultado por consola.
 * El resultado final es 654729075.
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class NumerosImpares {

    /**
     * Constructor por defecto de NumerosImpares.
     */
    public NumerosImpares() {
    }

    /**
     * Calcula el producto de los diez primeros números impares.
     *
     * Empieza en 1 y va sumando 2 en cada paso hasta completar los diez primeros impares.
     *
     * @return El producto de los diez primeros números impares.
     */
    public long productoDiezPrimerosImpares() {
        long producto = 1; // Acumula el producto total
        int contador = 0;  // Cuenta cuántos impares se han multiplicado
        int numero = 1;    // Primer número impar

        // Calcula el producto de los 10 primeros números impares
        while (contador < 10) {
            producto *= numero; // Multiplica el número actual
            numero += 2;        // Avanza al siguiente número impar
            contador++;         // Aumenta el contador
        }

        return producto;
    }

    /**
     * Método principal. Muestra por consola el resultado
     * del producto de los diez primeros números impares.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    /*public static void main(String[] args) {
        NumerosImpares numeros = new NumerosImpares(); // Crear un objeto
        System.out.println(numeros.productoDiezPrimerosImpares()); // Llamar al método no estático
    }*/
}
