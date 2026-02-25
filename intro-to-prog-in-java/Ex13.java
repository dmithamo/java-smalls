public class Ex13 {
  public static void main(String[] args) {
    // ToBinary.main(args);
    PrimeFactors.main(args);
  }
}

/*
 * Not an exercise in the book, but my own implementation
 * of the convert to binary example (Prog 1.3.7)
 */
class ToBinary {
  public static void main(String[] args) {
    if (args.length == 0) {
      return;
    }
    if (args.length >= 1) {
      for (String a : args) {
        System.out.println(ToBinary.makeBinary(a));
      }
      return;
    }
  }

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

    while (pos >= 0) {
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

/*
 * PrimeFactors (My impln of PROGRAM 1.3.9) computes the prime factorization of
any given positive integer
 * */
class PrimeFactors {
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]);
    String factors = "";

    for (long i = 2; i <= n; i++) {
      while (n % i == 0) {
        if (n / i > 1) {
          factors += i + " x ";
        } else {
          factors += i;
        }
        n /= i;
      }
    }
    System.out.println(factors);
  }
}
