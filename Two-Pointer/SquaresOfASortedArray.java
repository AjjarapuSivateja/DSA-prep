public class SquaresOfASortedArray {
    //977. Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right=n-1;
        int pos=n-1;
        while(left<=right){

            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare>rightSquare){
                //if negative numbers are sorted, the square of least negative number will be highest among negative numbers
                res[pos]=leftSquare;
                left++;
            }else{
                res[pos]=rightSquare;
                right--;
            }
            pos--;
        }
        return res;
    }
}
