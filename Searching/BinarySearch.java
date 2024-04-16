package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={-15,-10,-5,-1,0,2,3,4,15,16,22,50};
        int target=50;
        System.out.println(binarySearch(arr,target));

    }
    static int binarySearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //int mid=(start+end)/2;  This may exceed the int range in java so
            int mid =start+((end-start)/2);

            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
