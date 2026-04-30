void main() {
  int divisorCount = 0;
  int N;
  try {
    N = Integer.parseInt(IO.readln("Enter a number: "));
  } catch (NumberFormatException e) {
    IO.println("Unable to convert your input into a number: " + e);
    System.exit(1);
    N = 0;
  }

  for (int i = 2; i < N; i++) {
    if (N % i == 0) {
      divisorCount++;

      if (i % 1_000_000 == 0) {
        IO.println(".");
      }
    }
  }

  IO.println("Divisors: " + divisorCount);
}
