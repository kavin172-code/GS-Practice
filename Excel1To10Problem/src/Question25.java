import java.util.Arrays;

public class Question25 {
    public static void main(String[] args) {
        int numberOfBulbs = 100;
        boolean[] bulbs = new boolean[numberOfBulbs];

        for (int iteration = 1; iteration <= numberOfBulbs; iteration++) {
            for (int i = iteration - 1; i < numberOfBulbs; i += iteration) {
                bulbs[i] = !bulbs[i];
            }
        }

        int countOn = 0;
        for (boolean bulb : bulbs) {
            if (bulb) {
                countOn++;
            }
        }

        System.out.println("Number of bulbs remaining on: " + countOn); // output 10
    }
}
