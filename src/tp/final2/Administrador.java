package tp.final2;

import java.util.*;

public class Administrador extends Persona {

    private Pasajero[] clientes;
    private ArrayList<Administrador> administracion;
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

    protected Administrador ingresoSistemaAdministracion(String usuarios, String contraseña) {

        if (administracion == null) {
            return null;
        }
        for (Administrador person : administracion) {
            if (person.getEmail().equals(usuarios) && person.getContraseña().equals(contraseña)) {
                return person;
            } else {
                System.out.println("El usuario o la contraseña es incorrecta");
            }

        }

        return null;

    }

    public String agregarCliente(String dni, String origen, String nombre, String apellido, int telefono, String direccion, String email) {
        Pasajero turista = new Pasajero(nombre, apellido, telefono, direccion, email,dni, origen);
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = turista;
                break;
            }
        }
        return turista.toString();
    }

}
