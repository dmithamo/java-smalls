public class BirthdayShared {

    public static void main(String[] args) {
        int popSize = Integer.parseInt(args[0]);
        int numOfTrials = Integer.parseInt(args[1]);
        int numOfTrialsWithSharedBday = 0;

        for (int i = 0; i < numOfTrials; i++) {
            int[] bdayFreq = new int[365];

            for (int p = 0; p < popSize; p++) {
                int bday = (int) (Math.random() * 365);
                bdayFreq[bday]++;

                if (bdayFreq[bday] > 1) {
                    numOfTrialsWithSharedBday++;
                    break;
                }
            }
        }

        System.out.printf(
            "Population: %d | Trials: %d%n",
            popSize,
            numOfTrials
        );
        System.out.println(
            "Chances: %.15f".formatted(
                (double) numOfTrialsWithSharedBday / numOfTrials
            )
        );
    }
}
