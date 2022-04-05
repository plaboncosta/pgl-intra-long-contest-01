import java.util.Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;

        /*TC - O(N)
        SC - O(1)*/

        /*Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];

        TC - O(NlogN)
        SC - O(1)
        */
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 1, 2, 2};
        System.out.println(singleNumber(arr));
    }
}
