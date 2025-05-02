/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_progra2;

import java.util.Scanner;

/**
 *
 * @author Roy Martinez
 */
public class Alisson_Martinez_tiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
    
        System.out.println("favor ingrese la cantidad de segundos: ");
     
        int seg = scanner.nextInt();
        
        String mensaje = (seg <= 0) ? "No se permite ese valor." : "";
          if (!mensaje.isEmpty()){
              System.out.println(mensaje);}
          else{ 
               int horas = seg / 3600;
            int min = (seg % 3600) / 60;
            int segundo = seg % 60;
              
              System.out.println("horas" + horas + "\n minutos:"+ min+"\n seguntos:"+ segundo); 
          }
          
    }
}