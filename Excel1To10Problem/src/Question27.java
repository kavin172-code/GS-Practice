public class Question27 {
    public static int findLoopLength(int[] arr) {
        int n = arr.length;
        int slow = 0, fast = 0;

        while (true) {
            slow = move(slow, arr, n);
            fast = move(fast, arr, n);
            fast = move(fast, arr, n);

            if (slow == fast) {
                break;
            }
            if (slow < 0 || slow >= n || fast < 0 || fast >= n) {
                return -1;
            }
        }

        int loopLength = 0;
        do {
            slow = move(slow, arr, n);
            loopLength++;
        } while (slow != fast);

        return loopLength;
    }

    private static int move(int index, int[] arr, int n) {
        if (arr[index] >= 0) {
            return (index + arr[index]) % n;
        } else {
            return (index - arr[index]) % n;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int result = findLoopLength(arr);

        System.out.println("Length of the loop: " + result);
    }
}
