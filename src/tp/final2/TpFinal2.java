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
    public static void main(String[] args) //throws FileNotFoundException 
    {
        ArrayList<Recepcionista> recep = new ArrayList<>();
        ArrayList<Administrador> admin = new ArrayList<>();
        ArrayList<Pasajero> pasaj = new ArrayList<>();
        ArrayList<Habitacion> room = new ArrayList<>();
        BienvenidoMenu(admin, recep, pasaj, room);
    }

    static void BienvenidoMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza) {

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
                AdminMenu(admin, recep, pasaj,pieza);

                break;
            case 2:
                RecepcionistaMenu(admin, recep, pasaj, pieza);

                break;
            case 3:
                PasajeroMenu(admin, recep, pasaj,pieza);

                break;
            default:
                break;
        }
    }

    static void MenuHabitaciones(ArrayList<Habitacion> room, ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza) {
        Scanner scanner = new Scanner(System.in);

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
                System.out.println(room.toString());
                break;
            case 3:

                break;
            case 4:
                RecepcionistaMenu(admin, recep, pasaj, pieza);
                break;
        }
    }

    static void RecepcionistaMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room) {

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
        int eleccion;
        System.out.println("Eleccion del recepcionista:");
        eleccion = scanner.nextInt();
        switch (seleccion) {
            case 1:

                System.out.println("Ingrese numero de habitacion para el checkin:");
                int NumeroHabitacioncheckin = scanner.nextInt();
                recep.get(eleccion).checkIn(NumeroHabitacioncheckin);
            case 2: // Realizar checkout
                System.out.println("Ingrese numero de habitacion para el checkout:");
                int NumeroHabitacion = scanner.nextInt();
                recep.get(eleccion).checkout(NumeroHabitacion);
                break;
            case 4:  // Realizar Reservas
                //recep.get(eleccion).alquiler();
                break;
            case 5:
                MenuHabitaciones(room, admin, recep, pasaj, room);
                break;
            case 6:
                BienvenidoMenu(admin, recep, pasaj, room);
            default:
                break;
        }

    }

    static void MenuCreacion(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room) {

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
                creaAdm(admin,recep,pasaj,room);
                break;
            case 2:
                creaRecep(admin,recep,pasaj,room);
                break;
            case 3:
                creaPasaj(admin,recep,pasaj,room);
                break;
            case 4:
                AdminMenu(admin, recep, pasaj,room);
                break;
        }
    }

    static void creaAdm(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room) {
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
        MenuCreacion(admin,recep,pasaj,room);
    }

    static void creaRecep(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room) {
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
        MenuCreacion(admin,recep,pasaj,room);
    }

    static void creaPasaj(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room) {
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
        MenuCreacion(admin,recep,pasaj,room);
    }

    static void nuevaHabitacion() {
        ArrayList<Habitacion> room = new ArrayList<>();
        for (int a = 1; a < 21; a++) {
            room.add(new Habitacion(a, Habitacion.Tipo.INDIVIDUAL));
            room.add(new Habitacion(a, Habitacion.Tipo.DOBLE));
            room.add(new Habitacion(a, Habitacion.Tipo.SUITES));
            room.add(new Habitacion(a, Habitacion.Tipo.TRIPLE));

        }

    }

    static void PasajeroMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza) {

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
        int eleccion;
        System.out.println("Eleccion del Pasajero:");
        eleccion = scanner.nextInt();
        switch (seleccion) {

            case 1:

                System.out.println(pasaj.toString());

                break;
            case 2:
                System.out.println("Ingrese codigo de reserva");
                int CodigoReserva = scanner.nextInt();
                pasaj.get(eleccion).CancelarReserva(CodigoReserva);
                break;
            case 3:
                BienvenidoMenu(admin, recep, pasaj,pieza);
                break;
            default:
                break;
        }
    }

    static void AdminMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza) {

        System.out.println("=== Menu de Administrador ===");
        System.out.println("1. Agregar Usuario"); // Crea una persona de tipo admin-recep-pasajero
        System.out.println("2. Crear backup usuarios"); //Crea un archivo con todos los usuarios registrados en el hotel (incluye empleados)
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
                MenuCreacion(admin,recep,pasaj,pieza); //modificar para que se puedan agregar de tipo recep/admin
                
                break;
            case 2:
                serializar(admin,pasaj);
                AdminMenu(admin,recep,pasaj,pieza);
                break;
            case 3:
                System.out.println(admin.toString());
                AdminMenu(admin,recep,pasaj,pieza);
                break;
            case 4:
                BienvenidoMenu(admin, recep, pasaj,pieza);
                break;
            default:
                break;
        }
    }
    public static void serializar (List pasajero, List empleados){
        Gson gson = new Gson();
        String strPasajeros=gson.toJson(pasajero);
        
        FileWriter archivoPasajero=null;
        try{
        archivoPasajero= new FileWriter("pasajeros.son");
        archivoPasajero.write(strPasajeros);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(archivoPasajero != null)
        {
            try{
                archivoPasajero.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
        String strEmleados=gson.toJson(empleados);
        
        FileWriter archivoEmpleado=null;
        try{
        archivoEmpleado= new FileWriter("empleados.son");
        archivoEmpleado.write(strEmleados);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(archivoEmpleado != null)
        {
            try{
                archivoEmpleado.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
        
    
    }
}
    
//
//    }
//    public static void deSerializar (ArrayList<Pasajero> p) throws FileNotFoundException{
//        
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("pasajeros.son")));
//        Gson gson = new Gson();
//        List<Pasajero> pasaj = gson.fromJson(bufferedReader, new TypeToken<ArrayList<Pasajero>>(){}.getType());  
//        FileReader reader=null;
//        try{
//        reader= new FileReader("pasajeros.son");
//        }catch(IOException e){
//            e.printStackTrace();
//        }finally{
//            if(reader != null)
//        {
//            try{
//                reader.close();
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }

