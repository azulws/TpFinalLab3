package tp.final2;

import java.time.LocalDate;
import java.util.*;

public class Recepcionista extends Persona {

    private List<Pasajero> clientes;
    private List<Habitacion> pieza;
    private List<Reserva> alquileres;
    private List<Recepcionista> recepcion;
    private String usuario;
    private String contraseña;

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido, List<Pasajero> clientes) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.clientes = clientes;
        this.pieza = new ArrayList<>();//meter todo en el constructor;
        this.alquileres = new ArrayList<>();//meter todo en el constructor;
        this.recepcion = new ArrayList<>();//meter todo en el constructor;
    }
    
    

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Pasajero buscarPasajero(String dni) throws PasajeroNoEncontradoException {
        for (Pasajero turista : this.clientes) {
            if (turista.getDni().equals(dni)) {
                return turista;
            }
        }
        throw new PasajeroNoEncontradoException("no se encontro");
    }

    public Reserva buscarReserva(int CodigoReserva) {
        for (Reserva alquiler : this.alquileres) {
            if (alquiler != null && alquiler.getCodigoReserva() == CodigoReserva) {
                return alquiler;
            }
        }
        return null;
    }
    
       public Habitacion BuscarHabitacion(int num)  {
           for (Habitacion encontrada : this.pieza) {
               if (encontrada.getNumeroHabitacion()==num) {
               System.out.println("Habitacion encontrada");
                return encontrada;
                   
            }
               
           }
           return null;
        } 
       
        public Reserva alquiler(int CodigoReserva, String dni) throws PasajeroNoEncontradoException  {
            Reserva piezas = buscarReserva(CodigoReserva);
            Pasajero cliente = buscarPasajero(dni);
            if (piezas != null && cliente != null) {
                piezas.setListadoDisponible(piezas.getListadoDisponible() - 1);;
                Reserva alquiler = new Reserva(pieza,clientes);
    
                for (Reserva cuarto: alquileres) {
                    if (alquiler == null) {
                        alquileres.add(alquiler);
                        break;
                    }
                }
                return alquiler;
            }
            return null;
        }
        
    public Habitacion libre() {
        for (Habitacion room : pieza) {
            if (room.estado.OCUPADA == null) {
                return room;

            }
        }
        return null;
    }

    public Habitacion checkIn(int num) {
        Habitacion cuarto=BuscarHabitacion(num);
        if(cuarto!=null){
           cuarto.setEstado(Habitacion.Estado.OCUPADA);
           return cuarto; 
        }
        else
        {
            System.out.println("No esta diponible");
        }
        return null;
    }

    public void ListadoHabitacionesDisponibles() {
        for (int a = 0; a < pieza.size(); a++) {
            pieza.toString();
        }
    }

    public boolean ModificarPasajero(Pasajero p, String dni) throws PasajeroNoEncontradoException {
        if (p.getDni().equals(dni)) {
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
                    p.setNombre(nombre);
                    ModificarPasajero(p, dni);
                    break;
                case 2:
                    System.out.println("Ingrese apellido:");
                    String apellido = scanner.next();
                    p.setApellido(apellido);
                    ModificarPasajero(p, dni);
                    break;
                case 3:
                    System.out.println("Ingrese telefono:");
                    int telefono = scanner.nextInt();
                    p.setTelefono(telefono);
                    ModificarPasajero(p, dni);
                    break;
                case 4:
                    System.out.println("Ingrese dni:");
                    String dnix = scanner.next();
                    p.setDni(dnix);
                    ModificarPasajero(p, dni);
                    break;
                case 5:
                    System.out.println("Ingrese direccion:");
                    String direccion = scanner.next();
                    p.setDireccion(direccion);
                    ModificarPasajero(p, dni);
                    break;
                case 6:

                    System.out.println("Ingrese e-mail:");
                    String email = scanner.next();
                    p.setEmail(email);
                    ModificarPasajero(p, dni);
                    break;
                case 7:
                    System.out.println("Ingrese origen:");
                    String origen = scanner.next();
                    p.setOrigen(origen);
                    ModificarPasajero(p, dni);
                    break;
                case 8:
                    break;
            }
            return true;
        }
        throw new PasajeroNoEncontradoException("El pasajero " + p + " no existe");
    }

    @Override
    public String toString() {
        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
    }

}
