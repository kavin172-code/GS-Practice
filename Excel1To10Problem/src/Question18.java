public class Question18 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {0,1,3,4};
        System.out.println(smallestMissingInteger(a));
        System.out.println(smallestMissingInteger(b));
    }

    private static int smallestMissingInteger(int[] a) {

        for(int i=0;i<a.length;i++){
            if(i<a[i]){
                return i;
            }
        }
        return -1;
    }
    // Approach 2  logn
    public static class SmallestMissingInteger {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4};    // Return 0
            int[] arr2 = {0, 1, 3, 4};    // Return 2
            int[] arr3 = {0, 1, 2, 3};    // Return 4

            System.out.println(findSmallestMissing(arr1)); // Output: 0
            System.out.println(findSmallestMissing(arr2)); // Output: 2
            System.out.println(findSmallestMissing(arr3)); // Output: 4
        }

        public static int findSmallestMissing(int[] nums) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (nums[mid] == mid) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return left;
        }
    }
}
