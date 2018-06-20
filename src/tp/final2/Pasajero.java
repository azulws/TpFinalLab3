package tp.final2;

import java.util.*;

public class Pasajero extends Persona {

    private ArrayList<Reserva> Pedido;
    protected ArrayList<Habitacion> pieza;

    public Pasajero(String nombre, String apellido, int telefono, String direccion, String email, String dni, String origen) {
        super(nombre, apellido, telefono, direccion, email, dni, origen);
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
