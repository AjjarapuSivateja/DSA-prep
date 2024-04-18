//find the target element in infinite array.i.e., we cannot use length of array
public class infinitArray {
    public static void main(String[] args) {
       int[] arr={1,2,4,5,8,10,13,14,16,17,20};
       int target=10;
        System.out.println(findingRange(arr,target));

    }
    static int findingRange(int[] arr,int target){
        //first start with size of 2
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            //end is end+double the size of previous range
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
