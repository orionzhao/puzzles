import java.util.Scanner;

public class CountCountries {

  public static void main(String args[]) {
    Scanner user_input = new Scanner(System.in);
    String input_string = user_input.next();
    int output = mirrorIndex(input_string);
    System.out.println(output);  
  }
  public static int mirrorIndex(String input_str) {
    if (input_str.length() == 1) {
      return -1;
    }
    if (input_str.length()%2 == 0) {
      return -1;
    }
    int head = 0;
    int tail = input_str.length() - 1;
    int index = (input_str.length() - 1) / 2;
    for (int count = 0; count < index; count++) {
      if (input_str.charAt(head) != (input_str.charAt(tail))) {
        return -1;
      }
      head = head + 1;
      tail = tail - 1;
    }
    int result = index + 1;
    return result;
  }
}