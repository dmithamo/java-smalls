public class ArrayPrinterImplementation {
  public static void main(String[] args) {
    ArrayPrinter ap;
    ap = (a, c) -> {
      if (a.length < c) {
        System.out.println("That will cause an exception!");
        return;
      }

      for (int i = 0; i < c; i++) {
        System.out.print("%s".formatted(a[i]));
      }
      System.out.println();
    };
    String[] strings = { "Dennis", "Bundi", "Mithamo" };
    int count = 3;

    doesSomething(ap, strings, count);
  }

  public static void doesSomething(ArrayPrinter f, String[] s, int c) {
    f.print(s, c);
  }
}
