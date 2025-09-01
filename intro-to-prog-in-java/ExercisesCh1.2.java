/*
Introduction to Programming in Java 2nd Edition.pdf
*/

public class ExercisesCh1 {
  public static void main(String[] args) {
    // Ex122.main(args);
    // Ex123.main(args);
    // Ex129.main(args);
    // Ex1210.main(args);
    // Ex1214.main(args);
    // Ex1218.main(args);
    Ex1219.main(args);
  }
}

/*

1.2.2 Write a program that uses Math.sin() and Math.cos() to check that the
value of cos2 + sin2 is approximately 1 for any entered as a command-line argu-
ment. Just print the value. Why are the values not always exactly 1?

*/
public class Ex122 {
  public static void main(String[] args) {
    double angle = Double.parseDouble(args[0]);
    System.out.println("Math.cos^2(a) + Math.sin^2(a) == 1? " + isApproxOne(angle));
  }

  public static boolean isApproxOne(double angle) {
    double angleInRadians = Math.toRadians(angle);
    double v = Math.pow(Math.cos(angleInRadians), 2) + Math.pow(Math.sin(angleInRadians), 2);
    System.out.println("v = " + v);
    return v == 1;
  }
}

/*

1.2.3 Suppose that a and b are boolean variables. Show that the expression
(!(a && b) && (a || b)) || ((a && b) || !(a || b))
evaluates to true.

*/
public class Ex123 {
  public static void main(String[] args) {
    System.out.println(
        "(!(a && b) && (a || b)) || ((a && b) || !(a || b)) =  true? "
            + evalAlwaysTrue(true, false));

    System.out.println(
        "(!(a && b) && (a || b)) || ((a && b) || !(a || b)) =  true? "
            + evalAlwaysTrue(false, true));

    System.out.println(
        "(!(a && b) && (a || b)) || ((a && b) || !(a || b)) =  true? "
            + evalAlwaysTrue(false, false));

    System.out.println(
        "(!(a && b) && (a || b)) || ((a && b) || !(a || b)) =  true? "
            + evalAlwaysTrue(true, true));
  }

  public static boolean evalAlwaysTrue(boolean a, boolean b) {
    return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
  }
}

/*

   1.2.9 What does each of the following print?
    a. System.out.println('b');
    b. System.out.println('b' + 'c');
    c. System.out.println((char) ('a' + 4));

    EXPLN: Operator overlaoding; diff methods defined for .println depending on
    type of arg it is called with.
    There exists one for .println(char) -> prints the char [w/o type conversion]
*/

public class Ex129 {
  public static void main(String[] args) {
    System.out.println('b');
    System.out.println('b' + 'c');
    System.out.println((char) ('a' + 4));
    System.out.println('a' + 4);
  }
}

/*

1.2.10 Suppose that a variable a is declared as int a = 2147483647 (or equiva-
lently, Integer.MAX_VALUE). What does each of the following print?
   a. System.out.println(a);
   b. System.out.println(a+1); # Wraps around to max -ve
   c. System.out.println(2-a); # Seems similar to -a + 2 -> max -ve plus 2
   d. System.out.println(-2-a); # max -ve minus 2 -> wraps around to max +ve -1 [-1-1-a]
   e. System.out.println(2*a); # This one I had to Gemini/Google. Needs re-reading
   f. System.out.println(4*a);

   EXPLN: Integer overflow
*/
public class Ex1210 {
  public static void main(String[] args) {
    int a = Integer.MAX_VALUE;
    System.out.println(a);
    System.out.println(a + 1);
    System.out.println(2 - a);
    System.out.println(-2 - a);
    System.out.println(2 * a);
    System.out.println(4 * a);
  }
}

/*

1.2.14 Write a program that takes two positive integers as command-line
arguments and prints true if either evenly divides the other.
*/
public class Ex1214 {
  public static void main(String[] args) {

    if (args.length < 2) {
      System.out.println("You must supply at least two numbers to continue");
    }

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    if ((a % b == 0) || (b % a == 0)) {
      System.out.println("[TRUE]");
    }
  }
}

/*

1.2.18 Write a program that takes two integer command-line arguments x and y
and prints the Euclidean distance from the point (x, y) to the origin (0, 0).

*/

public class Ex1218 {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Provide the x, y coordinates of the point");
    } else {
      double x = Double.parseDouble(args[0]);
      double y = Double.parseDouble(args[1]);

      System.out.println(
          "Euclidian distance to ("
              + x
              + ", "
              + y
              + ") from (0, 0): "
              + Math.sqrt((Math.pow((x - 0), 2) + Math.pow((y - 0), 2))));
    }
  }
}

/*

1.2.19 Write a program that takes two integer command-line arguments a and b
and prints a random integer between a and b, inclusive.

*/

public class Ex1219 {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Provide the upper and lower limits of the range");
    } else {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      int lower = Math.min(a, b);
      int upper = Math.max(a, b);

      System.out.println(
          "Random number in the range ["
              + lower
              + ", "
              + upper
              + "] (incl.): "
              + (int) ((Math.random() * (upper - lower)) + lower));
    }
  }
}
