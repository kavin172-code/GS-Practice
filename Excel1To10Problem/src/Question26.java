public class Question26 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int result = findPresident(n, k);
        System.out.println("The elected student is: " + result);
    }

    public static int findPresident(int n, int k) {
        return (josephus(n, k) + 1);
    }

    private static int josephus(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (josephus(n - 1, k) + k) % n;
        }
    }
}
