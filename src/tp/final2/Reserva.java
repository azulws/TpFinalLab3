package tp.final2;

import java.time.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
        this.salida=LocalDate.of(2018, Month.of(ThreadLocalRandom.current().nextInt(6,7)), ThreadLocalRandom.current().nextInt(0,31));
        this.pieza=pieza;
        this.clientes=clientes;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public Habitacion getPieza() {
        return pieza;
    }

    public void setPieza(Habitacion pieza) {
        this.pieza = pieza;
    }

    public Pasajero getClientes() {
        return clientes;
    }

    public void setClientes(Pasajero clientes) {
        this.clientes = clientes;
    }
   
 
    
    @Override
    public String toString() {
        return "Reserva{" + "CodigoReserva=" + codigoReserva + ", Entrada=" + entrada + ", Salida=" + salida + ", pieza=" + pieza + ", clientes=" + clientes + '}';
    }



}
