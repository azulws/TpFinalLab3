
package tp.final2.menu;

import java.util.Scanner;
import tp.final2.Recepcionista;


public class RecepcionistaMenu {
    public void imprimir() { 
Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Recepcionista ===");
        System.out.println("2. Crear Administrador");
        System.out.println("2. Realizar CheckIN");
        System.out.println("3. Realizar CheckOUT");
        System.out.println("4. Realizar Reservas");
        System.out.println("5. Listado de Habitaciones disponibles");
        System.out.println("5. Volver Menu principal");
        System.out.print("Ingrese la opcion: "); 

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                MenuCreacion create = new MenuCreacion();
            case 2: // Realizar checkin
                /*
                recep.checkIn(123, agustinc, )*/
                break;
            case 3: // Realizar checkout
                //recep.checkOut();
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
