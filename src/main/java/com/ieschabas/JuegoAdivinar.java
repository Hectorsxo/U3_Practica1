package com.ieschabas;

public class JuegoAdivinar {

    public static void evaluarIntento(int secreto, int intento) {
        if (intento < secreto) {
            System.out.println("El número es mayor.");
        } else if (intento > secreto) {
            System.out.println("El número es menor.");
        } else {
            System.out.println("Has acertado!");
        }
    }

    public static int jugar(int secreto, int[] intentos) {
        for (int i = 0; i < intentos.length; i++) {
            int intento = intentos[i];
            int numIntento = i + 1;

            if (intento == secreto) {
                System.out.println("Has acertado!");
                return numIntento;
            } else if (intento < secreto) {
                System.out.println("El número es mayor. Has realizado " + numIntento + " intentos");
            } else {
                System.out.println("El número es menor. Has realizado " + numIntento + " intentos");
            }
        }
        return -1; // No se adivinó el número
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        int numeroSecreto = 27;
        int[] misIntentos = {10, 50, 20, 30, 27};

        int resultado = jugar(numeroSecreto, misIntentos);
        System.out.println("Número de intentos hasta acertar: " + resultado);
    }
}
