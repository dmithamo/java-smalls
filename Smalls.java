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

  // ComputeAverage avgCalc = new ComputeAverage();
  // avgCalc.computeAvg();

  // FakeC c = new FakeC();
  // c.checkVars();

  for (int i = 0; i < 10; i++) {
    User a = new User("User %d".formatted(i));
    System.out.println(a.getIdentity());
  }
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

class FakeC {
  int age;

  public void checkVars() {
    System.out.println(age);
  }
}

class User {
  private int userID;
  private String username;
  private static int nextID;

  public User(String username) {
    this.username = username;
    nextID++;
    userID = nextID;
  }

  public String getIdentity() {
    return "[%d] %s".formatted(userID, username);
  }
}
