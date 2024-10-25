public class Question23 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 10, 2, 0, 20, 4},
                {1, 0, 0, 30, 2, 5},
                {0, 10, 4, 0, 2, 0},
                {1, 0, 2, 20, 0, 4}
        };

        int maxSum = findMaxPathSum(matrix);
        System.out.println("Maximum Path Sum: " + maxSum); // Output: 74
    }

    public static int findMaxPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];


        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }


        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int maxPrev = dp[i - 1][j];
                if (j > 0) {
                    maxPrev = Math.max(maxPrev, dp[i - 1][j - 1]);
                }
                if (j < n - 1) {
                    maxPrev = Math.max(maxPrev, dp[i - 1][j + 1]);
                }
                dp[i][j] = matrix[i][j] + maxPrev;
            }
        }

        int maxPathSum = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            maxPathSum = Math.max(maxPathSum, dp[m - 1][j]);
        }

        return maxPathSum;
    }
}
