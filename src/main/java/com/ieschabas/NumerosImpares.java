package com.ieschabas;

public class NumerosImpares {

    /**
     * Calcula el producto de los 10 primeros números impares: 1 * 3 * 5 * ... * 19
     * El resultado esperado es 654729075.
     *
     * @return el producto de los 10 primeros números impares como un valor long
     */
    public static long productoDiezPrimerosImpares() {
        long producto = 1;
        int contador = 0;
        int numero = 1;

        while (contador < 10) {
            producto *= numero;
            numero += 2; // Avanza al siguiente número impar
            contador++;
        }

        return producto;
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        System.out.println(productoDiezPrimerosImpares()); // Imprime: 654729075
    }
}
