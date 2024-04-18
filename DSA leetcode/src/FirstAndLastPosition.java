public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] a=findRange(arr,target);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
    static int[] findRange(int[] arr,int target){
        int[] ans={-1,-1};
        int start=firstAndLast(arr,target,true);
        int end =firstAndLast(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;


    }
    public static int firstAndLast(int[] arr,int target,boolean findFirstIndex){

        int ans=-1;
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid =(start+end)/2;
           if(target<arr[mid]){
               end=mid-1;
           }else if(target>arr[mid]){
               start=mid+1;
           }else{
               ans=mid;
               if(findFirstIndex){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
           }
       }
       return ans;

    }
}
