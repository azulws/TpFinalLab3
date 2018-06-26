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

    @Override
    public String toString() {
        return "Administrador{"+ ", usuario=" + usuario + '}';
    }

}

