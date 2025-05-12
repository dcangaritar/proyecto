package Unidad1;

import java.util.Scanner;

public class Practicaseis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.print("Ingresa un número entero: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es nulo (cero).");
        }

        scanner.close();
    }
}