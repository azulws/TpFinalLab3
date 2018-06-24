/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.final2.menu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tp.final2.Pasajero;
import static tp.final2.TpFinal2.deSerializar;

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
        ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
        try {
        deSerializar(pasajero);
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        switch (seleccion) {

            case 1:

                      System.out.println(pasajero);
                        
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
