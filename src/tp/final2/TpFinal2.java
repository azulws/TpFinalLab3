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

public class TpFinal2 {
    
    /**
 * 
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */

    private static Scanner scanner = new Scanner(System.in);

    
   /**
     *  Main, se crean las listas que vamos a utilizar.
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {

        Hotel hotel=new Hotel();
        ArrayList<Administrador> admin=new ArrayList<>();
        ArrayList<Recepcionista> recep=new ArrayList<>();
        ArrayList<Pasajero> pasaj=new ArrayList<>();
        ArrayList<Habitacion> pieza=new ArrayList<>();
        ArrayList<Reserva> reserva=new ArrayList<>();
        Bienvenidos(hotel, admin, recep, pasaj, pieza, reserva);
    }
    
    
    /**
     * Recibe 1 hotel y las listas necesarias para invocar el menu
     */
    static void Bienvenidos(Hotel hotel,ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva)
    {
        System.out.println("=== Bienvenido al Hotel===");
        System.out.println(hotel);
        BienvenidoMenus(admin,recep,pasaj,pieza,reserva);
        
    }
    
    /**
     *  Recibe las listas necesarias,y nos proporciona el menu principal
     */
    static void BienvenidoMenus(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

       
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

    /**
     *  Menu para realizar distintas operaciones con las habitaciones del hotel
     */
    static void MenuHabitaciones(ArrayList<Habitacion> room, ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Reserva> reserva) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Habitaciones ===");
        System.out.println("1. Crea habitaciones"); 
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
                habitaciones(room); 
            case 2:
                System.out.println(room);
                MenuHabitaciones(room, admin, recep, pasaj, reserva);
                break;
            case 3:
                mostrarhabitacionesdisponibles(room);
                break;
            case 4:
                RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            default:
                break;
        }
    }
    
    /**
     *  Funcion auxiliar para la creacion de habitaciones, donde el numero de habitacion se va incrementando
     */
     static void habitaciones(ArrayList<Habitacion> room) {
        for (int a=1; a<21; a++) {
           room.add(new Habitacion(a,Habitacion.Tipo.INDIVIDUAL)); 
           a++;
           room.add(new Habitacion(a,Habitacion.Tipo.DOBLE)); 
           a++;
           room.add(new Habitacion(a,Habitacion.Tipo.TRIPLE)); 
           a++;
           room.add(new Habitacion(a,Habitacion.Tipo.SUITES)); 
           
        }
    }
     
     /**
     *  Funcion para mostrar el listado de habitaciones disponibles
     */
    static void mostrarhabitacionesdisponibles(ArrayList<Habitacion> room) {
        for (Habitacion habitacion : room) {
            if (habitacion.getEstado() == habitacion.estado.DISPONIBLE) {
                System.out.println(habitacion);
            }
        }
    }
    
    /**
     *  Menu para realizar operaciones que corresponden al recepcionista
     */
    static void RecepcionistaMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> room, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Recepcionista ===");
        System.out.println("1. Realizar CheckIN");
        System.out.println("2. Realizar CheckOUT");
        System.out.println("3. Realizar Reservas");
        System.out.println("4. Realizar tareas sobre habitacion");
        System.out.println("5. Mostrar recepcionistas");
        System.out.println("6. Mostrar Pasajeros");
        System.out.println("7. Menu habitaciones");
        System.out.println("8. Modificar pasajero");
        System.out.println("0. Volver Menu principal");
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
                {
                System.out.println("----------------Pasajeros cargados en el sistema----------------");
                try {
                    deSerializar(admin, new File("pasajeros.son"));
                } catch (FileNotFoundException ex) {

                }
            }
            RecepcionistaMenu(admin, recep, pasaj, room, reserva);
            case 7:
                MenuHabitaciones(room, admin, recep, pasaj, reserva);
                break;
            case 8:
                System.out.println("Ingrese numero de dni para la modificacion:");
                String dny = scanner.next();
                System.out.println("Ingrese al cliente a modificar:");
                int pos = scanner.nextInt();

                try {
                    modificarPasajero(pasaj, dny, pos);
                } catch (PasajeroNoEncontradoException ex) {
                    System.out.println(ex.getMessage());
                }

                break;
            case 0:
                BienvenidoMenus(admin, recep, pasaj, room, reserva);
            default:
                break;
        }

    }
    
    /**
     *  SubMenu para modificar algun dato del pasajero, en caso de ser mal cargado en el sistema.
     * @throws PasajeroNoEncontradoException
     */

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

    /**
     *  Submenu del Admin, que nos permite crear un usuario de cualqueir tipo
     */
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

    /**
     *  Nos crea un admin y lo agrega a una lista de ese tipo
     */
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

    /**
     *  Nos crea un Recepcionista y lo agrega a una lista de ese tipo
     */
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

    /**
     *  Nos crea un pasajero y lo agrega a una lista de ese tipo
     */
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

    /**
     *  Menu del pasajero, solo podremos cancelar la reserva
     */
    static void PasajeroMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Pasajero ===");
        System.out.println("1. Cancelar Reserva"); //Cancela la reserva
        System.out.println("0. Volver Menu principal");
        System.out.print("Ingrese la opcion: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Ingrese la opcion: ");
            scanner.next();
        }
        int seleccion = scanner.nextInt();
        int eleccion;
        switch (seleccion) {
            case 1:
                System.out.println("Eleccion del Pasajero:");
                eleccion = scanner.nextInt();
                System.out.println("Ingrese codigo de reserva");
                int CodigoReserva = scanner.nextInt();
                pasaj.get(eleccion).CancelarReserva(CodigoReserva);
                PasajeroMenu(admin, recep, pasaj, pieza, reserva);
                break;
            case 0:
                BienvenidoMenus(admin, recep, pasaj, pieza, reserva);
                break;
            default:
                break;
        }
    }

  /**
     *  Menu del Administrador donde podremos realizar operaciones administrativas
     */
    static void AdminMenu(ArrayList<Administrador> admin, ArrayList<Recepcionista> recep, ArrayList<Pasajero> pasaj, ArrayList<Habitacion> pieza, ArrayList<Reserva> reserva) {

        System.out.println("=== Menu de Administrador ===");
        System.out.println("1. Agregar Usuario"); // Crea una persona de tipo admin-recep-pasajero
        System.out.println("2. Crear backup"); //Crea un archivo con todos los usuarios registrados en el hotel (incluye empleados)
        System.out.println("3. Mostrar Administrador"); //Vuelve al menu de Administrador
        System.out.println("4. Crear backup reserva"); //Crea un archivo con todos las reservas registradas en el hotel
        System.out.println("5. Volver Menu principal");
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
                serializarReservas(reserva);
                AdminMenu(admin, recep, pasaj, pieza, reserva);
                break;
            case 5:
                BienvenidoMenus(admin, recep, pasaj, pieza, reserva);
                break;
            default:
                break;
        }
    }

    /**
     *  Utiliza la libreria de Gson para leer una lista de pasajeros o empleados,segun indiquemos, y guarda el contenido en un archivo
     */
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

    /**
     *  Serializa una lista de reservas
     */
    public static void serializarReservas(ArrayList<Reserva> reservacion) {
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
    
    /**
     *  Deserializa la lista de reservas previamente serializada 
     * @throws FileNotFoundException
     */

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
