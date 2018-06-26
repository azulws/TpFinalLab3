package tp.final2;

 /**
 * Clase de excepcion para persona duplicada
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public class PersonaDuplicadaException extends Exception{
    public PersonaDuplicadaException(){}
    
    public PersonaDuplicadaException(String msn){
        super(msn);
    }
}
