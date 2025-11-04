package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para la clase NumerosImpares.
 */
public class NumerosImparesTest {

    @Test
    void testProductoDiezPrimerosImpares() {
        NumerosImpares numeros = new NumerosImpares();
        long resultado = numeros.productoDiezPrimerosImpares();
        assertEquals(654729075L, resultado,
                "El producto de los 10 primeros impares debe ser 654729075");
    }
}
