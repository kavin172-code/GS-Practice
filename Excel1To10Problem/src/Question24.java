public class Question24 {
    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        Result result = longestPalindrome(str);
        System.out.println("Longest Palindrome: \"" + result.palindrome + "\", Length: " + result.length);
    }

    static class Result {
        String palindrome;
        int length;

        Result(String palindrome, int length) {
            this.palindrome = palindrome;
            this.length = length;
        }
    }

    public static Result longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return new Result("", 0);
        }

        int start = 0, maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > maxLength) {
                maxLength = len;
                start = i - (maxLength - 1) / 2;
            }
        }

        return new Result(s.substring(start, start + maxLength), maxLength);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
