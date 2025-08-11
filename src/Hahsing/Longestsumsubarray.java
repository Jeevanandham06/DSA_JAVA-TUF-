package Hahsing;

import java.util.HashMap;

class longest {
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Long,Integer >map =new HashMap<>();
        long sum =0;
        int maxlen=0;
        for(int i =0 ; i<nums.length;i++){
            sum+=nums[i];

            if(sum==k){
                maxlen=i+1;
            }
            if(map.containsKey(sum-k)){
                int prevIndex=map.get(sum-k);
                maxlen=Math.max(maxlen,i-prevIndex);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i );

            }
        }
        return maxlen;
    }

}

public class Longestsumsubarray {
    public static void main(String[]args){
        int [] nums={10,5,2,7,1,9};
        int k =15;

        int result= longest.longestSubarray(nums, k );
         System.out.print("Longestsumsubarray:"+result);
    }

}
