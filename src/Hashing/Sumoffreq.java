package Hashing;

import java.util.HashMap;

public class Sumoffreq {
    static class Solution {
        public int sumHighestAndLowestFrequency(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int freq : map.values()) {
                max = Math.max(max, freq);
                min = Math.min(min, freq);
            }

            return max + min;
        }
    }
    public static  void main(String[]args){
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int[] nums2 = {4, 4, 5, 5, 6};

        System.out.println(solution.sumHighestAndLowestFrequency(nums1));
        System.out.println(solution.sumHighestAndLowestFrequency(nums2));
    }
}


