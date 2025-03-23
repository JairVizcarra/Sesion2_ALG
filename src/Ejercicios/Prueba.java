/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Prueba {
    public static void main(String []args){
        OperacionesMatInteger o = new OperacionesMatInteger();
        OperacionesMatDouble od = new OperacionesMatDouble();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---MENÚ DE OPERACIONES CLASES GENÉRICAS-----");
            System.out.println("1.SUMA\n2.RESTA\n3.PRODUCTO\n4.DIVISIÓN\n5.POTENCIA\n6.RAÍZ CUADRADA\n7.RAÍZ CUBICA\n8.SALIR\n");
            System.out.println("Eliga una opción del menú");
            opcion = scanner.nextInt();
            if(opcion >=1 && opcion <= 5){
                System.out.println("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.println("Ingrese el primer número: ");
                int num2 = scanner.nextInt();
               
                switch(opcion){
                    case 1 -> System.out.println("La suma es: "+o.suma(num1, num2));
                    case 2 -> System.out.println("La resta es: "+o.resta(num1,num2));
                    case 3 -> System.out.println("El producto es: "+o.producto(num1,num2));
                    case 4 -> System.out.println("La división es: "+o.division(num1,num2));
                    case 5 -> System.out.println("La potencia es: "+o.potencia(num1,num2));    
                }
            }else if(opcion == 6 || opcion == 7){
                System.out.println("Ingrese un número: ");
                int num = scanner.nextInt();
                if(opcion == 6){
                    System.out.println("La raíz cuadrada es: "+o.raizCuadrada(num));
                } else{
                    System.out.println("La raíz cubica es: "+o.raizCubica(num));
                }
            }else if(opcion != 8){
                System.out.println("Opción invalida, intente de nuevo");
            }
        } while(opcion != 8);
        System.out.println("Calculadora Cerrada");
        scanner.close();
    }
}
