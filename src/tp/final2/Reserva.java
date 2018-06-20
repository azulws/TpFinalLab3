package tp.final2;

import java.time.*;
import java.util.*;

public class Reserva extends Habitacion {

    private int CodigoReserva;
    private LocalDate Entrada;
    private LocalDate Salida;
    private List<Habitacion> pieza;//una sola no es arrayList
    private List<Pasajero> clientes;

    public Reserva() {
    }

    public Reserva(LocalDate Entrada, ArrayList<Habitacion> pieza, ArrayList<Pasajero> clientes) {
        super();
        this.Entrada = Entrada;
        this.pieza = pieza;
        this.clientes = clientes;
    }
   

    public int getCodigoReserva() {
        return CodigoReserva;
    }

    public LocalDate getEntrada() {
        return Entrada;
    }

    public LocalDate getSalida() {
        return Salida;
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
        return "Reserva{" + "CodigoReserva=" + CodigoReserva + ", Entrada=" + Entrada + ", Salida=" + Salida + ", pieza=" + pieza + ", clientes=" + clientes + '}';
    }



}
