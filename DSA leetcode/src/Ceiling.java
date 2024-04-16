import java.util.Arrays;
//Ceiling-The smallest element of array greater or equal to target
//array - {1,3,5,9,10}, target =8
//since 8 is not equal to any element in array, the ceiling is 9(smallest element in array greater than 8)
//the index of 9 is 3
public class Ceiling {
    public static void main(String[] args) {
      int[] arr={1,3,5,9,10};
      int target=8;
        System.out.println(ceilingnum(arr,target));

    }
    public static int ceilingnum(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid = (start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;

            }else{
                return mid;
            }
        }return start;
    }
}
