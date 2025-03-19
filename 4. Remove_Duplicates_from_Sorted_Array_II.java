import java.util.Arrays;

class remove_Duplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count < 2 || num != nums[count - 2]) {
                nums[count++] = num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        remove_Duplicates obj = new remove_Duplicates();

        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        int newLength = obj.removeDuplicates(nums);

        // Print the modified array (only first `newLength` elements are valid)
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
