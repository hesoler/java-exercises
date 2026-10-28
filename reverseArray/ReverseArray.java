package reverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

  public static void reverseArray(int[] numbers) {
    int n = numbers.length;
    // Invertir el array
    for (int i = 0; i < n / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[n - 1 - i];
      numbers[n - 1 - i] = temp;
    }

    // Imprimir el array invertido
    System.out.println("Array invertido: ");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int size = scanner.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = scanner.nextInt();
    }
    scanner.close();

    reverseArray(array);
    System.out.println(Arrays.toString(array));
  }
}
