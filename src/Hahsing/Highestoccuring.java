package Hahsing;

import java.util.HashMap;
import java.util.Map;

public class Highestoccuring {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3,};
        int result = Solution.highestOccuring(nums);
        System.out.print("Highest Occuring element of the array:" + result);
    }

    class Solution {
        public static int highestOccuring(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            int maxFreq = Integer.MIN_VALUE;
            int maxele = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {


                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxele = entry.getKey();
                } else if (entry.getValue() == maxFreq) {
                    maxele = Math.min (maxele, entry.getKey());
                }


            }
            return maxele;
        }
    }
}

