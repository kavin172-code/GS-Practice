public class Question10 {
    public static void main(String[] args) {
        System.out.println(isValidDigit("123"));
        System.out.println(isValidDigit("-123"));
        System.out.println(isValidDigit("1a23"));

    }

    public static int isValidDigit(String str) {
        str = str.trim();
        if (str.isEmpty()) return -1;

        int sign = 1;
        int index = 0;
        int num = 0;

        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        }

        while (index < str.length()) {
            char c = str.charAt(index);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                index++;
            } else {
                return -1;
            }
        }

        return sign * num;
    }
}
