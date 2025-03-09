import java.util.Arrays;

public class TestTwoSum {
    public static void main(String[] args) {
        // Test case input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Expected output: [0, 1] (indices of the numbers that add up to the target)
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        // Print the result
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(result));

        // Check if the result matches the expected output
        int[] expected = {0, 1};
        if (Arrays.equals(result, expected)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed.");
        }
    }
}

// Example Solution class (LeetCode 01)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}
