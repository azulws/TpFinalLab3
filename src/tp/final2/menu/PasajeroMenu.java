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
        System.out.println("2. Cancelar Reserva"); //Crea un archivo con todos los usuarios registrados en el hotel (incluye 
        System.out.println("3. Volver Menu principal");
        Pasajero nuevo = null;
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();

        switch (seleccion) {

            case 1:

                nuevo = new Pasajero("marcelo", "tinelli", 4752222, "colon 5150", "marcetine@gmail.com", "01418360", "Argentina");

                break;
            case 2:
                System.out.println("Ingrese codigo de reserva");
                int CodigoReserva = scanner.nextInt();
                nuevo.CancelarReserva(CodigoReserva);
                break;
            case 3:
                //admin.toString();
                break;
            case 4:
                BienvenidoMenu menu = new BienvenidoMenu();
                break;
            default:
                break;
        }
    }

}
