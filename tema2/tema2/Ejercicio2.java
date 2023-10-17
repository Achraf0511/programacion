package tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Introduce tu edad para saber si eres mayor o menor de edad");
     Scanner in=new Scanner(System.in);
     int edad=in.nextInt();
     if (Tema2Ejercicio1.numberSign(edad)==1){
         System.out.println(isAdult(edad));
     }else if (Tema2Ejercicio1.numberSign(edad)==-1 || Tema2Ejercicio1.numberSign(edad)==0){
         System.out.println("Error, introduce una opción válida");
     }
    }
    public static  boolean isAdult (int edad) {
        boolean result=false;
       if (edad>=18){
           System.out.println("Eres mayor de edad");
           return true;

        }else if (edad<18){
           System.out.println("Eres menor de edad");
           return true;

       }

       return false;



    }
}