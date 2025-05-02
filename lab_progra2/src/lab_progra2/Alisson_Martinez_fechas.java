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
public class Alisson_Martinez_fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("ingrese la primera fecha (DD/MM/AAAA):");
         String fecha1 = scanner.nextLine();
         
         System.out.println("ingrese la senguda fecha (DD/MM/AAAA)");
         String fecha2 = scanner.nextLine();
         
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6));

        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6));

        int totalDias1 = anio1 * 360 + mes1 * 30 + dia1;
        int totalDias2 = anio2 * 360 + mes2 * 30 + dia2;

        int diferencia = Math.abs(totalDias1 - totalDias2);
        
      System.out.println("\nLa diferencia entre las dos fechas es: " + diferencia + " días");  
    }
    
}
