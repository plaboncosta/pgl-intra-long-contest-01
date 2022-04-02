import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (hmap.containsKey(num)) {
                res[0] = hmap.get(num);
                res[1] = i;
                return res;
            }
            hmap.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 15, 7};
        int[] result = twoSum(arr, 9);
        System.out.println(Arrays.toString(result));
    }
}

