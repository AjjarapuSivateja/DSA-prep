//Floor-Biggest element  in array which is smaller or equal to target
//example array-{1,2,5,8,10,11,13}, target=9
//floor is 8, which is at index 3


public class Floor {
    public static void main(String[] args) {
       int[] arr={1,2,5,8,10,11,13};
       int target=9;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
