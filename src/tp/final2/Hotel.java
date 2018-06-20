package tp.final2;

public class Hotel {

    private String Nombre;
    private int Estrella;
    private int Telefono;
    private String Direccion;
    private String Email;

    public Hotel(String Nombre, int Estrella, int Telefono, String Direccion, String Email) {
        this.Nombre = Nombre;
        this.Estrella = Estrella;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Email = Email;
    }

    public Hotel() {
    }
    

    public String getNombre() {
        return Nombre;
    }

    public int getEstrella() {
        return Estrella;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public String toString() {
        return "Hotel{" + "Nombre=" + Nombre + ", Estrella=" + Estrella + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Email=" + Email + '}';
    }
    
    

}
