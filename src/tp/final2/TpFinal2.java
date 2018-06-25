package tp.final2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import tp.final2.Administrador;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import jdk.internal.org.objectweb.asm.TypeReference;
import com.google.gson.reflect.TypeToken;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tp.final2.TpFinal2.MenuHabitaciones;

//    BienvenidoMenu menu = new  BienvenidoMenu();
//        menu.imprimirMenu();
//        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
//        ArrayList<Pasajero> pasajero = new ArrayList<Pasajero>();
//         ArrayList<Reserva> reservas = new ArrayList<Reserva>();
//        Pasajero p = new Pasajero("agustin", "caceres", 223, "colon 412", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p1 = new Pasajero("agustin2", "caceres2", 2232, "colon 4122", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p2 = new Pasajero("agustin3", "caceres3", 2233, "colon 4123", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p3 = new Pasajero("agustin4", "caceres4", 2234, "colon 4124", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p4 = new Pasajero("agustin5", "caceres5", 2235, "colon 4125", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p5 = new Pasajero("agustin6", "caceres6", 2236, "colon 4126", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p6 = new Pasajero("agustin7", "caceres7", 2237, "colon 4127", "agustin@hotmail.com", "39336482", "argentina");
//        Pasajero p7 = new Pasajero("agustin8", "caceres8", 2238, "colon 4128", "agustin@hotmail.com", "39336482", "argentina");
//        Recepcionista recep = new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez");
//        pasajero.add(p);
//        pasajero.add(p1);
//        pasajero.add(p2);
//        pasajero.add(p3);
//        pasajero.add(p4);
//        pasajero.add(p5);
//        pasajero.add(p6);
//        pasajero.add(p7);
//        serializar(pasajero);
//            
//            deSerializar(pasajero);
//            System.out.println(pasajero);
//        System.out.println(p7);
//        Habitacion pepita = new Habitacion(1, Habitacion.Tipo.INDIVIDUAL);
//        
//        Habitacion esme = new Habitacion(2, Habitacion.Tipo.DOBLE);
//        Habitacion dasd = new Habitacion(3, Habitacion.Tipo.SUITES);
//        Habitacion ass = new Habitacion(4, Habitacion.Tipo.TRIPLE);
//        Habitacion pep = new Habitacion(5, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion pepital = new Habitacion(6, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esmee = new Habitacion(7, Habitacion.Tipo.DOBLE);
//        Habitacion dasdd = new Habitacion(8, Habitacion.Tipo.SUITES);
//        Habitacion asss = new Habitacion(9, Habitacion.Tipo.TRIPLE);
//        Habitacion pepp = new Habitacion(10, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion pepitas = new Habitacion(11, Habitacion.Tipo.INDIVIDUAL);
//        Habitacion esmes = new Habitacion(12, Habitacion.Tipo.DOBLE);
//        Habitacion dasda = new Habitacion(13, Habitacion.Tipo.SUITES);
//        Habitacion assw = new Habitacion(14, Habitacion.Tipo.TRIPLE);
//        Habitacion pepq = new Habitacion(15, Habitacion.Tipo.INDIVIDUAL);
//        habitaciones.add(pepita);
//        
//        recep.ListadoHabitacionesDisponibles();
//        Reserva reserv = new Reserva(pepita, p);
//        System.out.println(reserv);       
//        try{
//            
//          recep.alquiler(reserv.getCodigoReserva(), "39336482", pepita, p);
//          
//          }
//          catch(PasajeroNoEncontradoException e){
//                  System.out.println(e.getMessage());
//          }
//        reservas.add(reserv);
//          System.out.println(reserv);
//          
//          recep.checkIn(1);
//          
//          System.out.println(pepita);
//          
//          System.out.println(reserv);
//          
//        habitaciones.add(esme);
//        habitaciones.add(dasd);
//        habitaciones.add(ass);
//        habitaciones.add(pep);
//        System.out.println(habitaciones);
//        
//        System.out.println(ass.toString());
//        recep.checkout(4);
//        System.out.println(ass.toString());
//        recep.tareas(4,2);
//        System.out.println(ass.toString());
//        BienvenidoMenu();
//        
//    }
//    
public class TpFinal2 {

    private static Scanner scanner = new Scanner(System.in);

    //private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException //throws FileNotFoundException 
    {
        ArrayList<Recepcionista> recep = new ArrayList<>();
        Recepcionista r1 = new Recepcionista("agustindominguez95@hotmail.com", "123", "Agustin", "Dominguez");
        recep.add(r1);
        ArrayList<Administrador> admin = new ArrayList<>();
        Administrador r2 = new Administrador("azulgotero@hotmail.com", "123", "azul", "gotero");
        admin.add(r2);
        ArrayList<Pasajero> pasaj = new ArrayList<>();
        Pasajero p1 = new Pasajero("susana", "gimenez", 156987456, "Colon 4127", "susana@hotmail.com", "16981236", "argentina");
        Pasajero p2 = new Pasajero("marcelo", "tineli", 156987423, "Las canitas 5041", "marcelo@hotmail.com", "33315151", "argentina");
        Pasajero p3 = new Pasajero("pablo", "hernandez", 15435741, "Portugal 1975", "niggaman@hotmail.com", "39336482", "argentina");
        Pasajero p4 = new Pasajero("matias", "jauregui", 15479632, "Arrue 2030", "matias@hotmail.com", "39180520", "argentina");
        Pasajero p5 = new Pasajero("leonel", "bedoya", 155025416, "Termas de Rio Hondo 8070", "leonelabedoya@hotmail.com", "41369963", "argentina");
        Pasajero p6 = new Pasajero("kevin", "gandola", 156987412, "Brasil 3050", "kevgand@hotmail.com", "41123223", "argentina");
        Pasajero p7 = new Pasajero("braian", "garofalo", 155011360, "3 de febrero 1598", "windh@hotmail.com", "41366878", "argentina");
        Pasajero p8 = new Pasajero("tamara", "sarjen", 154213692, "Nasser 7532", "tamisanjen@hotmail.com", "41412369", "italia");
        Pasajero p9 = new Pasajero("nadia", "balagui", 156999741, "Calaza 9060", "nadu@hotmail.com", "41355874", "argentina");
        Pasajero p10 = new Pasajero("aaron", "gandola", 155569822, "Hillia 50", "aawolf@hotmail.com", "42332147", "argentina");
        Pasajero p11 = new Pasajero("sonia", "martinez", 154000369, "Santa fe 930", "soomartinez@hotmail.com", "17587111", "francia");
        Pasajero p12 = new Pasajero("elizabeth", "dip", 156215798, "Belgrano 6454", "dipeli@hotmail.com", "16685789", "argentina");
        Pasajero p13 = new Pasajero("norma", "bedoya", 155213698, "Lucas Cordoba 769", "normabedoya@hotmail.com", "17666984", "argentina");
        Pasajero p14 = new Pasajero("estela", "ferrari", 154123456, "Libertad 6594", "ferrariestela@hotmail.com", "14222333", "argentina");
        Pasajero p15 = new Pasajero("claudia", "garcia", 156320587, "Tomas c. Guido 3478", "claueligarcia@hotmail.com", "18987412", "argentina");
        Pasajero p16 = new Pasajero("emiliano", "loza", 154364782, "Av. Dr. Arturo Alió 1932", "lozares@hotmail.com", "40363547", "argentina");
        Pasajero p17 = new Pasajero("juan", "perez", 155333111, "Valencia 985", "jecp@hotmail.com", "39201678", "españa");
        Pasajero p18 = new Pasajero("micaela", "puchia", 156987789, "Chubut 1731", "mikup@hotmail.com", "40236987", "chile");
        Pasajero p19 = new Pasajero("cinthia", "gomez", 154210364, "Lijo Lopez 1503", "cintgo@hotmail.com", "35698741", "uruguay");
        Pasajero p20 = new Pasajero("irene", "laviuzza", 155451230, "Bahia Blanca 1838", "irenelaviuzzamat@hotmail.com", "8201123", "argentina");
        pasaj.add(p1);
        pasaj.add(p2);
        pasaj.add(p3);
        pasaj.add(p4);
        pasaj.add(p5);
        pasaj.add(p6);
        pasaj.add(p7);
        pasaj.add(p8);
        pasaj.add(p9);
        pasaj.add(p10);
        pasaj.add(p11);
        pasaj.add(p12);
        pasaj.add(p13);
        pasaj.add(p14);
        pasaj.add(p15);
        pasaj.add(p16);
        pasaj.add(p17);
        pasaj.add(p18);
        pasaj.add(p19);
        pasaj.add(p20);
        ArrayList<Habitacion> room = new ArrayList<>();
        Habitacion ro1 = new Habitacion(1, Habitacion.Tipo.INDIVIDUAL);
        Habitacion ro2 = new Habitacion(2, Habitacion.Tipo.DOBLE);
        Habitacion ro3 = new Habitacion(3, Habitacion.Tipo.SUITES);
        Habitacion ro4 = new Habitacion(4, Habitacion.Tipo.TRIPLE);
        Habitacion ro5 = new Habitacion(5, Habitacion.Tipo.INDIVIDUAL);
        Habitacion ro6 = new Habitacion(6, Habitacion.Tipo.DOBLE);
        Habitacion ro7 = new Habitacion(7, Habitacion.Tipo.SUITES);
        Habitacion ro8 = new Habitacion(8, Habitacion.Tipo.TRIPLE);
        Habitacion ro9 = new Habitacion(9, Habitacion.Tipo.INDIVIDUAL);
        Habitacion ro10 = new Habitacion(10, Habitacion.Tipo.DOBLE);
        Habitacion ro11 = new Habitacion(11, Habitacion.Tipo.SUITES);
        Habitacion ro12 = new Habitacion(12, Habitacion.Tipo.TRIPLE);
        Habitacion ro13 = new Habitacion(13, Habitacion.Tipo.INDIVIDUAL);
        Habitacion ro14 = new Habitacion(14, Habitacion.Tipo.DOBLE);
        Habitacion ro15 = new Habitacion(15, Habitacion.Tipo.SUITES);
        Habitacion ro16 = new Habitacion(16, Habitacion.Tipo.TRIPLE);
        Habitacion ro17 = new Habitacion(17, Habitacion.Tipo.INDIVIDUAL);
        Habitacion ro18 = new Habitacion(18, Habitacion.Tipo.DOBLE);
        Habitacion ro19 = new Habitacion(19, Habitacion.Tipo.SUITES);
        Habitacion ro20 = new Habitacion(20, Habitacion.Tipo.TRIPLE);
        ArrayList<Reserva> reserva = new ArrayList<>();
        room.add(ro1);
        room.add(ro2);
        room.add(ro3);
        room.add(ro4);
        room.add(ro5);
        room.add(ro6);
        room.add(ro7);
        room.add(ro8);
        room.add(ro9);
        room.add(ro10);
        room.add(ro11);
        room.add(ro12);
        room.add(ro13);
        room.add(ro14);
        room.add(ro15);
        room.add(ro16);
        room.add(ro17);
        room.add(ro18);
        room.add(ro19);
        room.add(ro20);
        //System.out.println(pasaj);
        Reserva reserv1 = new Reserva(ro1, p1);
        Reserva reserv2 = new Reserva(ro2, p2);
        Reserva reserv3 = new Reserva(ro3, p3);
        Reserva reserv4 = new Reserva(ro4, p4);
        Reserva reserv5 = new Reserva(ro5, p5);
        Reserva reserv6 = new Reserva(ro6, p6);
        Reserva reserv7 = new Reserva(ro7, p7);
        Reserva reserv8 = new Reserva(ro8, p8);
        Reserva reserv9 = new Reserva(ro9, p9);
        Reserva reserv10 = new Reserva(ro10, p10);
        Reserva reserv11 = new Reserva(ro11, p11);
        Reserva reserv12 = new Reserva(ro12, p12);
        Reserva reserv13 = new Reserva(ro13, p13);
        Reserva reserv14 = new Reserva(ro14, p14);
        Reserva reserv15 = new Reserva(ro15, p15);
        Reserva reserv16 = new Reserva(ro16, p16);
        Reserva reserv17 = new Reserva(ro17, p17);
        Reserva reserv18 = new Reserva(ro18, p18);
        Reserva reserv19 = new Reserva(ro19, p19);
        Reserva reserv20 = new Reserva(ro20, p20);
        try {

            r1.alquiler(reserv1.getCodigoReserva(), "16981236", ro1, p1);
            r1.alquiler(reserv2.getCodigoReserva(), "33315151", ro2, p2);
            r1.alquiler(reserv3.getCodigoReserva(), "16981236", ro3, p3);
            r1.alquiler(reserv4.getCodigoReserva(), "33315151", ro4, p4);
            r1.alquiler(reserv5.getCodigoReserva(), "16981236", ro5, p5);
            r1.alquiler(reserv6.getCodigoReserva(), "33315151", ro6, p6);
            r1.alquiler(reserv7.getCodigoReserva(), "16981236", ro7, p7);
            r1.alquiler(reserv8.getCodigoReserva(), "33315151", ro8, p8);
            r1.alquiler(reserv9.getCodigoReserva(), "16981236", ro9, p9);
            r1.alquiler(reserv10.getCodigoReserva(), "33315151", ro10, p10);
            r1.alquiler(reserv11.getCodigoReserva(), "16981236", ro11, p11);
            r1.alquiler(reserv12.getCodigoReserva(), "33315151", ro12, p12);
            r1.alquiler(reserv13.getCodigoReserva(), "16981236", ro13, p13);
            r1.alquiler(reserv14.getCodigoReserva(), "33315151", ro14, p14);
            r1.alquiler(reserv15.getCodigoReserva(), "16981236", ro15, p15);
            r1.alquiler(reserv16.getCodigoReserva(), "33315151", ro16, p16);
            r1.alquiler(reserv17.getCodigoReserva(), "16981236", ro17, p17);
            r1.alquiler(reserv18.getCodigoReserva(), "33315151", ro18, p18);
            r1.alquiler(reserv19.getCodigoReserva(), "16981236", ro19, p19);
            r1.alquiler(reserv20.getCodigoReserva(), "33315151", ro20, p20);

        } catch (PasajeroNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
        reserva.add(reserv1);
        reserva.add(reserv2);
        reserva.add(reserv3);
        reserva.add(reserv4);
        reserva.add(reserv5);
        reserva.add(reserv6);
        reserva.add(reserv7);
        reserva.add(reserv8);
        reserva.add(reserv9);
        reserva.add(reserv10);
        reserva.add(reserv11);
        reserva.add(reserv12);
        reserva.add(reserv13);
        reserva.add(reserv14);
        reserva.add(reserv15);
        reserva.add(reserv16);
        reserva.add(reserv17);
        reserva.add(reserv18);
        reserva.add(reserv19);
        reserva.add(reserv20);
        System.out.println(reserva);

        BienvenidoMenu(admin, recep, pasaj, room, reserva);
        // serializar(pasaj,recep);
//        deSerializar(room,new File ("pasajeros.son"));
//        recep.get(0);
//System.out.println(recep.get(0));
    }

    static void BienvenidoMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

        System.out.println("=== Bienvenido al Hotel ===");
        System.out.println("1. Administrador");
        System.out.println("2. Recepcionista");
        System.out.println("3. Pasajero");
        System.out.print("Ingrese la opcion: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                AdminMenu(admin, recep, pasaj, pieza, reserva);

                break;
            case 2:
                RecepcionistaMenu(admin, recep, pasaj, pieza, reserva);

                break;
            case 3:
                PasajeroMenu(admin, recep, pasaj, pieza, reserva);

                break;
            default:
                break;
        }
    }

    static void MenuHabitaciones(ArrayList<Habitacion> room, ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Reserva> reserva) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Habitaciones ===");
        System.out.println("1. Ver todas"); // Muestra todas las habitaciones
        System.out.println("2. Ver disponibles"); // Muestra todas las habitaciones disponibles
        System.out.println("3. Menu Recepcionista"); //Vuelve al menu de Administrador
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }

        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println(room);
                MenuHabitaciones(room, admin, recep, pasaj, reserva);
                break;
            case 2:
                mostrarhabitacionesdisponibles(room);
                break;
            case 3:
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            default:
                break;
        }
    }

    static void mostrarhabitacionesdisponibles(ArrayList<Habitacion> room) {
        for (Habitacion habitacion : room) {
            if (habitacion.getEstado() == habitacion.estado.DISPONIBLE) {
                System.out.println(habitacion);
            }
        }
    }

    static void RecepcionistaMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Recepcionista ===");
        System.out.println("1. Realizar CheckIN");
        System.out.println("2. Realizar CheckOUT");
        System.out.println("3. Realizar Reservas");
        System.out.println("4. Realizar tareas sobre habitacion");
        System.out.println("5. Mostrar recepcionistas");
        System.out.println("6. Listado de Habitaciones disponibles");
        System.out.println("7. Modificar pasajero");
        System.out.println("8. Volver Menu principal");
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Ingrese numero de habitacion para el checkin:");
                int NumeroHabitacioncheckin = scanner.nextInt();
                recep.get(0).checkIn(NumeroHabitacioncheckin);
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            case 2: // Realizar checkout
                System.out.println("Ingrese numero de habitacion para el checkout:");
                int NumeroHabitacion = scanner.nextInt();
                recep.get(0).checkout(NumeroHabitacion);
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
                break;
            case 3:  // Realizar Reservas

                System.out.println("Ingrese numero de habitacion para el alquiler:");
                int m = scanner.nextInt();
                System.out.println("Ingrese numero de dni para el alquiler:");
                String dni = scanner.next();

                try {
                    Reserva nueva = new Reserva(recep.get(0).buscarHabitacion(m), recep.get(0).buscarPasajero(dni));
                    nueva = recep.get(0).alquiler(m, dni, recep.get(0).buscarHabitacion(m), recep.get(0).buscarPasajero(dni));
                    reserva.add(nueva);

                } catch (PasajeroNoEncontradoException ex) {
                    System.out.println(ex.getLocalizedMessage());
                }

                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
                break;
            case 4:
                System.out.println("Ingrese numero de habitacion sobre la cual realizar la tarea:");
                int Num = scanner.nextInt();
                System.out.println("Tareas sobre la habitacion: (1)Limpieza, (2)Desinfeccion, (3)Reparaciones");
                int t = scanner.nextInt();
                recep.get(0).tareas(Num, t);
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            case 5:
                System.out.println(recep.toString());
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            case 6:
                MenuHabitaciones(room, admin, recep, pasaj, reserva);
                break;
            case 7:
                 System.out.println("Ingrese numero de dni para la modificacion:");
                String dny = scanner.next();
                System.out.println("Ingrese al cliente ha modificar:");
                int pos = scanner.nextInt();
        
            try {
                modificarPasajero(pasaj,dny,pos);
            } catch (PasajeroNoEncontradoException ex) {
                System.out.println(ex.getMessage());
            }
        
                break;
            case 8:
                BienvenidoMenu(admin, recep, pasaj, room, reserva);
            default:
                break;
        }

    }

    static void modificarPasajero(ArrayList<Pasajero> pasaj, String dni, int pos) throws PasajeroNoEncontradoException {
        if (pasaj.get(pos).getDni().equals(dni)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Para modificar nombre");
            System.out.println("2. Para modificar apellido");
            System.out.println("3. Para modificar telefono");
            System.out.println("4. Para modificar dni");
            System.out.println("5. Para modificar direccion");
            System.out.println("6. Para modificar email");
            System.out.println("7. Para modificar origen");
            System.out.println("8. Salir de modificar");

            System.out.print("Ingrese la opcion: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese la opcion: ");
                scanner.next();
            }
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre:");
                    String nombre = scanner.next();
                    pasaj.get(pos).setNombre(nombre);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 2:
                    System.out.println("Ingrese apellido:");
                    String apellido = scanner.next();
                    pasaj.get(pos).setApellido(apellido);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 3:
                    System.out.println("Ingrese telefono:");
                    int telefono = scanner.nextInt();
                    pasaj.get(pos).setTelefono(telefono);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 4:
                    System.out.println("Ingrese dni:");
                    String dnix = scanner.next();
                    pasaj.get(pos).setDni(dnix);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 5:
                    System.out.println("Ingrese direccion:");
                    String direccion = scanner.next();
                    pasaj.get(pos).setDireccion(direccion);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 6:

                    System.out.println("Ingrese e-mail:");
                    String email = scanner.next();
                    pasaj.get(pos).setEmail(email);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 7:
                    System.out.println("Ingrese origen:");
                    String origen = scanner.next();
                    pasaj.get(pos).setOrigen(origen);
                    modificarPasajero(pasaj, dni, pos);
                    break;
                case 8:
                    break;
            }

        }
        throw new PasajeroNoEncontradoException("El pasajero " + pasaj.get(pos) + " no existe");
    }

    static void MenuCreacion(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Creacion ===");
        System.out.println("1. Agregar Administrador"); // Crea una persona de tipo admin
        System.out.println("2. Agregar Recepcinista"); // Crea una persona de tipo recep
        System.out.println("3. Agregar Pasajero"); // Crea una persona de tipo admin
        System.out.println("4. Volver AdminMenu"); // Crea una persona de tipo admin
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        switch (seleccion) {
            case 1:
                creaAdm(admin, recep, pasaj, room, reserva);
                break;
            case 2:
                creaRecep(admin, recep, pasaj, room, reserva);
                break;
            case 3:
                creaPasaj(admin, recep, pasaj, room, reserva);
                break;
            case 4:
                AdminMenu(admin, recep, pasaj, room, reserva);
            default:
                break;
        }
    }

    static void creaAdm(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido:");
        String apellido = scanner.next();
        System.out.println("Ingrese usuario:");
        String usuario = scanner.next();
        System.out.println("Ingrese contraseniaa:");
        String contrasenia = scanner.next();
        Administrador nuevo = new Administrador(usuario, contrasenia, nombre, apellido);
        System.out.println("Se ha creado un administrador");
        admin.add(nuevo);
        MenuCreacion(admin, recep, pasaj, room, reserva);
    }

    static void creaRecep(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido:");
        String apellido = scanner.next();
        System.out.println("Ingrese usuario:");
        String usuario = scanner.next();
        System.out.println("Ingrese contraseniaa:");
        String contrasenia = scanner.next();
        Recepcionista nuevo = new Recepcionista(usuario, contrasenia, nombre, apellido);
        System.out.println("Se ha creado un administrador");
        recep.add(nuevo);
        MenuCreacion(admin, recep, pasaj, room, reserva);
    }

    static void creaPasaj(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido:");
        String apellido = scanner.next();
        System.out.println("Ingrese telefono:");
        int telefono = scanner.nextInt();
        System.out.println("Ingrese direccion:");
        String direccion = scanner.next();
        System.out.println("Ingrese e-mail:");
        String email = scanner.next();
        System.out.println("Ingrese dni:");
        String dni = scanner.next();
        System.out.println("Ingrese origen:");
        String origen = scanner.next();
        Pasajero nuevo = new Pasajero(nombre, apellido, telefono, direccion, email, dni, origen);
        System.out.println("Se ha creado un pasajero");
        pasaj.add(nuevo);
        MenuCreacion(admin, recep, pasaj, room, reserva);
    }

    static void PasajeroMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Pasajero ===");
        System.out.println("1. Mostrar pasajeros"); // Muestra lista pasajeros
        System.out.println("2. Cancelar Reserva"); //Cancela la reserva
        System.out.println("3. Volver Menu principal");
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        int eleccion;
        switch (seleccion) {

            case 1: {
                System.out.println("----------------Pasajeros cargados en el sistema----------------");
                try {
                    deSerializar(admin, new File("pasajeros.son"));
                } catch (FileNotFoundException ex) {

                }
            }
            System.out.println("----------------Pasajeros nuevos----------------");
            System.out.println(pasaj.toString());
            PasajeroMenu(admin, recep, pasaj, pieza, reserva);
            break;
            case 2:
                System.out.println("Eleccion del Pasajero:");
                eleccion = scanner.nextInt();
                System.out.println("Ingrese codigo de reserva");
                int CodigoReserva = scanner.nextInt();
                pasaj.get(eleccion).CancelarReserva(CodigoReserva);
                PasajeroMenu(admin, recep, pasaj, pieza, reserva);
                break;
            case 3:
                BienvenidoMenu(admin, recep, pasaj, pieza, reserva);
                break;
            default:
                break;
        }
    }

    static void AdminMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Administrador ===");
        System.out.println("1. Agregar Usuario"); // Crea una persona de tipo admin-recep-pasajero
        System.out.println("2. Crear backup"); //Crea un archivo con todos los usuarios registrados en el hotel (incluye empleados)
        System.out.println("3. Mostrar Administrador"); //Vuelve al menu de Administrador
        System.out.println("4. Volver Menu principal");
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        switch (seleccion) {
            case 1:
                MenuCreacion(admin, recep, pasaj, pieza, reserva); //modificar para que se puedan agregar de tipo recep/admin

                break;
            case 2:
                backup(pasaj, recep);
                AdminMenu(admin, recep, pasaj, pieza, reserva);
                break;
            case 3:
                System.out.println(admin.toString());
                AdminMenu(admin, recep, pasaj, pieza, reserva);
                break;
            case 4:
                BienvenidoMenu(admin, recep, pasaj, pieza, reserva);
                break;
            default:
                break;
        }
    }

    public static void backup(ArrayList<Pasajero> pasajero, ArrayList<Recepcionista> empleados) {
        Gson gson = new Gson();
        System.out.println("=== Menu de Backup ===");
        System.out.println("1. Pasajeros"); // Crea un file de pasajeros
        System.out.println("2. Empleados"); // No incluye admins
        System.out.println("0. Salir"); // No incluye admins
        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        switch (seleccion) {
            case 1:
                String strPasajeros = gson.toJson(pasajero);

                FileWriter archivoPasajero = null;
                try {
                    archivoPasajero = new FileWriter("pasajeros.son");
                    archivoPasajero.write(strPasajeros);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (archivoPasajero != null) {
                        try {
                            archivoPasajero.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
            case 2:
                String strEmleados = gson.toJson(empleados);

                FileWriter archivoEmpleado = null;
                try {
                    archivoEmpleado = new FileWriter("empleados.son");
                    archivoEmpleado.write(strEmleados);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (archivoEmpleado != null) {
                        try {
                            archivoEmpleado.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;
        }
    }
    
    public static void serializarReservas (ArrayList<Reserva> reservacion)
    {
        Gson gson = new Gson();
        String strReservas = gson.toJson(reservacion);
        
        FileWriter archivoReservas = null;
                try {
                    archivoReservas = new FileWriter("reservas.son");
                    archivoReservas.write(strReservas);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (archivoReservas != null) {
                        try {
                            archivoReservas.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
    }

    public static void deSerializar(List p, File file) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Gson gson = new Gson();

        FileReader reader = null;
        try {
            reader = new FileReader(file);
            List deser = gson.fromJson(bufferedReader, List.class);

            for (int i = 0; i < deser.size(); i++) {
                System.out.println(deser.get(i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
