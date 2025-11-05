public class TripletsWithSmallerSum {
    //GeeksForGeeks- Triplets with Smaller Sum
    long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                long add= arr[i]+arr[left]+arr[right];
                if(add<sum){
                    count  = count+(right-left);
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
    }
}
