
package tp.final2.menu;

import java.util.Scanner;
import tp.final2.Recepcionista;


public class RecepcionistaMenu {
    public void imprimir() { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Menu de Recepcionista ===");
        System.out.println("1. Realizar CheckIN");
        System.out.println("2. Realizar CheckOUT");
        System.out.println("3. Realizar Reservas");
        System.out.println("4. Listado de Habitaciones disponibles");
        System.out.println("5. Modificar pasajero"); //Modifica algun dato del pasajero
        
        System.out.print("Ingrese la opcion: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
    
    switch (seleccion) {
            case 1: // Realizar checkin
                /*
                Recepcionista recep = new Recepcionista("agustinc", "123" , "agustin", "caceres" );
                recep.checkIn(123, agustinc, )*/
                     break;
            case 2: // Realizar checkout
                //recep.checkOut();
                     break;
            case 3:  // Realizar Reservas
                //recep.alquiler();
                     break;
            case 4: // Habitaciones disponibles
               //recep.libre();
                     break;
            case 5: // Modificar usuario
                //recep.modificarUser(); // Funcion que obtiene los datos de X usuario (pasado por parametro, String), modifica y pisa el dato anterior del array o lista
                     break;
            default: break;
        }
    }
}
