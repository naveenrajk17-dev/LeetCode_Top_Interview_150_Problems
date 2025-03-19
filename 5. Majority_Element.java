import java.util.*;

class majority_Element {
    public int majorityElement(int[] nums) {
        int candidate = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                candidate = num;
            }
            votes += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        majority_Element sol = new majority_Element();

        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + sol.majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + sol.majorityElement(nums2)); // Output: 2
    }
}
