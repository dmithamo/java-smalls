void main(String[] args) {
  // ToBinary.main(args);
  // primeFactorise(args);
  printInts();
}

/*
 * Ex 1.3.9 Write a program that, using one for loop and one if statement,
 * prints the
 * integers from 1,000 to 2,000 with five integers per line. Hint: Use the %
 * operation.
 */

void printInts() {
  for (int i = 1000; i <= 5000; i++) {
    IO.print(i + " ");
    if (i % 5 == 0) {
      IO.println();
    }
  }
}

/*
 * primeFactorise (My impln of PROGRAM 1.3.9) computes the prime factorization
 * of
 * any given positive integer
 */
void primeFactorise(String[] args) {
  long n = Long.parseLong(args[0]);
  String factors = "";

  // is 2 a factor?
  int countTwos = 0;
  while (n % 2 == 0) {
    countTwos++;
    n /= 2;
  }

  if (countTwos > 1) {
    factors += "2^" + countTwos;
  } else if (countTwos == 1) {
    factors += "2";
  }

  for (long i = 3; i * i <= n; i += 2) {
    int count = 0;
    while (n % i == 0) {
      count++;
      n /= i;
    }

    if (count > 0) {
      if (factors != "") {
        factors += " x " + i;
      } else {
        factors += i;
      }
      if (count > 1) {
        factors += "^" + count;
      }
    }
  }

  if (n > 1) {
    if (factors != "") {
      factors += " x " + n;
    } else {
      factors += n;
    }
  }
  IO.println(factors);
}

/*
 * Not an exercise in the book, but my own implementation
 * of the convert to binary example (Prog 1.3.7)
 */
class ToBinary {
  void main(String[] args) {
    if (args.length == 0) {
      return;
    }
    if (args.length >= 1) {
      for (String a : args) {
        IO.println(this.makeBinary(a));
      }
      return;
    }
  }

  String makeBinary(String asDec) {
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
        valueOfBin += (int) posValue;
      }
      pos -= 1;
    }
    return theBinary;
  }
}
