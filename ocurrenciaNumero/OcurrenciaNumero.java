package ocurrenciaNumero;

import java.util.Scanner;

public class OcurrenciaNumero {

  public static int contarOcurrencias(int numero, int digito) {
    int contador = 0;
    while (numero != 0) {
      int ultimoDigito = numero % 10;
      if (ultimoDigito == digito) {
        contador++;
      }
      numero /= 10;
    }
    return contador;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");
    int number = scanner.nextInt();

    System.out.println("Enter a digit:");
    int digit = scanner.nextInt();
    scanner.close();

    int ocurrency = contarOcurrencias(number, digit);
    System.out.println("The digit " + digit + " occurs " + ocurrency + " times.");
  }

}
