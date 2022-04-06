import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ml = nums1.length;
        if (ml > 0) {
            int c = ml - 1;
            for (int j : nums2) {
                nums1[c] = j;
                c--;
            }
        } else if (m == 0) {
            if (n > 0) {
                nums1[0] = nums2[0];
            }
        }
        if (ml > 1) {
            for (int i = 0; i < ml; i++) {
                if (i > 0) {
                    int p = i;
                    while (p > 0 && nums1[p - 1] > nums1[p]) {
                        int temp = nums1[p - 1];
                        nums1[p - 1] = nums1[p];
                        nums1[p] = temp;
                        p--;
                    }
                }

            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {0,0,0,0,0}, nums2 = {1,2,3,4,5};
        int m = 1, n = 1;
        merge(nums1, m, nums2, n);
    }
}
