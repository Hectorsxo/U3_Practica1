package com.ieschabas;

import java.util.Scanner;

public class Mayores {

    public static int max2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        int mayor = max2(num1, num2);
        System.out.println("El mayor de " + num1 + " y " + num2 + " es: " + mayor);
    }
}