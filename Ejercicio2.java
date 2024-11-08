package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num2 != 0 ? num1 / num2 : 0;
        int modulo = num2 != 0 ? num1 % num2 : 0;

        System.out.println("Resultados de las operaciones aritméticas:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        
        scanner.close();
    }
}
