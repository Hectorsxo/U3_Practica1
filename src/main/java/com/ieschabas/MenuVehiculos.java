package com.ieschabas;

import java.util.Scanner;

public class MenuVehiculos {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ DE MANTENIMIENTO DE VEHÍCULOS ===");
            System.out.println("1. Mantenimiento de clientes");
            System.out.println("2. Introducción de facturas");
            System.out.println("3. Listado de facturas");
            System.out.println("4. Finalizar");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            String resultado = seleccionarOpcion(opcion);
            System.out.println(resultado);
            System.out.println(); // Línea en blanco para mejorar la legibilidad

        } while (opcion != 4);

        System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
        scanner.close();
    }
}