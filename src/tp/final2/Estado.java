
package tp.final2;

public enum Estado {
    DISPONIBLE("Calzado"),
    NO_DISPONIBLE("Remeras"),
    OCUPADO("Buzos");

  private String value;

  Estado(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
