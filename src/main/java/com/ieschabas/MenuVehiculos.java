package com.ieschabas;

import java.util.Scanner;

/**
 * Programa que muestra un menú para una aplicación de mantenimiento de vehículos.
 *
 * Permite al usuario seleccionar entre varias opciones relacionadas con
 * el mantenimiento de clientes y la gestión de facturas.
 *
 * Opciones disponibles:
 * 1 → Mantenimiento de clientes
 * 2 → Introducción de facturas
 * 3 → Listado de facturas
 * 4 → Finalizar
 *
 * Autor: Héctor Crespo
 * Versión: 1.0
 */
public class MenuVehiculos {

    /**
     * Constructor por defecto de MenuVehiculos.
     */
    public MenuVehiculos(){

    }

    /**
     * Devuelve un mensaje en función de la opción seleccionada por el usuario.
     *
     * @param opcion Número que representa la opción elegida del menú.
     * @return Mensaje correspondiente a la opción seleccionada.
     */
    public static String seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                return "Opción seleccionada - Mantenimiento de clientes";
            case 2:
                return "Opción seleccionada - Introducción de facturas";
            case 3:
                return "Opción seleccionada - Listado de facturas";
            case 4:
                return "Opción seleccionada - Finalizar";
            default:
                return "La opción no existe. Vuelve a intentarlo.";
        }
    }

    /**
     * Método principal. Muestra el menú por consola, pide una opción al usuario
     * y muestra el mensaje correspondiente hasta que elige salir.
     *
     * @param args Argumentos de línea de comandos (no se usan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion; // Almacena la opción seleccionada por el usuario

        // Bucle principal: se repite hasta que se elige la opción 4
        do {
            System.out.println("=== MENÚ DE MANTENIMIENTO DE VEHÍCULOS ===");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Introducción de facturas");
            System.out.println("3. Listado de facturas");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt(); // Lee la opción del usuario

            // Muestra el mensaje asociado a la opción seleccionada
            String resultado = seleccionarOpcion(opcion);
            System.out.println(resultado);
            System.out.println(); // Línea en blanco para legibilidad

        } while (opcion != 4);

        System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
        scanner.close(); // Cierra el Scanner para liberar recursos
    }
}
