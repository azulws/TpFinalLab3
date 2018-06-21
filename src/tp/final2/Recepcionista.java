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

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.clientes=new ArrayList<>();
        this.pieza=new ArrayList<>();
        this.alquileres=new ArrayList<>();
        this.recepcion=new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Pasajero buscarPasajero(Pasajero p) {
        for (Pasajero turista : this.clientes) {
            if (turista != null) {
                return turista;
            }
        }
        return null;
    }

    public Reserva buscarReserva(int CodigoReserva) {
        for (Reserva alquiler : alquileres) {
            if (alquiler != null && alquiler.getCodigoReserva() == CodigoReserva) {
                return alquiler;
            }
        }
        return null;
    }

//    public Reserva alquiler(int CodigoReserva, String nombreCliente) {
//        Reserva piezas = buscarReserva(CodigoReserva);
//        Pasajero cliente = buscarPasajero(nombreCliente);
//        if (pieza != null && cliente != null) {
//            piezas.setListadoDisponible(piezas.getListadoDisponible() - 1);;
//            Reserva alquiler = new Reserva(LocalDate.now(), pieza, clientes);
//
//            for (int i = 0; i < alquileres.size(); i++) {
//                if (alquileres == null) {
//                    alquileres.add(alquiler);
//                    break;
//                }
//            }
//            return alquiler;
//        }
//        return null;
//    }

    public Habitacion libre() {
        for (Habitacion room : pieza) {
            if (room.estado.OCUPADA == null) {
                return room;

            }
        }
        return null;
    }

//    public Habitacion checkIn(int pass,Pasajero invitado, int CodigoReserva) {
//        
//          if (!this.contraseña.equals(pass)) {
//
//            invitado = this.buscarPasajero(invitado.getDni());
//
//            Habitacion room = buscarReserva(CodigoReserva);
//            if (room.getEstado() == room.estado.DISPONIBLE) {
//                
//                room.setListadoDisponible(room.getListadoDisponible() - 1);
//            }
//        }
//
//        return null;
//    }

    public void CancelarReserva(int CodigoReserva) {
        for (int i = 0; i < alquileres.size(); i++) {
            if (alquileres != null && alquileres.get(i).getCodigoReserva() == CodigoReserva) {
                alquileres = null;
                break;
            }
        }

    }

    public void ListadoHabitacionesDisponibles() {
        for (int a = 0; a < pieza.size(); a++) {
            pieza.toString();
        }
    }
    
    public void ModificarPasajero(Pasajero p,String dni) throws PasajeroNoEncontradoException{
//        if (this.buscarPasajero(p.getDni().equals(dni)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Para modificar nombre");
            System.out.println("2. Para modificar apellido");
            System.out.println("3. Para modificar origen");
            System.out.println("4. Para modificar dni");
            System.out.println("5. Para modificar direccion");
            System.out.println("6. Para modificar email");
            System.out.println("7. Para modificar telefono");

            System.out.print("Ingrese la opcion: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese la opcion: ");
                scanner.next();
            }
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    p.setNombre(p.getNombre());

                    break;
                case 2:
                    p.setApellido(p.getApellido());
                    break;
                case 3:
                    p.setOrigen(p.getOrigen());

                    break;
                case 4:
                    p.setDni(p.getDni());
                    break;
                case 5:
                    p.setDireccion(p.getDireccion());

                    break;
                case 6:
                    p.setEmail(p.getEmail());
                    break;
                case 7:
                    p.setTelefono(p.getTelefono());
                    break;
                default:
                    break;
            }
        }
//        throw new PasajeroNoEncontradoException("El pasajero " + p + " no existe en la agenda");
    }

//    @Override
//    public String toString() {
//        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
//    }
