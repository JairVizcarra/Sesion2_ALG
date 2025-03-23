/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author USUARIO
 * @param <N>
 */
public interface Operable<N extends Number> {
    public N suma(N operando1,N operando2);
    public N resta(N operando1,N operando2);
    public N producto(N operando1,N operando2);
    public N division(N operando1,N operando2);
    public N potencia(N operando1,N operando2);
    public N raizCuadrada(N operando1);
    public N raizCubica(N operando1);
}
