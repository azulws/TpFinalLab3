
package tp.final2.menu;

import java.util.ArrayList;
import java.util.Scanner;
import tp.final2.Administrador;
import tp.final2.Pasajero;
import tp.final2.Recepcionista;


public class MenuCreacion {
     private static Scanner scanner = new Scanner(System.in);

    public void creacion() {

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

    }

    public void proceso() {
        int seleccion = scanner.nextInt();

        switch (seleccion) {
            case 1:

                CreaAdm();
                break;
            case 2:
                CreaRecep();
                break;
            case 3:
                CreaPasaj();
                break;
            case 4:
                AdminMenu go = new AdminMenu();
                break;
        }

    }

    public void CreaAdm() {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido:");
        String apellido = scanner.next();
        System.out.println("Ingrese usuario:");
        String usuario = scanner.next();
        System.out.println("Ingrese contraseniaa:");
        String contrasenia = scanner.next();
          System.out.println("Ingrese email:");
        String email = scanner.next();
        Administrador nuevo = new Administrador(usuario, contrasenia, nombre, apellido);
        System.out.println("Se ha creado un administrador");
        ArrayList<Administrador> admin=new ArrayList<>();
        admin.add(nuevo);
        creacion();
    }

    public void CreaRecep() {
        System.out.println("Ingrese nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese apellido:");
        String apellido = scanner.next();
        System.out.println("Ingrese usuario:");
        String usuario = scanner.next();
        System.out.println("Ingrese contraseniaa:");
        String contrasenia = scanner.next();
           System.out.println("Ingrese email:");
        String email = scanner.next();
        Recepcionista nuevo = new Recepcionista(usuario, contrasenia, nombre, apellido);
        System.out.println("Se ha creado un administrador");
         ArrayList<Recepcionista> recep=new ArrayList<>();
        recep.add(nuevo);
        creacion();
    }

    public void CreaPasaj() {
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
         ArrayList<Pasajero> pasaj=new ArrayList<>();
        pasaj.add(nuevo);
        creacion();
    }
}
