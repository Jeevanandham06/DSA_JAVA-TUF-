package com.hashing;

import java.util.HashSet;

public class Longestsquence {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int result = Solution.longestConsectiveSequence(nums);
        System.out.print("Longest Consective Sequence in Array: " + result);
    }

    class Solution {
        public static int longestConsectiveSequence(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int maxlength = 0;
            for (int num : nums) {
                if (!set.contains(num - 1)) {
                    int currNum = num;
                    int currStreak = 1;

                    while (set.contains(currNum + 1)) {
                        currNum++;
                        currStreak++;
                    }
                    maxlength = Math.max(maxlength, currStreak);
                }
            }
            return maxlength;
        }
    }
}
