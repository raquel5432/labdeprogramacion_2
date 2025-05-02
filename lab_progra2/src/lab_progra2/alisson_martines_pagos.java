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
public class alisson_martines_pagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("ingrese su nombre completo:");
        String nombre = scanner.nextLine();
        System.out.println("ingrese la cantidad e horas trbajadas:");
        int horas = scanner.nextInt();
        
        System.out.println("Seleccione la categoría del trabajador (1-4):");
        System.out.println("1 - $40 por hora extra");
        System.out.println("2 - $50 por hora extra");
        System.out.println("3 - $85 por hora extra");
        System.out.println("4 - No recibe pago extra");
        int categoria = scanner.nextInt();
        
        double pagohoras = 35.99;
        int horascomunes = Math.min(horas, 40);
        int horasExtra = Math.min(Math.max(horas- 40, 0), 15);
        double pagoextra = scanner.nextDouble();
        
         switch (categoria) {
            case 1:
                pagoextra = horasExtra * 40;
                break;
            case 2:
                pagoextra = horasExtra * 50;
                break;
            case 3:
                pagoextra = horasExtra * 85;
                break;
            case 4:
                pagoextra = 0;
                break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }
         double total = Math.round((horas * pagohoras) + pagoextra);
         
         System.out.println("\n--- Detalle del Pago ---");
        System.out.println("Nombre: " + nombre );
        System.out.println("Horas normales: " + horascomunes);
        System.out.println("Horas extra: " + horasExtra);
        System.out.println("Pago por horas normales: $" + Math.round(horascomunes * pagohoras));
        System.out.println("Pago por horas extra: $" + pagoextra);
        System.out.println("Pago total: $" + total);
    }
    
}
