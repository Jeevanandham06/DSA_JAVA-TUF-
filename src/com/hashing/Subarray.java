package com.hashing;

import java.util.HashMap;

class prefixsum {
    public static int subarraypossible(int[] nums, int k) {
        HashMap<Integer, Integer> prefixsumMap = new HashMap<>();
        int currentsum = 0, subarraycount = 0;
        prefixsumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];

            int sumtoremove = currentsum - k;
            subarraycount += prefixsumMap.getOrDefault(sumtoremove, 0);

            prefixsumMap.put(currentsum, prefixsumMap.getOrDefault(currentsum, 0) + 1);

        }
        return subarraycount;
    }

}

public class Subarray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int k = 6;
        int result = prefixsum.subarraypossible(nums, k);
        System.out.print("Possible Sum Subarrays are:" + result);
    }
}
