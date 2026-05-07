
/**
 * Write a program RollLoadedDie that prints the result of rolling a loaded
 * die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and the
 * probability of
 * getting a 6 is 3/8.
 */

import java.util.Arrays;

/**
 * RollLoadedDie
 */
public class RollLoadedDie {

  public static void main(String[] args) {
    System.out.println("You rolled a " + rollDie());
    int maxRolls = 10_000;
    int[] frequencies = checkFrequencies(maxRolls);
    int[] percentages = new int[6];

    for (int i = 0; i < 6; i++) {
      percentages[i] = (int) (((double) frequencies[i] / (double) maxRolls) * 100);
    }
    System.out.printf("FREQUENCIES [OUT OF %d]: %s\n", maxRolls, Arrays.toString(frequencies));
    System.out.printf("PERCENTAGES: %s\n", Arrays.toString(percentages));
  }

  public static int rollDie() {
    int roll = (int) (Math.random() * 8);
    if (roll > 4) {
      return 6;
    } else {
      return roll + 1;
    }
  }

  public static int[] checkFrequencies(int maxRolls) {
    int[] frequencies = new int[6];

    for (int i = 0; i < maxRolls; i++) {
      frequencies[rollDie() - 1]++;
    }

    return frequencies;
  }
}
