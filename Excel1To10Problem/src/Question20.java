import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        String str = "aabbbbCCddd";
        System.out.println(Arrays.toString(findStartIndexAndLengthOfSubString(str)));
    }

    public static int[] findStartIndexAndLengthOfSubString(String s) {
        if (s == null || s.isEmpty()) {
            return new int[]{-1, 0};
        }

        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxIndex = startIndex;
                }
                currentLength = 1;
                startIndex = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxIndex = startIndex;
        }

        return new int[]{maxIndex, maxLength};
    }
}
