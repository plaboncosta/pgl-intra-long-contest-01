import java.util.*;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        /*int n = (nums.length + 1) / 2;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int num : nums) {
            List<Integer> ls;
            if (hm.containsKey(num)) ls = hm.get(num);
            else ls = new ArrayList<>();
            ls.add(num);
            hm.put(num, ls);
        }
        Object[] keys = hm.keySet().toArray();
        int res = 0;
        for (Object key : keys) {
            if (hm.get(key).size() >= n) {
                res = (int) key;
                break;
            }
        }
        return res;*/

        int mj = (nums.length + 1) / 2;
        int n = 1, k = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, t = nums[i], c = 1;
            while (l < nums.length && nums[l] == t) {
                c++;
                l++;
            }
            n = Math.max(c, n);
            k = n > c ? k : t;
        }
        return n >= mj ? k : 0;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(majorityElement(arr));
    }
}
