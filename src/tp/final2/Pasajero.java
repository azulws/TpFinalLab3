package tp.final2;

import java.util.*;

public class Pasajero extends Persona {
    private int telefono;
    private String direccion;
    private String email;
    private String dni;
    private String origen;
    private List<Reserva> Pedido;
    protected List<Habitacion> pieza;

    public Pasajero(String nombre, String apellido, int telefono, String direccion, String email, String dni, String origen) {
        super(nombre, apellido);
        this.telefono=telefono;
        this.direccion=direccion;
        this.email=email;
        this.dni=dni;
        this.origen=origen;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public String getOrigen() {
        return origen;
    }

    public List<Reserva> getPedido() {
        return Pedido;
    }

    public List<Habitacion> getPieza() {
        return pieza;
    }
    
    


    public void CancelarReserva(int CodigoReserva) {
        for (int i = 0; i < Pedido.size(); i++) {
            if (Pedido.get(i) != null && Pedido.get(i).getCodigoReserva() == CodigoReserva) {
                Pedido.remove(i);
                break;
            }
        }

    }    

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", dni=" + dni + ", origen=" + origen + "Pedido=" + Pedido + ", pieza=" + pieza + '}';
    }

    
   

   

}
