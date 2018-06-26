
package tp.final2;
 /**
 * Enum de tipo clase, con sus respectivos strings.
 * @author agustin caceres
 * @author agustin dominguez
 * @author azul gottero
 */
public enum Estado {
    DISPONIBLE("Disponible"),
    NO_DISPONIBLE("No_Disponible"),
    OCUPADO("Ocupado");

  private String value;

  Estado(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
