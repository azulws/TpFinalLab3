package tp.final2;
 /**
 * En esta clase se establecen los datos principales del hotel
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public class Hotel {

    private String Nombre;
    private int Estrella;
    private int Telefono;
    private String Direccion;
    private String Email;

    public Hotel() {
        this.Nombre = "Hans Brinker Budget";
        this.Estrella = 2;
        this.Telefono = 206220687;
        this.Direccion =  " Kerkstraat 136";
        this.Email ="HansBrinkerBudget@hotmail.com";
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
