package calculadorSuma;

public class Calculadora {

  public static void main(String[] args) {
    Operacion suma = new Operacion() {
      @Override
      public int ejecutar(int a, int b) {
        return a + b;
      }
    };

    System.out.println("Resultado: " + suma.ejecutar(5, 3));  // Resultado: 8
  }
}
