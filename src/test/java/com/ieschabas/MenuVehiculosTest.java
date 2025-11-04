package com.ieschabas;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase MenuVehiculos.
 */
public class MenuVehiculosTest {

    @Test
    void testOpcion1() {
        MenuVehiculos menu = new MenuVehiculos();
        assertEquals("Mantenimiento de clientes", menu.seleccionarOpcion(1));
    }

    @Test
    void testOpcion2() {
        MenuVehiculos menu = new MenuVehiculos();
        assertEquals("Introducción de facturas", menu.seleccionarOpcion(2));
    }

    @Test
    void testOpcion3() {
        MenuVehiculos menu = new MenuVehiculos();
        assertEquals("Listado de facturas", menu.seleccionarOpcion(3));
    }

    @Test
    void testOpcion4() {
        MenuVehiculos menu = new MenuVehiculos();
        assertEquals("Finalizar", menu.seleccionarOpcion(4));
    }

    @Test
    void testOpcionInvalida() {
        MenuVehiculos menu = new MenuVehiculos();
        assertEquals("La opción no existe. Vuelve a intentarlo", menu.seleccionarOpcion(7));
    }
}

