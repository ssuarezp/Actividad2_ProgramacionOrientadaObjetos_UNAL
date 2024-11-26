package ejercicio10;
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
