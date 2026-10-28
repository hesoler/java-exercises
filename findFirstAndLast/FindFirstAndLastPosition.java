package findFirstAndLast;

public class FindFirstAndLastPosition {

  public static void findFirstAndLastPosition(String str1, String str2) {
    int firstIndex = str1.indexOf(str2);
    int lastIndex = str1.lastIndexOf(str2);

    if (firstIndex != -1) {
      System.out.println("First occurrence of \"" + str2 + "\" in \"" + str1 + "\" is at index: " + firstIndex);
      System.out.println("Last occurrence of \"" + str2 + "\" in \"" + str1 + "\" is at index: " + lastIndex);
    } else {
      System.out.println("\"" + str2 + "\" not found in \"" + str1 + "\".");
    }
  }

  public static void main(String[] args) {
    String str1 = "abracadabra";
    String str2 = "abra";

    findFirstAndLastPosition(str1, str2);
  }
}
