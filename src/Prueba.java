package Ejercicio1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        System.out.println("Seleccione el tipo de dato:");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        int tipoDato = scanner.nextInt();

        if (tipoDato == 1) {
            OperacionesMatBInteger operacionInt = new OperacionesMatBInteger();
            ejecutarMenu(scanner, operacionInt);
        } else if (tipoDato == 2) {
            OperacionesMatBDouble operacionDouble = new OperacionesMatBDouble();
            ejecutarMenu(scanner, operacionDouble);
        } else {
            System.out.println("Opción inválida.");
        }
        
        scanner.close();
    }

    private static <N extends Number> void ejecutarMenu(Scanner scanner, Operable<N> operacion) {
        int opcion;
        do {
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                
                ejecutarOperacion(opcion, num1, num2, operacion);
            } else if (opcion == 5 || opcion == 6 || opcion == 7) {
                System.out.print("Ingrese un número: ");
                double num = scanner.nextDouble();
                
                ejecutarOperacion(opcion, num, 0, operacion);
            } else if (opcion != 8) {
                System.out.println("Opción no válida, intente nuevamente.");
            }
            
        } while (opcion != 8);
        
        System.out.println("Saliendo del programa...");
    }

    private static <N extends Number> void ejecutarOperacion(int opcion, double num1, double num2, Operable<N> operacion) {
        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + operacion.suma((N) cast(num1), (N) cast(num2)));
                break;
            case 2:
                System.out.println("Resultado: " + operacion.resta((N) cast(num1), (N) cast(num2)));
                break;
            case 3:
                System.out.println("Resultado: " + operacion.producto((N) cast(num1), (N) cast(num2)));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + operacion.division((N) cast(num1), (N) cast(num2)));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case 5:
                System.out.println("Resultado: " + Math.pow(num1, num2));
                break;
            case 6:
                System.out.println("Resultado: " + Math.sqrt(num1));
                break;
            case 7:
                System.out.println("Resultado: " + Math.cbrt(num1));
                break;
        }
    }

    private static Number cast(double num) {
        if (num % 1 == 0) {
            return (int) num;
        }
        return num;
    }
}
