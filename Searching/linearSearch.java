package Searching;

public class linearSearch {
    //search in the array: return the index if item found
    //else return -1
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0) {

            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[] nums= {10,5,3,15,87,-11,21,32,1};
        int target = -5;
       int ans= linearsearch(nums,target);
       System.out.println(ans);
    }
}
