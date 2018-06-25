package tp.final2;

import java.util.*;

public class Administrador extends Persona {
    
    private List<Pasajero> clientes;
    private List<Administrador> administracion;
    private String usuario;
    private String contraseña;


    public Administrador(String usuario, String contraseña, String nombre, String apellido) {
        super(nombre, apellido);
        this.clientes = clientes;
        this.administracion = administracion;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void agregarCliente(Pasajero p) throws PersonaDuplicadaException {
        if (this.clientes.contains(p)) {
            throw new PersonaDuplicadaException();
        }
        this.clientes.add(p);
    }

    @Override
    public String toString() {
        return "Administrador{" + "clientes=" + clientes + ", administracion=" + administracion + ", usuario=" + usuario + '}';
    }

}

