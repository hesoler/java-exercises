package referenciaString;

public class Referencia {

  public static void cambiarValor(int x) {
    x = 99;
  }

  public static void cambiarNombre(Persona p) {
    p.nombre = "Héctor";  // Modifica el objeto apuntado
    p = new Persona();    // Cambia la referencia local
    p.nombre = "Otro";    // No afecta al original
  }

  public static void main(String arg) {
    System.out.println(arg);
  }

  public static void main(int a) {
    System.out.println(a);
  }

  public static void main(String[] args) {
    int numero = 42;
    cambiarValor(numero);
    System.out.println(numero);  // Imprime 42

    Persona persona = new Persona();
    persona.nombre = "Original";
    cambiarNombre(persona);
    System.out.println(persona.nombre);  // Imprime "Héctor"

    String str = "Hola";
    System.out.println(str.hashCode());
    str = "Mundo";
    System.out.println(str.hashCode());

    str.concat("!");  // No cambia str
    System.out.println(str);  // Imprime "Hola Mundo"

    StringBuilder sb = new StringBuilder(str);
    sb.append(" Mundo");
    System.out.println(sb.hashCode());

    main(55);
    main("Hola");
  }

  static class Persona {

    String nombre;
  }
}
