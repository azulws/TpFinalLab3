package tp.final2;

public class Habitacion extends Hotel {

    private int NumeroHabitacion;
    private int ListadoDisponible;
    
    protected Estado estado;
    protected Tipo tipo;

    public enum Estado {
        DISPONIBLE,
        NO_DISPONIBLE,
        OCUPADA;
    }

    public enum Tipo {
        INDIVIDUAL,
        DOBLE,
        TRIPLE,
        SUITES;
    }

    public Habitacion(int NumeroHabitacion, Estado estado, Tipo tipo) {
        super();
        this.NumeroHabitacion = NumeroHabitacion;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Habitacion() {
    }

    public int getNumeroHabitacion() {
        return NumeroHabitacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setListadoDisponible(int ListadoDisponible) {
        this.ListadoDisponible = ListadoDisponible;
    }

    public int getListadoDisponible() {
        return ListadoDisponible;
    }   

    @Override
    public String toString() {
        return "Habitacion{" + "NumeroHabitacion=" + NumeroHabitacion + ", estado=" + estado + ", tipo=" + tipo + '}';
    }

}
