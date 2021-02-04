/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion_cesar;
import java.util.Scanner;

/**
 *
 * @author cesar
 * @version 1.0
 */



public class Aplicacion_cesar {

     /**
     * Obtine dos numeros, y realiza la suma de ellos, luego retorna el resultado
     * 
     * @param num1 el primer numero introducido por consola.
     * @param num2 el segundo numero introducido por consola.
     * @return total de la suma.
     * 
     */
    public static double suma(double num1, double num2){
        
        double total = 0;
        
        total = num1 + num2;
        
        return total;
        
    }
    
    
    /**
     * Pide dos numeros, para luego ir a la funcion suma() y hacer dicha operacion,
     * <br>devuelve el resultado y luego el main() lo muestra por pantalla.
     * 
     * @param args
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero");
        double num1 = teclado.nextDouble();
        
        System.out.println("Introduzca el segundo numero");
        double num2 = teclado.nextDouble();
        
        double resultado = suma(num1, num2);
        
        System.out.println("El resultado de la suma es: "+resultado);
        
    }
    
}
