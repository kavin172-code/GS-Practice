public class Question11 {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(findMin(arr1)); // Output: 1
        System.out.println(findMin(arr2)); // Output: 1
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[left] <= nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
