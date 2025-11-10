package SlidingWindow;

public class MinimumSizeSubArray {
    //209. Minimum Size Subarray Sum
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int sum =0;
        int minRes = Integer.MAX_VALUE;
        int n = nums.length;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                minRes = Math.min(minRes,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (minRes==Integer.MAX_VALUE)?0:minRes;
    }
}
