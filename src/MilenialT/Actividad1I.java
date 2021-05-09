/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MilenialT;

import java.util.Scanner;

/**
 *
    * @author Michael Adael Salvador Cocom
    * https://github.com/LightninMC
 */
public class Actividad1I {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
       
       System.out.println("Porfavor introduce el año :)");
       int año = entrada.nextInt();
       int añoD = 0;
       
       if(año < 2021){
           añoD = 2021 - año;
           System.out.println("Han pasado " + añoD + " años");
       } else if(año > 2021){
           añoD = año - 2021;
           System.out.println("Aun faltan " + añoD + " años");
       } else{
           System.out.println("Amigo ¿estas bien?, estamos en el mismo año");
    }   
}
}