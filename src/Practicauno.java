import java.util.Scanner;

public class Practicauno{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            double suma = numero1 + numero2;
            double diferencia = numero1 - numero2;
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = numero1 * numero2;
            double division = numero1 / numero2;
            System.out.println("Producto: " + producto);
            System.out.println("División: " + division);
        }

        scanner.close();
    }
}