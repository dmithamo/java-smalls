public class Ex13 {
  public static void main(String[] args) {
    ToBinary.main(args);
  }
}

/*
Not an exercise in the book, but my own implementation
of the convert to binary example (Prog 1.3.7)
*/
public class ToBinary {
  public static void main(String[] args) {
    int decimal = Integer.parseInt(args[0]);
    int SYSTEM_SIZE = 32;
    int pos = SYSTEM_SIZE - 1;
    int valueOfBin = 0;

    if (decimal < 0) {
      System.out.print(1);
    } else {
      System.out.print(0);
    }

    while (pos > -1) {
      double posValue = Math.pow(2, pos);
      if ((valueOfBin + posValue) > Math.abs(decimal)) {
        System.out.print(0);
      } else {
        System.out.print(1);
        valueOfBin += (int) posValue;
      }
      pos -= 1;
    }
    System.out.println();
  }
}
