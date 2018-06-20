/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.final2.menu;

import java.util.Scanner;
import tp.final2.Pasajero;

/**
 *
 * @author agust
 */
public class PasajeroMenu {
    public void imprimir() { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Menu de Pasajero ===");
        System.out.println("1. Realizar Reserva"); // Crea una persona de tipo admin-recep-pasajero
        System.out.println("2. Cancelar Reserva"); //Crea un archivo con todos los usuarios registrados en el hotel (incluye empleados)
        System.out.print("Ingrese la opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
    
     switch (seleccion) {
            case 1:
               Pasajero nuevo = new Pasajero("marcelo", "tinelli" , 4871313 , "Colon 341", "marcetine@gmail.com", "41444213", "Argentina");
                     break;
            case 2:
                //nuevo.CancelarReserva(CodigoReserva);
                     break;
            case 3:  
                     break;
            default: break;
        }
    
}
    
}
