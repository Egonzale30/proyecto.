/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabaj;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Trabaj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
   
    public static void Estudiente() {
        Scanner sc = new Scanner(System.in);

        int cantidadEstudiantes;
        int contadorAprobados = 0;

        System.out.print("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = sc.nextInt();

        System.out.println("Seleccione el tipo de ponderación:");
        System.out.println("1. Proyecto 30%, Parcial 30%, Final 40%");
        System.out.println("2. Proyecto 40%, Parcial 40%, Final 20%");
        int opcion = sc.nextInt();

        double pesoProyecto = 0, pesoParcial = 0, pesoFinal = 0;

        // Asignar pesos según la opción
        if (opcion == 1) {
            pesoProyecto = 0.30;
            pesoParcial = 0.30;
            pesoFinal = 0.40;
        } else if (opcion == 2) {
            pesoProyecto = 0.40;
            pesoParcial = 0.40;
            pesoFinal = 0.20;
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        // Ciclo para cada estudiante
        for (int i = 1; i <= cantidadEstudiantes; i++) {
            System.out.println("\nEstudiante " + i);

            System.out.print("Ingrese nota del proyecto: ");
            double proyecto = sc.nextDouble();

            System.out.print("Ingrese nota del parcial: ");
            double parcial = sc.nextDouble();

            System.out.print("Ingrese nota del examen final: ");
            double examenFinal = sc.nextDouble();

            // Acumulador (cálculo de nota final)
            double notaFinal = (proyecto * pesoProyecto) +
                               (parcial * pesoParcial) +
                               (examenFinal * pesoFinal);

            System.out.printf("Nota final: %.2f ", notaFinal);

            if (notaFinal >= 3.0) {
                System.out.println("¡Aprobado!");
                contadorAprobados++; // contador
            } else {
                System.out.println("Reprobado");
            }
        }

        // Resultado final
        System.out.println("\nTotal de estudiantes aprobados: " + contadorAprobados);

        sc.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   