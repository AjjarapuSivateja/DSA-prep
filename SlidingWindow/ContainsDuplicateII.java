package SlidingWindow;

import java.util.HashMap;
//219. Contains Duplicate II
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left =0;
        for(int right =0;right<nums.length;right++){
            if(map.containsKey(nums[right])){
                left=map.get(nums[right]);
                if(Math.abs(right-left)<=k)return true;

            }
            map.put(nums[right],right);
        }
        return false;


    }
}
