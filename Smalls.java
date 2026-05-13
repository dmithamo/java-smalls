void main() {
  // int divisorCount = 0;
  // int N;
  // try {
  // N = Integer.parseInt(IO.readln("Enter a number: "));
  // } catch (NumberFormatException e) {
  // IO.println("Unable to convert your input into a number: " + e);
  // System.exit(1);
  // N = 0;
  // }

  // for (int i = 2; i < N; i++) {
  // if (N % i == 0) {
  // divisorCount++;

  // if (i % 1_000_000 == 0) {
  // IO.println(".");
  // }
  // }
  // }

  // IO.println("Divisors: " + divisorCount);

  ComputeAverage avgCalc = new ComputeAverage();
  avgCalc.computeAvg();
}

class ComputeAverage {

  public void computeAvg() {
    int count = 0;
    int sum = 0;

    IO.println("Enter your numbers below. Press <Enter> to finish");
    while (true) {
      try {
        String input = IO.readln("Next number? ");
        if (input.equals("")) {
          try {
            IO.println("The average is %d".formatted(sum / count));
          } catch (ArithmeticException e) {
            IO.println(
                "You entered %d numbers, for which we cannot calculate an average".formatted(
                    count));
          }
          break;
        }
        sum += Integer.parseInt(input);
        count += 1;
      } catch (NumberFormatException e) {
        IO.println("Invalid number. Enter another");
      }
    }
  }
}
