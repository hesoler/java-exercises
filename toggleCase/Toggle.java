package toggleCase;

import java.util.Scanner;

public class Toggle {

  // Método para alternar mayúsculas y minúsculas
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter text: ");
    String input = sc.nextLine();
    StringBuilder toggled = new StringBuilder();
    sc.close();

    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)) {
        toggled.append(Character.toLowerCase(c));
      } else if (Character.isLowerCase(c)) {
        toggled.append(Character.toUpperCase(c));
      } else {
        toggled.append(c);
      }
    }
    System.out.println("Toggled text: " + toggled);
  }
}
