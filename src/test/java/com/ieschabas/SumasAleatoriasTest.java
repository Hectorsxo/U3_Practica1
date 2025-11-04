package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

/**
 * Test para la clase SumasAleatorias.
 */
public class SumasAleatoriasTest {

    @Test
    void testSumaDosAleatoriosEnRango() {
        SumasAleatorias s = new SumasAleatorias();
        Random rng = new Random(123);

        int suma = s.sumaDosAleatorios(rng);

        // Cada número está entre 0 y 1000, por tanto la suma entre 0 y 2000
        assertTrue(suma >= 0 && suma <= 2000, "La suma debe estar entre 0 y 2000");
    }

    @Test
    void testGenerarSumasCantidadCorrecta() {
        SumasAleatorias s = new SumasAleatorias();
        Random rng = new Random(123);

        int[] resultados = s.generarSumas(10, rng);

        // Comprobar que el array tiene la longitud correcta
        assertEquals(10, resultados.length, "Debe generar 10 sumas");

        // Comprobar que todos los valores están en el rango 0-2000
        for (int suma : resultados) {
            assertTrue(suma >= 0 && suma <= 2000, "Cada suma debe estar entre 0 y 2000");
        }
    }

    @Test
    void testGenerarSumasConRandomNuloLanzaExcepcion() {
        SumasAleatorias s = new SumasAleatorias();
        assertThrows(IllegalArgumentException.class, () -> s.generarSumas(5, null),
                "Debe lanzar excepción si el generador Random es nulo");
    }

    @Test
    void testSumaDosAleatoriosConRandomNuloLanzaExcepcion() {
        SumasAleatorias s = new SumasAleatorias();
        assertThrows(IllegalArgumentException.class, () -> s.sumaDosAleatorios(null),
                "Debe lanzar excepción si el generador Random es nulo");
    }
}
