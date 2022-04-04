import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1, target = -nums[i];
            while (left < right) {
                int total = nums[left] + nums[right];
                if (total > target) {
                    right--;
                } else if (total < target) {
                    left++;
                } else {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 0};
        System.out.println(threeSum(arr));
    }
}
