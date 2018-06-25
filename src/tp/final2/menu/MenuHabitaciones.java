
package tp.final2.menu;

import java.util.ArrayList;
import java.util.Scanner;
import tp.final2.Habitacion;
import tp.final2.Habitacion.Tipo;


public class MenuHabitaciones {
     private static Scanner scanner = new Scanner(System.in);

    public void room(Habitacion room) {

        System.out.println("=== Menu de Habitaciones ===");
        System.out.println("1 habitacion"); // Muestra todas las habitaciones
        System.out.println("2. Ver todas"); // Muestra todas las habitaciones
        System.out.println("3. Ver disponibles"); // Muestra todas las habitaciones disponibles
        System.out.println("4. Menu Recepcionista"); //Vuelve al menu de Administrador
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }

        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:

                nuevaHabitacion();
                break;

            case 2:
                room.toString();
                break;
            case 3:
                room.getListadoDisponible();
                break;
            case 4:
                RecepcionistaMenu Rc = new RecepcionistaMenu();
                break;
        }
    }
    

    public void nuevaHabitacion() {
    ArrayList<Habitacion> room = new ArrayList<>();
        for (int a=1; a<21; a++) {
            room.add(new Habitacion(a,Tipo.INDIVIDUAL));
            room.add(new Habitacion(a,Tipo.DOBLE));
            room.add(new Habitacion(a,Tipo.SUITES));
            room.add(new Habitacion(a,Tipo.TRIPLE));
            
        }

        }
    

        }

