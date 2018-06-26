package tp.final2;

import java.util.*;
 /**
 * Esta clase establece los datos del administrador(extiende de persona porque comparte atributos como el nombre y apellido), 
 * y utilizara una lista de pasajeros para trabajar con ellos.
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */

public class Administrador extends Persona {
    
    private List<Pasajero> clientes;
    private String usuario;
    private String contraseña;


    public Administrador(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.clientes = clientes;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

  
    
    /**
     *  Funcion auxiliar que, si un pasajero, no esta registrado, lo agrega, si lo esta arroja una exception
     * @throws PersonaDuplicadaException
     * @param p es un pasajero
     */

    public void agregarCliente(Pasajero p) throws PersonaDuplicadaException {
        if (this.clientes.contains(p)) {
            throw new PersonaDuplicadaException();
        }
        this.clientes.add(p);
    }

    @Override
    public String toString() {
        return "Administrador{"+ ", usuario=" + usuario + '}';
    }

}

