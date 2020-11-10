/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextraclase1;
import java.util.Scanner;     
/**
 *
 * @author josep
 */
public class ActividadExtraclase1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Calcular();   
        
     
    }
    public static void Calcular() { 
      Scanner leer = new Scanner(System.in);
        
        //Declaracion e inicializacion de variables
        
        double m, cm, km, pies, pulg;
        m = 0; cm = 0; km = 0; pies = 0; pulg = 0;
        
        //Lectura de datos
        
        System.out.println("Ingrese el valor en metros:");
        m = leer.nextDouble();
        
        //Proceso de calculo 
        
        cm = m*100;
        km = m/1000;
        pies = m/3.281;
        pulg = m*39.37;
        
        //Salida de datos
        
        System.out.println("Su valor en centimetros es: " +cm);
        System.out.println("Su valor en kilometros es: " +km);
        System.out.println("Su valor en pies es: " +pies);
        System.out.println("Su valor en pulgadas es: " +pulg);  
    }
}
