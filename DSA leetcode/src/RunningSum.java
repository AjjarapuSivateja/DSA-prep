public class RunningSum {
    //1480 leetcode
    public static void main(String[] args) {
       int a[] = {1,1,1,1,1};
      int ans[]= runningSum(a);
      for(int i=0;i<ans.length;i++){
          System.out.println(ans[i]);
      }
    }
    public static int[] runningSum(int[] nums) {
        int a= nums.length;
        int ans[] = new int[a];
        ans[0]=nums[0];
        for(int i=1;i<ans.length;i++){
            ans[i] = nums[i]+ans[i-1];
        }
        return ans;
    }
}
