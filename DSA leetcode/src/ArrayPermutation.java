public class ArrayPermutation {
    //problem 1920 leetcode
    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int a[] = buildArray(nums);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = nums[nums[i]];
        }
        return a;
    }
}
