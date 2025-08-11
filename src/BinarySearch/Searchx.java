package BinarySearch;
import java.util.*;


class search {
    public static int SearchXinSortedArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + (high-low) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class Searchx {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 12;
        int result = search.SearchXinSortedArray(nums, target);
        System.out.print("element found in the index at : " + result);
    }
}
