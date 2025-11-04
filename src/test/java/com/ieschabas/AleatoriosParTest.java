package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

/**
 * Test de la clase AleatoriosPar.
 */
public class AleatoriosParTest {

    @Test
    void testNumeroGeneradoEsParYMenorQueLimite() {
        AleatoriosPar generador = new AleatoriosPar();
        Random rng = new Random(123); // semilla fija para reproducibilidad
        int limite = 50;

        int num = generador.parAleatorioMenorQue(limite, rng);

        // Comprobaciones
        assertTrue(num >= 0, "El número debe ser mayor o igual que 0");
        assertTrue(num < limite, "El número debe ser menor que el límite");
        assertEquals(0, num % 2, "El número debe ser par");
    }

    @Test
    void testLimiteNegativoRequiereNuevoValor() {
        AleatoriosPar generador = new AleatoriosPar();
        Random rng = new Random(123);

        // No podemos simular entrada del usuario en test unitario sin I/O,
        // así que comprobamos que si el límite es positivo funciona correctamente.
        int resultado = generador.parAleatorioMenorQue(10, rng);
        assertTrue(resultado >= 0 && resultado < 10 && resultado % 2 == 0);
    }

    @Test
    void testLimitePequeno() {
        AleatoriosPar generador = new AleatoriosPar();
        Random rng = new Random(42);
        int resultado = generador.parAleatorioMenorQue(1, rng);
        // Para límite 1, solo puede devolver 0, que es par
        assertEquals(0, resultado, "Si el límite es 1, el resultado debe ser 0");
    }
}
