public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // int unique = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (i > 0) {
        //         int j = i;
        //         while (j < nums.length && nums[j] <= nums[i - 1])
        //             j++;
        //         if (j < nums.length) {
        //             int temp = nums[j];
        //             nums[j] = nums[i];
        //             nums[i] = temp;
        //             unique++;
        //         }
        //         if (j + 1 == nums.length)
        //             break;
        //     } else
        //         unique++;
        // }
        // return unique;

        /*
         * int count = 0;
         * for (int i = 0; i < nums.length; i++) {
         * int n = nums[i];
         * if (i == 0) {
         * count++;
         * continue;
         * }
         * if (n != nums[i - 1])
         * nums[count++] = n;
         * }
         * return count;
         */

        int count = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && nums[i] == nums[i + 1])
                continue;
            nums[count++] = nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
    }
}
