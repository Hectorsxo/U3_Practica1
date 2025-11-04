package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para la clase Mayores.
 */
public class MayoresTest {

    @Test
    void testPrimerNumeroMayor() {
        Mayores m = new Mayores();
        assertEquals(10, m.max2(10, 5), "El mayor entre 10 y 5 debe ser 10");
    }

    @Test
    void testSegundoNumeroMayor() {
        Mayores m = new Mayores();
        assertEquals(20, m.max2(7, 20), "El mayor entre 7 y 20 debe ser 20");
    }

    @Test
    void testNumerosIguales() {
        Mayores m = new Mayores();
        assertEquals(15, m.max2(15, 15), "Si ambos números son iguales, debe devolver ese valor");
    }

    @Test
    void testConNumerosNegativos() {
        Mayores m = new Mayores();
        assertEquals(-3, m.max2(-5, -3), "El mayor entre -5 y -3 debe ser -3");
    }
}
