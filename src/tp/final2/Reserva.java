package tp.final2;

import java.time.*;
import java.util.*;

public class Reserva extends Habitacion {

    private int codigoReserva;
    private LocalDate entrada;
    private LocalDate salida;
    private List<Habitacion> pieza;//una sola no es arrayList
    private List<Pasajero> clientes;

    public Reserva() {
    }

    public Reserva(List<Habitacion> pieza, List<Pasajero> clientes) {
        super();
        this.entrada = LocalDate.now();
        this.pieza = pieza;
        this.clientes = clientes;
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

    public List<Habitacion> getPieza() {
        return pieza;
    }

    public List<Pasajero> getClientes() {
        return clientes;
    }


    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "CodigoReserva=" + codigoReserva + ", Entrada=" + entrada + ", Salida=" + salida + ", pieza=" + pieza + ", clientes=" + clientes + '}';
    }



}
