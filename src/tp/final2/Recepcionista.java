package tp.final2;

import java.time.LocalDate;
import java.util.*;

public class Recepcionista extends Persona {

    private List<Pasajero> clientes;
    private List<Habitacion> pieza;
    private List<Reserva> alquileres;
    private String usuario;
    private String contraseña;

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.clientes = new ArrayList<>();
        this.pieza = new ArrayList<>();
        this.alquileres = new ArrayList<>();
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
            }else{
       throw new PasajeroNoEncontradoException("no se encontro");
        }
    }
        return null;
    }
    
    public Reserva buscarReserva(int CodigoReserva) {
        for (Reserva alquiler : this.alquileres) {
            if (alquiler != null && alquiler.getCodigoReserva() == CodigoReserva) {
                return alquiler;
            }
        }
        return null;
    }

    public Habitacion buscarHabitacion(int num) {
        for (Habitacion encontrada : this.pieza) {
            if (encontrada.getNumeroHabitacion() == num) {

                return encontrada;

            }

        }
        return null;
    }

    public Reserva alquiler(int CodigoReserva, String dni, Habitacion p, Pasajero c) throws PasajeroNoEncontradoException {
        Reserva piezas = buscarReserva(CodigoReserva);
        Pasajero cliente = buscarPasajero(dni);
        if (piezas != null && cliente != null) {
            piezas.setListadoDisponible(piezas.getListadoDisponible() - 1);;
            Reserva alquiler = new Reserva(p, c);

            for (Reserva cuarto : alquileres) {
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
            if (room.estado.OCUPADO == null) {
                return room;

            }
        }
        return null;
    }

    public Habitacion checkIn(int num) {
        Habitacion cuarto = buscarHabitacion(num);
        if (cuarto != null && cuarto.getEstado() == cuarto.estado.DISPONIBLE) {
            cuarto.setEstado(cuarto.estado.OCUPADO);
            return cuarto;
        } else {
            System.out.println(" La habitacion esta diponible");
        }
        return null;
    }

    public Habitacion checkout(int num) {
        Habitacion cuarto = buscarHabitacion(num);
        if (cuarto != null && cuarto.getEstado() == cuarto.estado.OCUPADO) {
            cuarto.setEstado(cuarto.estado.NO_DISPONIBLE);
            return cuarto;
        } else {
            System.out.println("La habitacion sigue diponible");
        }
        return null;
    }

    public Habitacion tareas(int num, int t) {
        Habitacion cuarto = buscarHabitacion(num);
        if (cuarto != null && cuarto.getEstado() == cuarto.estado.NO_DISPONIBLE) {
            if (t == 1) {
                System.out.println("Se ha realizado la limpieza");
                cuarto.setEstado(cuarto.estado.DISPONIBLE);
            } else if (t == 2) {
                System.out.println("Se ha realizado la desinfeccion");
                cuarto.setEstado(cuarto.estado.DISPONIBLE);
            } else {
                System.out.println("Se ha realizado la reparacion");
                cuarto.setEstado(cuarto.estado.DISPONIBLE);
            }
            return cuarto;
        } else {
            System.out.println("La habitacion sigue diponible");
        }
        return null;
    }

//    public void ListadoHabitacionesDisponibles() {
//        for (Habitacion room : this.pieza) {
//            if (room.estado.DISPONIBLE != null) {
//                System.out.println(room);
//            }
//        }
//    }

    public boolean modificarPasajero(Pasajero p, String dni) throws PasajeroNoEncontradoException {
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
                    modificarPasajero(p, dni);
                    break;
                case 2:
                    System.out.println("Ingrese apellido:");
                    String apellido = scanner.next();
                    p.setApellido(apellido);
                    modificarPasajero(p, dni);
                    break;
                case 3:
                    System.out.println("Ingrese telefono:");
                    int telefono = scanner.nextInt();
                    p.setTelefono(telefono);
                    modificarPasajero(p, dni);
                    break;
                case 4:
                    System.out.println("Ingrese dni:");
                    String dnix = scanner.next();
                    p.setDni(dnix);
                    modificarPasajero(p, dni);
                    break;
                case 5:
                    System.out.println("Ingrese direccion:");
                    String direccion = scanner.next();
                    p.setDireccion(direccion);
                    modificarPasajero(p, dni);
                    break;
                case 6:

                    System.out.println("Ingrese e-mail:");
                    String email = scanner.next();
                    p.setEmail(email);
                    modificarPasajero(p, dni);
                    break;
                case 7:
                    System.out.println("Ingrese origen:");
                    String origen = scanner.next();
                    p.setOrigen(origen);
                    modificarPasajero(p, dni);
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
