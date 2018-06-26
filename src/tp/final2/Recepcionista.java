package tp.final2;

import java.time.LocalDate;
import java.util.*;

 /**
 * Esta clase utilizar una lista de pasajeros,habitaciones y reservas para distintas operaciones del hotel.
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */

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


     /**
 * Busca un pasajero por dni en la lista de clientes y lo retorna, caso contrario retorna una exception
 * @throws PasajeroNoEncontradoException
 * @param dni dni del pasajero a buscar
 */
    
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
    
    /**
 * Busca una reserva por el codigo de reserva en la lista de reservas y lo retorna, caso contrario retorna null
 * @param CodigoReserva es el codigo de reserva otorgado al pasajero
 */
    
    public Reserva buscarReserva(int CodigoReserva) {
        for (Reserva alquiler : this.alquileres) {
            if (alquiler != null && alquiler.getCodigoReserva() == CodigoReserva) {
                return alquiler;
            }
        }
        return null;
    }

     /**
 * Busca una habitacion por el numero de habitacion en la lista de reservas y lo retorna, caso contrario retorna null
 * @param num es un numero de habitacion
 */
    public Habitacion buscarHabitacion(int num) {
        for (Habitacion encontrada : this.pieza) {
            if (encontrada.getNumeroHabitacion() == num) {

                return encontrada;

            }

        }
        return null;
    }
/**
 * Busca una habitacion y un pasajero, si existen, disminuye el numero de piezas disponibles en -1, crea una reserva, si no esta en la lista de reservas,la agrega y retorna.
 * @param hab es un numero de habitacion
 * @param dni es el dni del cliente
 * @param p es una habitacion
 * @param c es un pasajero
 */
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
/**
 * Busca una habitacion en la lista correspondiente, y si no esta ocupada la retorna
 */
    public Habitacion libre() {
        for (Habitacion room : pieza) {
            if (room.estado.OCUPADO == null) {
                return room;

            }
        }
        return null;
    }
/**
 * Busca una habitacion y si esta disponible, su estado cambia a ocupada y la retorna, caso contrario, retorna un mensaje de error.
 * @param num es un numero de habitacion
 */
    public Habitacion checkIn(int num) {
        Habitacion cuarto = buscarHabitacion(num);
        if (cuarto != null && cuarto.getEstado() == cuarto.estado.DISPONIBLE) {
            cuarto.setEstado(cuarto.estado.OCUPADO);
            return cuarto;
        } else {
            System.out.println(" La habitacion no esta diponible");
        }
        return null;
    }

    /**
 * Busca una habitacion y si esta ocupada, su estado cambia a no disponible y la retorna, caso contrario, retorna un mensaje de error.
 * @param num es un numero de habitacion
 */
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
/**
 * Busca una habitacion, si esta no disponible, realiza distintas tareas, limpieza , desinfeccion o reparacion. Si esta disponible arroja error.
 * @param num es un numero de habitacion
 * @param t numero de tarea (1:limpieza ; 2:Desinfeccion ; 3:reparacion)
 */
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
