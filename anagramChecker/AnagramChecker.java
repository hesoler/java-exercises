package anagramChecker;

import java.util.Scanner;

public class AnagramChecker {

  public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    int[] charCount = new int[256]; // Asumiendo ASCII

    for (int i = 0; i < str1.length(); i++) {
      charCount[str1.charAt(i)]++;
      charCount[str2.charAt(i)]--;
    }

    for (int count : charCount) {
      if (count != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Indroduzca la primera palabra:");
    String str1 = scanner.nextLine();
    System.out.println("Indroduzca la segunda palabra:");
    String str2 = scanner.nextLine();
    scanner.close();

    if (areAnagrams(str1, str2)) {
      System.out.println(str1 + " y " + str2 + " son anagramas.");
    } else {
      System.out.println(str1 + " y " + str2 + " no son anagramas.");
    }
  }
}
