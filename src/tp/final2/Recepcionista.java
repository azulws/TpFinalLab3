package tp.final2;

import java.time.LocalDate;
import java.util.*;

public class Recepcionista extends Persona {

    private ArrayList<Pasajero> clientes;
    private ArrayList<Habitacion> pieza;
    private ArrayList<Reserva> alquileres;
    private ArrayList<Recepcionista> recepcion;
    private String usuario;
    private String contraseña;

    public Recepcionista(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    private Recepcionista ingresoSistemaRecepsion(String usuarios, String contraseña) {

        if (recepcion == null) {
            return null;
        }
        for (Recepcionista personn : recepcion) {
            if (personn.getEmail().equals(usuarios) && personn.getContraseña().equals(contraseña)) {
                return personn;
            } else {
                System.out.println("El usuario o la contraseña es incorrecta");
            }

        }

        return null;

    }

    public Pasajero buscarPasajero(String dni) {
        for (Pasajero turista : clientes) {
            if (turista != null && turista.getDni().equals(dni)) {
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

    public Reserva alquiler(int CodigoReserva, String nombreCliente) {
        Reserva piezas = buscarReserva(CodigoReserva);
        Pasajero cliente = buscarPasajero(nombreCliente);
        if (pieza != null && cliente != null) {
            piezas.setListadoDisponible(piezas.getListadoDisponible() - 1);;
            Reserva alquiler = new Reserva(LocalDate.now(), pieza, clientes);

            for (int i = 0; i < alquileres.size(); i++) {
                if (alquileres == null) {
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

    public Habitacion checkIn(int pass,Pasajero invitado, int CodigoReserva) {
        Recepcionista recepcion = new Recepcionista(this.usuario, this.contraseña, this.nombre, this.apellido);
        if (!this.contraseña.equals(pass)) {

             invitado = this.buscarPasajero(dni);

            if (invitado == null) {
                invitado = new Pasajero(nombre, apellido,telefono, direccion, email,dni,origen);
                recepcion.alquiler(CodigoReserva,invitado.nombre);
            }
            Habitacion room = buscarReserva(CodigoReserva);
            if (room != null && this.buscarReserva(CodigoReserva) == null) {
                this.checkIn(pass,invitado, CodigoReserva);
                room.setListadoDisponible(room.getListadoDisponible() - 1);

            }
        }

        return null;
    }

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

    public void ModificarPasajero(int amodf) {

        if (amodf < clientes.size()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Para modificar nombre");
            System.out.println("2. Para modificar apellido");
            System.out.println("3. Para modificar origen");
            System.out.println("4. Para modificar dni");
            System.out.println("5. Para modificar direccion");
            System.out.println("6. Para modificar email");
            System.out.println("6. Para modificar telefono");

            System.out.print("Ingrese la opcion: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese la opcion: ");
                scanner.next();
            }
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    clientes.get(amodf).setNombre(nombre);

                    break;
                case 2:
                    clientes.get(amodf).setApellido(apellido);
                    break;
                case 3:
                    clientes.get(amodf).setOrigen(origen);

                    break;
                case 4:
                    clientes.get(amodf).setDni(dni);
                    break;
                case 5:
                    clientes.get(amodf).setDireccion(direccion);

                    break;
                case 6:
                    clientes.get(amodf).setEmail(email);
                    break;
                case 7:
                    clientes.get(amodf).setTelefono(telefono);
                    break;
                default:
                    break;
            }
        }

    }

    @Override
    public String toString() {
        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
    }

}
