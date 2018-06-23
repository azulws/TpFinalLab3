package tp.final2;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Habitacion extends Hotel {

    private int NumeroHabitacion;
    private int ListadoDisponible;
    private UUID id;
    protected Estado estado;
    protected Tipo tipo;

    public enum Tipo {
        INDIVIDUAL,
        DOBLE,
        TRIPLE,
        SUITES;
    }

    public Habitacion(int NumeroHabitacion,Tipo tipo) {
        super();
        this.NumeroHabitacion = NumeroHabitacion;
        this.estado = this.estado.DISPONIBLE;
        this.tipo = tipo;
        this.id=UUID.randomUUID();
    }

    public Habitacion() {
    }

  
    public UUID getId() {
        return id;
    }
    
    

    public int getNumeroHabitacion() {
        return NumeroHabitacion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


     
    public Estado getEstado() {
        return estado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public void setListadoDisponible(int ListadoDisponible) {
        this.ListadoDisponible = ListadoDisponible;
    }

    public int getListadoDisponible() {
        return ListadoDisponible;
    }   

  
    @Override
    public String toString() {
        return "Habitacion{"  + "NumeroHabitacion=" + NumeroHabitacion + ", estado=" + estado + ", tipo=" + tipo + '}';
    }

}
