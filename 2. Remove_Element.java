import java.util.Arrays;

class remove_element {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;

        while (i < len) {
            if (nums[i] == val) {
                nums[i] = nums[len - 1];  // Swap with last valid element
                len--;  // Reduce the size (ignore last element)
            } else {
                i++;  // Move to next index
            }
        }
        return len;  // New length after removing all occurrences of val
    }

    public static void main(String[] args) {
        remove_element sol = new remove_element();

        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;

        int newLength = sol.removeElement(nums, val);

        // Print the modified array (only first `newLength` elements are valid)
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
