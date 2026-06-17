public class SedgewickIntroJava {
  public static void main() {
    // System.out.println("Recurssion.gcd(102, 68) = " + Recurssion.gcd(102, 68));

    for (int i = 0; i <= 92; i++) {
      System.out.println("DynamicProgrammingFib.fib(%d) =  %d".formatted(i, DynamicProgrammingFib.fib(i)));
    }
  }

  public static class Recurssion {
    public static int gcd(int i, int j) {
      if (i == 0)
        return j;
      if (j == 0)
        return i;

      if (i > j) {
        return gcd(j, i % j);
      }
      return gcd(j, i);
    }
  }

  public static class DynamicProgrammingFib {
    private static final int MAX = 92;
    private static long[] cache = new long[MAX];

    public static long fib(int n) {
      if (n > MAX)
        throw new Error("Too big");

      if (n <= 0)
        return 0;
      if (n == 1)
        return 1;

      if (cache[n - 1] > 0) {
        return cache[n - 1];
      }

      cache[n - 1] = fib(n - 1) + fib(n - 2);
      return cache[n - 1];
    }
  }
}
