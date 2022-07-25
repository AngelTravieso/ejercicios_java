/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica5 {
   
    public Practica5() {
        
        Scanner console = new Scanner(System.in);
        
        System.out.println("Calcular el área de un círculo");
        System.out.println("--------------------------------");
        
        System.out.println("Ingrese el radio del círculo: ");
        
        // Obtener valor ingresado
        double consoleRadio = Double.parseDouble(console.nextLine());

        // radio = (pi * R2)
        double radio = Math.PI * Math.pow(consoleRadio, 2);
        
        // Imprimir resultado
        System.out.println("El área es: " + String.format("%.2f", radio) );
        
    }
    
}
