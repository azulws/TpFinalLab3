package tp.final2;

import java.time.*;
import java.util.*;

public class Reserva extends Habitacion {

    private int codigoReserva;
    private LocalDate entrada;
    private LocalDate salida;
    private ArrayList<Habitacion> pieza;//una sola no es arrayList
    private ArrayList<Pasajero> clientes;

    public Reserva() {
    }

    public Reserva(LocalDate Entrada, ArrayList<Habitacion> pieza, ArrayList<Pasajero> clientes) {
        super();
        this.entrada = Entrada;
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

    public ArrayList<Habitacion> getPieza() {
        return pieza;
    }

    public ArrayList<Pasajero> getClientes() {
        return clientes;
    }

    @Override
    public int hashCode() {
        int resp = 7;
        resp = 31 * resp + this.codigoReserva;
        return resp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {return false;}
        if (getClass() != o.getClass()) {return false;}
        Reserva other = (Reserva) o;
        return Objects.equals(codigoReserva, other.codigoReserva);
    }


    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "CodigoReserva=" + codigoReserva + ", Entrada=" + entrada + ", Salida=" + salida + ", pieza=" + pieza + ", clientes=" + clientes + '}';
    }



}
