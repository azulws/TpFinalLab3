package tp.final2;

import java.time.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
 /**
 * Esta clase recibe, un codigo de reserva (aleatoreo), una fecha de entrada y salida, una habitacion y un pasajero.
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public class Reserva extends Habitacion {

    private int codigoReserva;
    private LocalDate entrada;
    private LocalDate salida;
    private Habitacion pieza;
    private Pasajero clientes;

  

    public Reserva(Habitacion pieza,Pasajero clientes) {
        super();
        this.codigoReserva=ThreadLocalRandom.current().nextInt(0,1000);
        this.entrada = LocalDate.now();
        this.salida=LocalDate.of(2018, Month.of(ThreadLocalRandom.current().nextInt(7,8)), ThreadLocalRandom.current().nextInt(1,26));
        this.pieza=pieza;
        this.clientes=clientes;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }


    public LocalDate getEntrada() {
        return entrada;
    }


    public LocalDate getSalida() {
        return salida;
    }


    public Habitacion getPieza() {
        return pieza;
    }


    public Pasajero getClientes() {
        return clientes;
    }

 
    
    @Override
    public String toString() {
        return "Reserva{" + "CodigoReserva=" + codigoReserva + ", Entrada=" + entrada + ", Salida=" + salida + ", pieza=" + pieza + ", clientes=" + clientes + '}';
    }



}
