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
public class Alisson_Martinez_clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la fecha (semana, fecha): ");
        String fecha = sc.nextLine();
        
        String[] partes = fecha.split(",");
        if (partes.length != 2) {
            System.out.println("Error en el formato.");
            return;
        }

        String diaSemana = partes[0].trim().toLowerCase();
        String[] fechaNumeros = partes[1].trim().split("/");
        
        if (fechaNumeros.length != 2) {
            System.out.println("Error en la fecha.");
            return;
        }

        int dia, mes;
        try {
            dia = Integer.parseInt(fechaNumeros[0]);
            mes = Integer.parseInt(fechaNumeros[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Día o mes no validos.");
            return;
        }

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Error en la fecha: día o mes fuera de rango.");
            return;
        }

        switch (diaSemana) {
            case "lunes" : procesarExamenes(sc, "Inicial");
            case "martes" : procesarExamenes(sc, "Intermedio");
            case "miércoles" : procesarExamenes(sc, "Avanzado");
            case "jueves" : procesarAsistencia(sc);;
            case "viernes" : {
                if (dia == 1 && (mes == 1 || mes == 7)) {
                    System.out.println("¡Comienzo de nuevo ciclo!");
                    System.out.print("Ingrese cantidad de alumnos: ");
                    int estudiantes = sc.nextInt();
                    
                    System.out.print("Ingrese precio por alumno: ");
                    double valor = sc.nextDouble();
                    
                    double ingresoTotal = estudiantes * valor;
                    System.out.printf("Ingreso total: $%.2f\n", ingresoTotal);
                } else 
                {
                    System.out.println("Clase normal de inglés para viajeros.");
                }
                
         }
            default : System.out.println("Error: Día de la semana inválido.");
        }
    }

    public static void procesarExamenes(Scanner sc, String nivel) {
        System.out.println("Nivel " + nivel + ": ¿Se tomaron exámenes?");
        System.out.print("Ingrese 'si' o 'no': ");
        String respuesta = sc.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.print("Cantidad de alumnos aprobados: ");
            int aprobados = sc.nextInt();
            System.out.print("Cantidad de alumnos reprobados: ");
            int reprobados = sc.nextInt();
            int total = aprobados + reprobados;
           
            if (total > 0) {
                double porcentaje = (aprobados * 100.0) / total;
                System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentaje);
            } else 
            {
                System.out.println("No se registraron alumnos.");
            }
        } else
        {
            System.out.println("No se tomaron exámenes.");
        }
    }

    public static void procesarAsistencia(Scanner sc) {
        System.out.print("Ingrese el porcentaje de asistencia: ");
        double asistencia = sc.nextDouble();
        
        if (asistencia > 50) {
            System.out.println("Asistió la mayoría.");
        } else
        {
            System.out.println("No asistió la mayoría.");
        }
    }
    }
 
