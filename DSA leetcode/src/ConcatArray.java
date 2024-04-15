public class ConcatArray {
    //1929 leetcode
    public static void main(String[] args) {
        int a[]= {1,3,2,1};
       int[] b= getConcatenation(a);
       for(int i=0;i<b.length;i++) {
           System.out.println(b[i]);
       }

    }
    public  static int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int ans[]= new int[2*len];
        for(int i=0;i<len;i++){
            ans[i]=nums[i];
        }
        int j=0;
        for(int i=len;i< ans.length;i++){
            ans[i]=nums[j];
            j++;
        }

        return ans;

    }
}
