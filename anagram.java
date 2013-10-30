import java.util.Arrays;

public class anagram {

  public static void main(String args[]) {
    String str_a = "army";
    String str_b = "mary";
    String str_c = "tech";
    String result = isAnagram(str_a, str_b);
    System.out.println(result);
  }
  public static String isAnagram(String str_a, String str_b) {
    if (str_a.length() != str_b.length()) {
      return "No";
    } else {
      char[] arrayA = str_a.toCharArray();
      char[] arrayB = str_b.toCharArray();
      Arrays.sort(arrayA);
      Arrays.sort(arrayB);
      if (Arrays.equals(arrayA, arrayB)) {
        return "Yes";
      } else {
        return "No";
      }
    }
  }
}