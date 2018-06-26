package tp.final2;

import java.util.*;
 /**
 * Pasajeros tendra datos unicos necesarios para dar alta en sistema y utilizara una lista de reservas para poder cancelar la misma.
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public class Pasajero extends Persona {
    private int telefono;
    private String direccion;
    private String email;
    private String dni;
    private String origen;
    private ArrayList<Reserva> Pedido;

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

    public ArrayList<Reserva> getPedido() {
        return Pedido;
    }

  

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    
    
 /**
 * Funcion que nos pide un codigodereserva(generado aleatoreamente a cada pasajero) por parametro, para remover una reserva de la lista
 * CodigoReserva es el codigo de reserva del pasajero
 */

    public void CancelarReserva(int CodigoReserva) {
        for (Reserva Pe : Pedido) {
            if (Pe.getCodigoReserva() == CodigoReserva) {
                Pedido.remove(Pe);
                break;
            }
        }

    }
    
    
  

    @Override
    public int hashCode() {
        int resp = dni.hashCode();
        resp = 31 * resp; //Preguntar si se vuelve a sumar el hasCode de dni
        return resp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pasajero other = (Pasajero) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email + ", dni=" + dni + ", origen=" + origen +'}';
    }

    
   

   

}
