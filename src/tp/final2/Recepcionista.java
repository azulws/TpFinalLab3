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
        
        if (!this.contraseña.equals(pass)) {

            invitado = this.buscarPasajero(invitado.getDni());

            Habitacion room = buscarReserva(CodigoReserva);
            if (room.getEstado() == room.estado.DISPONIBLE) {
                
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

    public void ModificarPasajero(Pasajero p) throws PasajeroNoEncontradoException{
        if (this.clientes.contains(p)) {
            clientes.add();
        }
        throw new PasajeroNoEncontradoException("El pasajero " + p + " no existe en la agenda");
    }

    @Override
    public String toString() {
        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
    }

}
