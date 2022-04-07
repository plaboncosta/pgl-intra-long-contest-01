import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * int ml = nums1.length;
         * if (ml > 0) {
         * int c = ml - 1;
         * for (int j : nums2) {
         * nums1[c] = j;
         * c--;
         * }
         * } else if (m == 0) {
         * if (n > 0) {
         * nums1[0] = nums2[0];
         * }
         * }
         * if (ml > 1) {
         * for (int i = 0; i < ml; i++) {
         * if (i > 0) {
         * int p = i;
         * while (p > 0 && nums1[p - 1] > nums1[p]) {
         * int temp = nums1[p - 1];
         * nums1[p - 1] = nums1[p];
         * nums1[p] = temp;
         * p--;
         * }
         * }
         * 
         * }
         * }
         */

        int j = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);

        // if (m + n - m >= 0) System.arraycopy(nums2, 0, nums1, m, m + n - m);
        // Arrays.sort(nums1);

        // int lastA = m - 1, lastB = n - 1, curr = nums1.length - 1;
        // while (lastA >= 0 && lastB >= 0) {
        // if (nums1[lastA] > nums2[lastB]) {
        // nums1[curr] = nums1[lastA];
        // lastA--;
        // } else {
        // nums1[curr] = nums2[lastB];
        // lastB--;
        // }
        // curr--;
        // }
        // while (lastB >= 0) {
        // nums1[curr] = nums2[lastB];
        // lastB--;
        // curr--;
        // }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = { -1, 0, 1, 1, 0, 0, 0, 0, 0 }, nums2 = { -1, 0, 2, 2, 3 };
        int m = 4, n = 5;
        merge(nums1, m, nums2, n);
    }
}
