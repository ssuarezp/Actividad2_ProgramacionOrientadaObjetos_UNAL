package ejercicio10;
import java.util.Scanner;
public class ejercicio10_actividad2 {  
    public static void main(String[] args) {
        //Ejercicio 10-pág 56
        int ni, est;
        String nombre, apellido;
        double pat, pagmat;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero de incripcion");
        ni=entrada.nextInt();
        
        System.out.println("Ingrese nombre");
        nombre=entrada.next();
        
        System.out.println("Ingrese apellido");
        apellido=entrada.next();
        
        System.out.println("Ingrese patrimonio");
        pat=entrada.nextDouble();
        
        System.out.println("Ingrese el valor del estrato");
        est=entrada.nextInt();
        
        pagmat=Estudiante.obtener_pagmat(pat, est);
        
        System.out.println("El estudiante "+nombre+" "+apellido+" con numero de inscripcion "+ni+" debe pagar "+pagmat);
    }
}
