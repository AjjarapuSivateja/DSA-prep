package Searching;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {90,27,8,10},
                {18,25,36,20}
        };
        int target =45;

        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] arr,int target){
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }return new int[]{-1,-1};
    }
}
