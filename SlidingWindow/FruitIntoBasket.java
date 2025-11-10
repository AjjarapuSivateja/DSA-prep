package SlidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    //904. Fruit Into Baskets
    public int totalFruit(int[] fruits) {
        int k=2;
        HashMap<Integer,Integer> f = new HashMap<>();
        int left =0;
        int maxLen = 0;
        int n = fruits.length;
        for(int right=0;right<n;right++){
            f.put(fruits[right],f.getOrDefault(fruits[right],0)+1);
            while(f.size()>k){
                f.put(fruits[left],f.get(fruits[left])-1);
                if(f.get(fruits[left])==0){
                    f.remove(fruits[left]);
                }
                left++;

            }

            maxLen=Math.max(maxLen,right-left+1);


        }
        return maxLen;

    }
}
