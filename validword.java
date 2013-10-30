import java.util.*;

public class validword {

  public static void main(String args[]) {
    String str_a = "hireeeeeehire";
    String str_b = "mary";
    String str_c = "tech";
    String result = isValid(str_a);
    System.out.println(result);
  }
  public static String isValid(String str_a) {
    char[] arrayA = str_a.toCharArray();
    if (arrayA.length == 0) {
      return "No";
    } else {
      for (int i=0; i < arrayA.length; i++) {
        char current_char = arrayA[i];
        if (current_char != 'h' && current_char != 'i' && current_char != 'r' && current_char != 'e') {
          return "No";
        }
      }
      return "Yes";
    }
  }
}