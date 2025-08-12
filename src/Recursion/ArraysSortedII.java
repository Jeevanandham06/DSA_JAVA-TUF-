package Recursion;

import java.util.ArrayList;
import java.util.List;

class Arrayssorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() <= 1) {
            return true;
        }
        return sort(nums, 0, 1);
    }

    private boolean sort(ArrayList<Integer> nums, int left, int right) {
        if (right >= nums.size()) {
            return true;
        }
        if (nums.get(left) > nums.get(right)) {
            return false;
        }
        return sort(nums, left + 1, right + 1);
    }
}

public class ArraysSortedII {
    public static void main(String[] args) {
        Arrayssorted sorted = new Arrayssorted();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 5, 3, 4, 5));
        boolean result = sorted.isSorted(nums);
        System.out.print(result ? "Array is Sorted" : "Array is Not sorted");
    }
}
