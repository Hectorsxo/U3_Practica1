package com.ieschabas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase JuegoAdivinar.
 */
public class JuegoAdivinarTest {

    @Test
    void testJugadorAcierta() {
        JuegoAdivinar juego = new JuegoAdivinar();
        int secreto = 50;
        int[] intentos = {10, 60, 40, 50};
        int resultado = juego.jugar(secreto, intentos);

        // Debería acertar en el 4º intento
        assertEquals(4, resultado, "El jugador debería acertar en el intento número 4");
    }

    @Test
    void testJugadorNoAcierta() {
        JuegoAdivinar juego = new JuegoAdivinar();
        int secreto = 25;
        int[] intentos = {10, 20, 30};
        int resultado = juego.jugar(secreto, intentos);

        // No acierta, debe devolver -1
        assertEquals(-1, resultado, "El jugador no acierta el número secreto");
    }

    @Test
    void testIntentosNulo() {
        JuegoAdivinar juego = new JuegoAdivinar();
        int resultado = juego.jugar(10, null);
        assertEquals(-1, resultado, "Si el array de intentos es null, debe devolver -1");
    }
}
