import java.util.Scanner;

public class Practicacinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingresa el primer número: ");
        numero1 = scanner.nextInt();

        do {
            System.out.print("Ingresa el segundo número (debe ser diferente al primero): ");
            numero2 = scanner.nextInt();
        } while (numero1 == numero2);

        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else {
            System.out.println("El número mayor es: " + numero2);
        }

        scanner.close();
    }
}