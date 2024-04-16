package Searching;

public class Minimum_Num {
    public static void main(String[] args) {
       int[] arr = {10,5,-10,20,24};
       int ans =minimum(arr);
       System.out.println(ans);

    }
    static int minimum(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }return min;
    }
}
