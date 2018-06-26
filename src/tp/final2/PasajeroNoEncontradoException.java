
package tp.final2;
 /**
 * Clase de excepcion para pasajeros no encontrados
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
class PasajeroNoEncontradoException extends Exception {

    public PasajeroNoEncontradoException(){}
    public PasajeroNoEncontradoException(String msn){super(msn);}
    
}
