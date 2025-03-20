import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = solution.removeElement(nums, val);

        System.out.println("Output: " + k);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
