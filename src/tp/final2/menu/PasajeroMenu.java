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
//import static tp.final2.TpFinal2.deSerializar;

/**
 *
 * @author agust
 */
public class PasajeroMenu {

    public void imprimirr(Pasajero pasaj) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Pasajero ===");
        System.out.println("1. Mostrar pasajeros"); // Muestra lista pasajeros
        System.out.println("2. Cancelar Reserva"); //Cancela la reserva
        System.out.println("3. Volver Menu principal");
        Pasajero nuevo = null;
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        //ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
//        try {
//        deSerializar(pasajero);
//        } catch (FileNotFoundException ex) {
//            ex.getMessage();
//        }
//    

        switch (seleccion) {

            case 1:

                      System.out.println(pasaj);
                        
                break;
            case 2:
                System.out.println("Ingrese codigo de reserva");
                int CodigoReserva = scanner.nextInt();
                pasaj.CancelarReserva(CodigoReserva);
                break;
            case 3:
                BienvenidoMenu menu = new BienvenidoMenu();
                break;
            default:
                break;
        }
    }


}
