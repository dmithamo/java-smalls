// Which integer between 1 and 10000 has the largest number of divisors, and how
// many divisors does it have? Write a program to find the answers and print out
// the results. It is
// possible that several integers in this range have the same, maximum number of
// divisors.
// Your program only has to print out one of them.

class CountDivisors {
  public static void main(String[] args) {
    int hasMaxDivisors = 2;
    int maxDivisorsCount = 0;

    for (int i = 3; i <= 10_000_000; i++) {
      int countDivisors = 0;
      int j = 2;
      while (j < i) {
        if (i % j == 0) {
          countDivisors++;
        }
        j++;
      }

      System.out.printf("%d ==> %d\n", i, countDivisors);
      if (countDivisors > maxDivisorsCount) {
        hasMaxDivisors = i;
        maxDivisorsCount = countDivisors;
      }
    }
    System.out.printf("\n\nWith max divisors %d ==> %d\n", hasMaxDivisors, maxDivisorsCount);
  }
}
