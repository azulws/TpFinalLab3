
package tp.final2.menu;

import java.util.Scanner;
import tp.final2.Recepcionista;


public class RecepcionistaMenu {
    public void imprimir(Recepcionista recep) { 
Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Recepcionista ===");
        System.out.println("1. Realizar CheckIN");
        System.out.println("2. Realizar CheckOUT");
        System.out.println("3. Realizar Reservas");
        System.out.println("4. Listado de Habitaciones disponibles");
        System.out.println("5. Volver Menu principal");
        System.out.print("Ingrese la opcion: "); 

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                     System.out.println("Ingrese numero de habitacion para el checkin:");
                int NumeroHabitacioncheckin= scanner.nextInt();
                recep.checkIn(NumeroHabitacioncheckin);
            case 2: // Realizar checkout
                    System.out.println("Ingrese numero de habitacion para el checkout:");
                int NumeroHabitacion= scanner.nextInt();
                recep.checkout(NumeroHabitacion);
                break;
            case 4:  // Realizar Reservas
                //recep.alquiler();
                break;
            case 5: // Habitaciones disponibles
                MenuHabitaciones room = new MenuHabitaciones();
                break;
            case 6: // Modificar usuario
                BienvenidoMenu menu=new BienvenidoMenu();
            default:
                break;
        }

    }
}
