    // PROGRAMA PARA DETERMINAR EL NUMERO MAYOR:1
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        boolean validInput = false;

        System.out.println("Ingrese tres números distintos:");

        while (!validInput) {
            try {
                System.out.print("Número 1: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.print("Número 2: ");
                num2 = scanner.nextInt();
                if (num2 == num1) {
                    System.out.println("Debe ser un número distinto del primero.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.print("Número 3: ");
                num3 = scanner.nextInt();
                if (num3 == num1 || num3 == num2) {
                    System.out.println("Debe ser un número distinto de los anteriores.");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
        }

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
