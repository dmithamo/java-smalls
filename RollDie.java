/**
 * How many times do you have to roll a pair of dice before they come up snake eyes?
 * You could do the experiment by rolling the dice by hand. Write a computer program that
 simulates the experiment.
 The program should report the number of rolls that it makes
 before the dice come up snake eyes. (Note: “Snake eyes” means that both dice show a
 value of 1.)
 * Davide J. Eck's book, exercise 3.1
 */

class RollDie {

    public static void main(String[] args) {
        int numTrials = 0;

        while (numTrials < 1000) {
            numTrials += 1;
            int first = rollDie();
            int second = rollDie();

            if (first == 1 && second == 1) {
                System.out.printf("Got in %d trials!\n", numTrials);
                break;
            }
        }
    }

    public static int rollDie() {
        return (int) (Math.random() * 6);
    }
}
