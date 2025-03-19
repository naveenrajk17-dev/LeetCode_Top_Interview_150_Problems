import java.util.Arrays;

class  Merge_sorted_array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m - 1, n2 = n - 1, n3 = nums1.length - 1;

        while (n3 >= 0) {
            int value1 = (n1 >= 0) ? nums1[n1] : Integer.MIN_VALUE;
            int value2 = (n2 >= 0) ? nums2[n2] : Integer.MIN_VALUE;

            if (value1 > value2) {
                nums1[n3] = value1;
                n1--;
            } else {
                nums1[n3] = value2;
                n2--;
            }
            n3--;  // Move to the next position in nums1
        }
    }

    public static void main(String[] args) {
        Merge_sorted_array sol = new  Merge_sorted_array();

        int[] nums1 = {1, 2, 3, 0, 0, 0};  // nums1 has extra space for nums2
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        sol.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
