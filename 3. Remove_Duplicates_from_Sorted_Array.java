import java.util.Arrays;

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count == 0 || num != nums[count - 1]) {
                nums[count++] = num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = sol.removeDuplicates(nums);

        // Print the modified array (only first `newLength` elements are valid)
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
