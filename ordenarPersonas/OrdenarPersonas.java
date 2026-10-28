package ordenarPersonas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Persona {

  String nombre;
  int edad;

  Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  @Override
  public String toString() {
    return nombre + " (" + edad + ")";
  }
}

public class OrdenarPersonas {

  public static void main(String[] args) {
    List<Persona> personas = Arrays.asList(
        new Persona("Ana", 30),
        new Persona("Luis", 25),
        new Persona("Carlos", 35)
    );

    // Clase anónima para ordenar por edad
//        personas.sort(new Comparator<Persona>() {
//            @Override
//            public int compare(Persona p1, Persona p2) {
//                return Integer.compare(p1.edad, p2.edad);
//            }
//        });

    // Usando Lambda para ordenar por edad
//        personas.sort((p1, p2) -> Integer.compare(p1.edad, p2.edad));

    personas.sort(Comparator.comparingInt(p -> p.edad));

    System.out.println(personas);  // [Luis (25), Ana (30), Carlos (35)]
  }
}

