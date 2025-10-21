package com.ieschabas;

import java.util.Scanner;

/**
 * Ejercicio 1: Menú para una aplicación de mantenimiento de vehículos.
 *
 * Esta clase permite al usuario seleccionar opciones de un menú relacionadas
 * con mantenimiento de clientes y gestión de facturas. Según la opción seleccionada,
 * devuelve un mensaje indicando la acción correspondiente. Si la opción no existe,
 * muestra un mensaje de error.
 *
 * Opciones:
 * 1 → Mantenimiento de clientes
 * 2 → Introducción de facturas
 * 3 → Listado de facturas
 * 4 → Finalizar
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class MenuVehiculos {

    /**
     * Método que devuelve un mensaje en función de la opción seleccionada por el usuario.
     *
     * @param opcion Número entero que representa la opción elegida del menú.
     * @return Un mensaje indicando la acción correspondiente a la opción seleccionada.
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
     * Método principal que ejecuta el programa.
     * Muestra un menú en consola, solicita al usuario una opción y muestra el resultado
     * hasta que el usuario elige salir.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario por consola
        Scanner scanner = new Scanner(System.in);
        int opcion; // Variable para almacenar la opción seleccionada

        // Bucle que se ejecuta hasta que el usuario selecciona la opción 4 (salir)
        do {
            // Muestra el menú principal
            System.out.println("=== MENÚ DE MANTENIMIENTO DE VEHÍCULOS ===");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Introducción de facturas");
            System.out.println("3. Listado de facturas");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opción: ");

            // Lee la opción elegida por el usuario
            opcion = scanner.nextInt();

            // Llama al método seleccionarOpcion y muestra el resultado en consola
            String resultado = seleccionarOpcion(opcion);
            System.out.println(resultado);
            System.out.println(); // Línea en blanco para mejorar la legibilidad

        } while (opcion != 4); // Condición de salida del bucle

        // Mensaje final al cerrar el programa
        System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
        scanner.close(); // Cierre del objeto Scanner para liberar recursos
    }
}
