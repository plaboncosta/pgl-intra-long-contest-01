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

        /*int mj = (nums.length + 1) / 2;
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
        return n >= mj ? k : 0;*/

        /*Arrays.sort(nums);
        return nums[nums.length / 2];*/

        /*HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else hm.put(num, 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > (nums.length / 2)) {
                res = entry.getKey();
                break;
            }
        }
        return res;*/

        int selected = 0, count = 0;
        for (int num : nums) {
            if (count == 0) selected = num;
            if (selected == num) count++;
            else count--;
        }

        return selected;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 1, 1, 1,};
        System.out.println(majorityElement(arr));
    }
}
