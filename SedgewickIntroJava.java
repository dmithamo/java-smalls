public class SedgewickIntroJava {
  public static void main() {
    System.out.println("Recurssion.gcd(102, 68) = " + Recurssion.gcd(102, 68));
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
}
