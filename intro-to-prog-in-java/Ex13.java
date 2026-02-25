public class Ex13 {
  public static void main(String[] args) {
    if (args.length == 0) {
      return;
    }
    if (args.length > 1) {
      for (String a : args) {
        System.out.println(ToBinary.makeBinary(a));
      }
      return;
    }
    System.out.println(ToBinary.makeBinary(args[0]));
  }
}

/*
 * Not an exercise in the book, but my own implementation
 * of the convert to binary example (Prog 1.3.7)
 */
class ToBinary {
  public static String makeBinary(String asDec) {
    int decimal = Integer.parseInt(asDec);
    int SYSTEM_SIZE = 8;
    int pos = SYSTEM_SIZE - 1;
    int valueOfBin = 0;
    String theBinary = "";

    if (decimal < 0) {
      theBinary += "1";
    } else {
      theBinary += "0";
    }

    while (pos > -1) {
      double posValue = Math.pow(2, pos);
      if ((valueOfBin + posValue) > Math.abs(decimal)) {
        theBinary += "0";
      } else {
        theBinary += "1";
        valueOfBin += (int)posValue;
      }
      pos -= 1;
    }
    return theBinary;
  }
}
