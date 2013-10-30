import java.util.*;

public class fibonacci {

  public static void main(String args[]) {
      int n = Integer.parseInt(args[0]);
      int result = fib(n);
      System.out.println("" + result);
  }

  public static int fib(int n) {
    if (n < 2) {
      return n;
    }
    else {
      return fib(n-1)+fib(n-2);
    }

  }
}