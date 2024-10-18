public class Question21 {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static int[] addFractions(int numerator1, int denominator1, int numerator2, int denominator2) {
        int commonDenominator = denominator1 * denominator2;

        int newNumerator = (numerator1 * denominator2) + (numerator2 * denominator1);

        int divisor = gcd(newNumerator, commonDenominator);

        return new int[]{newNumerator / divisor, commonDenominator / divisor};
    }

    public static void main(String[] args) {
        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println("Result 1: " + result1[0] + "/" + result1[1]);

        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println("Result 2: " + result2[0] + "/" + result2[1]);
    }
}
