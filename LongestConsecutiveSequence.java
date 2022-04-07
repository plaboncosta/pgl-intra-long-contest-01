import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (i > 0) {
                while (i < nums.length && (nums[i] - 1 == nums[i - 1] || nums[i] == nums[i - 1])) {
                    if (nums[i] != nums[i - 1]) count++;
                    i++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};
        System.out.println(longestConsecutive(arr));
    }
}
