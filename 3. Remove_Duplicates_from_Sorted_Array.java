import java.util.Arrays;

class remove_duplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        remove_duplicates sol = new remove_duplicates();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = sol.removeDuplicates(nums);

        // Print the modified array (only first `newLength` elements are valid)
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
