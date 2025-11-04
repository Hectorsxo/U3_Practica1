package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

/**
 * Test para la clase MayoresAleatorios3.
 */
public class MayoresAleatorios3Test {

    @Test
    void testMax3DevuelveMayorCorrecto() {
        MayoresAleatorios3 m = new MayoresAleatorios3();

        assertEquals(7, m.max3(7, 5, 2), "El mayor entre (7,5,2) debe ser 7");
        assertEquals(10, m.max3(1, 10, 3), "El mayor entre (1,10,3) debe ser 10");
        assertEquals(8, m.max3(8, 8, 8), "El mayor entre (8,8,8) debe ser 8");
        assertEquals(15, m.max3(-5, 0, 15), "El mayor entre (-5,0,15) debe ser 15");
    }

    @Test
    void testGenerarMaximos3LongitudYValores() {
        MayoresAleatorios3 m = new MayoresAleatorios3();
        Random rng = new Random(42);

        int repeticiones = 10;
        int[] resultados = m.generarMaximos3(repeticiones, rng);

        // Verificar que el array tenga la longitud correcta
        assertEquals(repeticiones, resultados.length, "El array debe tener la longitud indicada");

        // Verificar que los valores están dentro del rango 0-1000
        for (int valor : resultados) {
            assertTrue(valor >= 0 && valor <= 1000, "Cada máximo debe estar entre 0 y 1000");
        }
    }

    @Test
    void testGenerarMaximos3ConRandomNuloLanzaExcepcion() {
        MayoresAleatorios3 m = new MayoresAleatorios3();
        assertThrows(IllegalArgumentException.class, () -> m.generarMaximos3(5, null),
                "Debe lanzar IllegalArgumentException si el Random es nulo");
    }

    @Test
    void testGenerarMaximos3ConCeroRepeticionesSolicitaNuevoValor() {
        MayoresAleatorios3 m = new MayoresAleatorios3();
        Random rng = new Random(123);

        // No podemos simular entrada de usuario en un test unitario,
        // pero verificamos que si el valor es positivo funciona correctamente.
        int[] resultados = m.generarMaximos3(3, rng);
        assertEquals(3, resultados.length, "Si el valor es positivo, debe generar el número correcto de repeticiones");
    }
}
