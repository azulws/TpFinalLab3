
package tp.final2.menu;

import java.util.Scanner;

public class AdminMenu {
    public void imprimir() { 
 Scanner scanner = new Scanner(System.in);

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
                MenuCreacion create = new MenuCreacion(); //modificar para que se puedan agregar de tipo recep/admin
                    
                break;
            case 2:
                // admin.backup();  //funcion del admin que pasa los datos del Tresset Al Archivo. Esta en main **Probar**

                break;
            case 3:
                this.toString();
                break;
            case 4:
                BienvenidoMenu menu=new BienvenidoMenu();
                break;
            default:
                break;
        }
    }
}
