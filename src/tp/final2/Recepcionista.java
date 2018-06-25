package tp.final2;

import java.time.LocalDate;
import java.util.*;

public class Recepcionista extends Persona {

    transient private List<Pasajero> clientes;
    transient private List<Habitacion> pieza;
    transient private List<Reserva> alquileres;
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

    public Reserva alquiler(int hab, String dni, Habitacion p, Pasajero c) throws PasajeroNoEncontradoException {
        Habitacion piezas = buscarHabitacion(hab);
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

    @Override
    public String toString() {
        return "Recepcionista{" + "nombre=" + nombre + ", apellido=" + apellido + "usuario=" + usuario + '}';
    }

}
