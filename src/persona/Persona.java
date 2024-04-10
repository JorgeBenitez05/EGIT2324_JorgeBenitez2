package persona;

public class Persona {
  private String nombre;
  private String apellidos;
  private int edad;

  // Constructor
  public Persona(String nombre, String apellidos, int edad) {
      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;
  }

  public void Cumpleaños() {
      edad++;
      System.out.println("Feliz cumpleaños ahora tienes " + edad + " años");
  }

  public static void main(String[] args) {
      Persona persona = new Persona("Juan", "Pérez", 30);
      persona.Cumpleaños(); 
  }
}

