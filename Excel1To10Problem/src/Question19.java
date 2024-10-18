import java.util.HashMap;

public class Question19 {
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(50, 22));    // Output: "2.(27)"
        System.out.println(fractionToDecimal(1, 2));      // Output: "0.5"
        System.out.println(fractionToDecimal(1, -2));     // Output: "-0.5"
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        if (numerator < 0 || denominator < 0) result.append("-");

        long num = Math.abs((long) numerator);
        long denom = Math.abs((long) denominator);
        result.append(num / denom);

        long remainder = num % denom;
        if (remainder == 0) return result.toString();

        result.append(".");
        HashMap<Long, Integer> remainderMap = new HashMap<>();

        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                int pos = remainderMap.get(remainder);
                result.insert(pos, "(");
                result.append(")");
                break;
            }
            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / denom);
            remainder %= denom;
        }

        return result.toString();
    }
}
