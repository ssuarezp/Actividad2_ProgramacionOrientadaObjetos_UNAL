/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author santi
 */
public class Estudiante {
    
    public static double obtener_pagmat(double pat, int est){
    double pagmat=50000;
        if ((pat>2000000)&&(est>3)){
            return pagmat+0.03*pat;
        }
        else{
            return pagmat;
        }
    }    
}
