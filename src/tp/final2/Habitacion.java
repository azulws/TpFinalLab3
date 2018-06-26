package tp.final2;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
 /**
 * Habitacion, contendra un numero para cada una, un tipo, un estado y el listado de hab disponibles
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public class Habitacion extends Hotel {

    private int NumeroHabitacion;
    private int ListadoDisponible;
    protected Estado estado;
    protected Tipo tipo;

/**
 * Enum para indicar el tipo de la habitacion
 */
    public enum Tipo {
        INDIVIDUAL,
        DOBLE,
        TRIPLE,
        SUITES;
    }

    public Habitacion(int NumeroHabitacion,Tipo tipo) {
        this.NumeroHabitacion = NumeroHabitacion;
        this.estado = this.estado.DISPONIBLE;
        this.tipo = tipo;
    }

    public Habitacion() {
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
