function merge(nums1, m, nums2, n) {
    n > 0 && nums1.splice(-n);
    nums2.forEach(i => {
        let p = 0;
        if (nums1[0] > i) p = 0;
        else if (nums1[nums1.length - 1] < i) p = nums1.length;
        else p = nums1.findIndex(n => n > i);
        nums1.splice(p, 0, i);
    });
    console.log(nums1);
}

num1 = [0];
num2 = [1];
m = 0, n = 1;
merge(num1, m, num2, n);