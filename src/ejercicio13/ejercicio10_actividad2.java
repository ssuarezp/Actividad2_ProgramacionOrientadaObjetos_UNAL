/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author santi
 */
public class ejercicio10_actividad2 {
    
    public static void main(String[] args) {
        //Ejercicio 10-pág 56
        int ni, est;
        String nombre, apellido;
        double pat, pagmat;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del nivel");
        ni=entrada.nextInt();

        System.out.println("Ingrese nombre");
        nombre=entrada.next();

        System.out.println("Ingrese apellido");
        apellido=entrada.next();

        System.out.println("Ingrese el valor del patrimonio");
        pat=entrada.nextDouble();

        System.out.println("Ingrese el valor del estrato");
        est=entrada.nextInt();

        pagmat=Estudiante.obtener_pagmat(pat, est);

        System.out.println("El estudiante con número de inscripción "+ni+" debe pagar "+pagmat);
    }
}
