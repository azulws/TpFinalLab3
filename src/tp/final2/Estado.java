
package tp.final2;

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
