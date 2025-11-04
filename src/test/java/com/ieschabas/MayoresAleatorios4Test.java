package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

/**
 * Test para la clase MayoresAleatorios4.
 */
public class MayoresAleatorios4Test {

    @Test
    void testMax4DevuelveMayorCorrecto() {
        MayoresAleatorios4 m = new MayoresAleatorios4();

        assertEquals(10, m.max4(10, 2, 5, 7), "El mayor entre (10,2,5,7) debe ser 10");
        assertEquals(50, m.max4(1, 50, 20, 30), "El mayor entre (1,50,20,30) debe ser 50");
        assertEquals(100, m.max4(100, 100, 100, 100), "El mayor entre (100,100,100,100) debe ser 100");
        assertEquals(0, m.max4(-5, -10, 0, -2), "El mayor entre (-5,-10,0,-2) debe ser 0");
    }

    @Test
    void testGenerarMaximos4LongitudYValores() {
        MayoresAleatorios4 m = new MayoresAleatorios4();
        Random rng = new Random(123);

        int repeticiones = 8;
        int[] resultados = m.generarMaximos4(repeticiones, rng);

        assertEquals(repeticiones, resultados.length, "Debe generar el número correcto de repeticiones");

        // Comprobamos que todos los valores están dentro del rango 0-1000
        for (int valor : resultados) {
            assertTrue(valor >= 0 && valor <= 1000, "Cada máximo debe estar entre 0 y 1000");
        }
    }

    @Test
    void testGenerarMaximos4ConRandomNuloLanzaExcepcion() {
        MayoresAleatorios4 m = new MayoresAleatorios4();
        assertThrows(IllegalArgumentException.class, () -> m.generarMaximos4(5, null),
                "Debe lanzar IllegalArgumentException si el generador Random es nulo");
    }

    @Test
    void testGenerarMaximos4ConRepeticionesPositivas() {
        MayoresAleatorios4 m = new MayoresAleatorios4();
        Random rng = new Random(42);

        int[] resultados = m.generarMaximos4(3, rng);
        assertEquals(3, resultados.length, "El array debe tener tamaño 3");
    }
}
