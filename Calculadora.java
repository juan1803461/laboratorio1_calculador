/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author LABSIS
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);
        int sumaEntero1, sumaEntero2;
        
        float resultado;
        
   
        
        System.out.println("bienvenido a mi calculadora");
        System.out.println("oprima s si quiere sumar");
        String operacion=entradaTeclado.nextLine().toString();
        System.out.println("Escriba el primer numero");
        sumaEntero1=Integer.parseInt(entradaTeclado.nextLine());
        System.out.println("Escriba el segundo numero");
        sumaEntero2=Integer.parseInt(entradaTeclado.nextLine());
        
        if(operacion.equals("s")){
            resultado=sumaEntero1+sumaEntero2;
            System.out.println("El resultado de la suma es " + resultado);
        }else if(operacion.equals("r")){
            
            System.out.println("La operacion seleccionada no esta definida");
        }
    }
}
