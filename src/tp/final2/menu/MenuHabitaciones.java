
package tp.final2.menu;

import java.util.Scanner;


public class MenuHabitaciones {
     private static Scanner scanner = new Scanner(System.in);

    public void room() {

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

                //nuevaHabitacion();
                break;

            case 2:
                this.toString();
                break;
            case 3:
                //setListadoDisponibles();
                break;
            case 4:
                RecepcionistaMenu Rc = new RecepcionistaMenu();
                break;
        }
    }
    

    /*public void nuevaHabitacion() {
       Habitaciones casa = new Habitaciones(1, Habitaciones.Estado.DISPONIBLE, Habitaciones.Tipo.INDIVIDUAL);
        Habitaciones casa2 = new Habitaciones(2, Habitaciones.Estado.NO_DISPONIBLE, Habitaciones.Tipo.DOBLE);
        Habitaciones[] casita = new Habitaciones[2];
        casita[0] = casa;
        casita[1] = casa2;
        HashSet<Habitaciones> hostel = new HashSet<>();
        for (int a = 0; a < casita.length; a++) {
            hostel.add(casa);

        }*/
}
