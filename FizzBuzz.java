public class FizzBuzz {

  public static void main(String[] args) {
    int max = 1000;
    int divA = 3;
    int divB = 5;
    String messageA = "Fizz";
    String messageB = "Buzz";

    int v = 1;
    while (v <= max) {
      if (v % (divA * divB) == 0) {
        System.out.println(messageA + messageB);
      } else if (v % divA == 0) {
        System.out.println(messageA);
      } else if (v % divB == 0) {
        System.out.println(messageB);
      } else {
        System.out.println(v);
      }
      v += 1;
    }
  }
}
