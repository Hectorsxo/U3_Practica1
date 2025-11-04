package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para la clase Circunferencia.
 */
public class CircunferenciaTest {

    @Test
    void testAreaConValorPositivo() {
        Circunferencia c = new Circunferencia();
        double radio = 2.0;
        double resultado = c.area(radio);
        double esperado = Math.PI * radio * radio;
        assertEquals(esperado, resultado, 1e-9, "El área debe ser π * r²");
    }

    @Test
    void testLongitudConValorPositivo() {
        Circunferencia c = new Circunferencia();
        double radio = 3.0;
        double resultado = c.longitud(radio);
        double esperado = 2 * Math.PI * radio;
        assertEquals(esperado, resultado, 1e-9, "La longitud debe ser 2 * π * r");
    }

    @Test
    void testAreaRadioCero() {
        Circunferencia c = new Circunferencia();
        assertEquals(0.0, c.area(0.0), 1e-9, "El área de radio 0 debe ser 0");
    }

    @Test
    void testLongitudRadioCero() {
        Circunferencia c = new Circunferencia();
        assertEquals(0.0, c.longitud(0.0), 1e-9, "La longitud de radio 0 debe ser 0");
    }

    @Test
    void testRadioNegativoDevuelvePositivoTrasReentrada() {
        Circunferencia c = new Circunferencia();
        // No probamos la lectura del usuario en test, solo que la fórmula se comporta bien si el radio se pasa positivo
        double resultado = c.area(Math.abs(-5));
        assertEquals(Math.PI * 25, resultado, 1e-9, "El área con radio 5 debe ser π * 25");
    }
}
